package de.tub.mi.webcrawler.common.io.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesReader {
	
	private File propertiesFile = null;
	
	public PropertiesReader(String path) throws NullPointerException {
		this.propertiesFile = new File(path);
	}
	
	public String getPropertyValuebyKey(String key) {
		Properties properties = null;
		try {
			properties = this.getProperties();
			return (String) properties.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
		
	public HashMap<String, String> getAllProperties() throws FileNotFoundException, IOException {
		HashMap<String, String> propertiesHashMap = new HashMap<>();
		Properties properties = this.getProperties();
		for (final String name: properties.stringPropertyNames())
			propertiesHashMap.put(name, properties.getProperty(name));
		return propertiesHashMap;
	}
	
	public Map<String, String> getTopNProperties(long numberOfProperties) throws FileNotFoundException, IOException {
		HashMap<String, String> propertiesHashMap = new HashMap<>();
		Properties properties = this.getProperties();
		for (long i = 0; i < numberOfProperties && properties.propertyNames().hasMoreElements(); i++) {
			String name = (String) properties.propertyNames().nextElement();
			propertiesHashMap.put(name, properties.getProperty(name));
		}
		return propertiesHashMap;
	}
	
	public Map<String, String> getBottomNProperties(long numberOfProperties) throws FileNotFoundException, IOException {
		HashMap<String, String> propertiesHashMap = new HashMap<>();
		Properties properties = this.getProperties();
		long total = properties.stringPropertyNames().size();
		for (long i = 0; i < total - numberOfProperties && properties.propertyNames().hasMoreElements(); i++)
			properties.propertyNames().nextElement(); //skip all top elements
		while (properties.propertyNames().hasMoreElements()) {
			String name = (String) properties.propertyNames().nextElement();
			propertiesHashMap.put(name, properties.getProperty(name));
		}
		return propertiesHashMap;
	}
	
	public Map<String, String> getPropertiesInRange(long fromLine, long totalElements) throws FileNotFoundException, IOException {
		HashMap<String, String> propertiesHashMap = new HashMap<>();
		Properties properties = this.getProperties();
		long total = properties.stringPropertyNames().size();
		for (long i = 0; i < total - fromLine && properties.propertyNames().hasMoreElements(); i++)
			properties.propertyNames().nextElement(); //skip all top elements		
		for (long i = 0; i < totalElements && properties.propertyNames().hasMoreElements(); i++) {
			String name = (String) properties.propertyNames().nextElement();
			propertiesHashMap.put(name, properties.getProperty(name));
		}
		return propertiesHashMap;
	}
	
	private Properties getProperties() throws IOException, FileNotFoundException {
		Properties properties = null;
		try (FileInputStream inputStream = this.getFileInputStream()) {
			properties = new Properties();
			properties.load(inputStream);			
		}
		return properties;
	}
	
	private FileInputStream getFileInputStream() throws FileNotFoundException {
		return new FileInputStream(this.propertiesFile);
	}
}
