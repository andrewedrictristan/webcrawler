package de.tub.mi.webcrawler.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

/**
 * @author mi
 *
 */
/**
 * @author mi
 *
 */
/**
 * @author mi
 *
 */
public class FileUtils {
	
	/**
	 * @param file
	 */
	public static void deleteFile(File file) {
	
	}
	
	/**
	 * @param directory
	 */
	public static void deleteDirectory(File directory) {
		
	}
	
	/**
	 * 
	 */
	public static void createDirectory() {
		
	}
	
	
	/**
	 * @param parentDirectory is the location of the directory where you want to create a file.
	 * @param fileName is the name of the file you want to create.
	 * @throws IOException
	 */
	public static void createFile(String parentDirectory, String fileName) throws IOException {
		String path = String.join(parentDirectory, fileName);
		File f = new File(path);
		f.getParentFile().mkdirs(); 
		f.createNewFile();
	}
	
	/**
	 * @param path to the file
	 * @return true if the file is a symbolic link; false if the file does not exist, is not a symbolic link, or it cannot be determined if the file is a symbolic link or not.
	 * @throws Exception 
	 */
	public static boolean isSymbolicLink(Path path) throws Exception {
		if (path == null)
			throw new NullPointerException("The provided path is null.");	
		return Files.isSymbolicLink(path);
	}

}
