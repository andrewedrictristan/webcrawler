package de.tub.mi.webcrawler.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author mi
 * The FileUtils class contains many functionalities related to a file and directory.
 * Work in progress
 */

public class FileUtils {
	
	/**
	 * @param path is an absolute path to file to read.
	 * @return true if the current process has read permission to the file; false if it doesn't have read permission
	 * @throws NullPointerException
	 */
	public static boolean canReadFile(String path) throws NullPointerException, SecurityException  {
		File file = new File(path);
		return file.canRead();
	}
	
	/**
	 * @param path is an absolute path to file to write.
	 * @return true if the current process has write permission to the file; false if it doesn't have read permission
	 * @throws NullPointerException
	 */
	public static boolean canWriteFile(String path) throws NullPointerException, SecurityException  {
		File file = new File(path);
		return file.canWrite();
	}
	
	/**
	 * @param path is an absolute path to file or directory to delete.
	 * @return true if the current process has write permission to the file; false if it doesn't have read permission
	 * @throws NullPointerException
	 */
	public static boolean deleteFileOrDirectory(String path) throws SecurityException, NullPointerException {
		File file = new File(path);
		return file.delete();
	}

	/**
	 * @param parentDirectory is the location of the directory where you want to create a directory.
	 * @throws IOException
	 */
	public static boolean createDirectory(String path) throws SecurityException, NullPointerException {
		File directory = new File(path);
		return directory.mkdir();
	}
		
	/**
	 * @param parentDirectory is the location of the directory where you want to create a file.
	 * @throws IOException
	 */
	public static boolean createFile(String path) throws SecurityException, IOException {
		File f = new File(path);
		f.getParentFile().mkdirs(); 
		return f.createNewFile();
	}
	
	/**
	 * @param path to the file
	 * @return true if the file is a symbolic link; false if the file does not exist, is not a symbolic link, or it cannot be determined if the file is a symbolic link or not.
	 * @throws Exception 
	 */
	public static boolean isSymbolicLink(String filePath) throws SecurityException, NullPointerException, Exception {
		if (filePath == null)
			throw new NullPointerException("The provided path is null.");	
		Path path = Paths.get(filePath);
		return Files.isSymbolicLink(path);
	}

}
