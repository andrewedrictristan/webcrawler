package de.tub.mi.webcrawler.common.io.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;

public class UrlsReader {
	private File inputFile = null;
	private CharsetDecoder decodeTo =  null;
		
	public UrlsReader(File inputFile) {
		this.inputFile = inputFile;
	}
	
	public UrlsReader(File inputFile, CharsetDecoder decodeTo) {
		this(inputFile);
		this.decodeTo = decodeTo;
	}
	
	public String readAll() throws FileNotFoundException, IOException, Exception {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = getBufferedReader()) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			 }
		}
		return sb.toString();
	}
	
	public String readParticularLine(long lineNumber) throws FileNotFoundException, IOException {
		try (BufferedReader br = getBufferedReader()) {
			for (int i = 1; i < lineNumber; i++) {
				br.readLine();
			}
			String line = br.readLine();
			return line;
		}
	}
	
	private BufferedReader getBufferedReader() throws FileNotFoundException {
		return new BufferedReader(new FileReader(this.inputFile));
	}
}
