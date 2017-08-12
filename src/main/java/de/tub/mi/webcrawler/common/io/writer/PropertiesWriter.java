package de.tub.mi.webcrawler.common.io.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * @author Muhammad Imran
 * This class contains methods to perform different operations (e.g., write, append, delete, or update) of properties to the properties file.
 */
public class PropertiesWriter {
	
	private File propertiesFile = null;
	
	@SuppressWarnings("unused")
	private PropertiesWriter() {	
	}
	
	/**
	 * @param path
	 */
	public PropertiesWriter(String path) {
		try {
			this.propertiesFile = new File(path);
			if (! this.propertiesFile.exists())
				throw new IOException();
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	/**
	 * @param propertiesMap
	 */
	public void appendProperties(HashMap<String, String> propertiesMap) {
		Properties properties = new Properties();
		for (String key : propertiesMap.keySet()) {
			properties.setProperty(key, propertiesMap.get(key));
		}
		try (FileOutputStream outputStream = new FileOutputStream(this.propertiesFile, true)) {
			properties.store(new FileOutputStream(this.propertiesFile, true), null);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public void appendProperty(final String key, final String value) {
		Properties properties = new Properties();
		properties.setProperty(key, value);
		try (FileOutputStream outputStream = new FileOutputStream(this.propertiesFile, true)) {
			properties.store(new FileOutputStream(this.propertiesFile, true), null);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * @param key
	 * @param value
	 * @param comment
	 */
	public void appendProperty(final String key, final String value, final String comment) {
		Properties properties = new Properties();
		properties.setProperty(key, value);
		try (FileOutputStream outputStream = new FileOutputStream(this.propertiesFile, true)) {
			properties.store(new FileOutputStream(this.propertiesFile, true), comment);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * @param key
	 * @return
	 */
	public boolean deleteProperty(final String key) {
		return false;
	}
	
	/**
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean updateProperty(final String key, final String value) {
		return false;
	}	
}
