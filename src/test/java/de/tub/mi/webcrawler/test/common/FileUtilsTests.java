/**
 * 
 */
package de.tub.mi.webcrawler.test.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.tub.mi.webcrawler.common.FileUtils;

/**
 * @author mi
 *
 */
public class FileUtilsTests {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void canReadFileTest(String path) throws NullPointerException, SecurityException  {
		FileUtils.canReadFile("");
	}
	
	@Test
	public void canWriteFileTest(String path) throws NullPointerException, SecurityException  {
		
	}
	
	@Test
	public void deleteFileOrDirectoryTest(String path) throws SecurityException, NullPointerException {
		
	}

	@Test
	public void createDirectoryTest(String path) throws SecurityException, NullPointerException {
		
	}
		
	@Test
	public void createFileTest(String path) throws SecurityException, IOException {
		
	}
	
	@Test
	public void isSymbolicLinkTest(Path path) throws SecurityException, NullPointerException, Exception {
		
	}
}
