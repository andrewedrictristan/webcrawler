/**
 * 
 */
package de.tub.mi.webcrawler.test.common;

import java.io.IOException;
import java.nio.file.Path;

import org.junit.Assert;
import org.junit.Test;

import de.tub.mi.webcrawler.common.FileUtils;

/**
 * @author mi
 * Work in progress
 */
public class FileUtilsTests {
	
	@Test
	public void canReadFileTest(String path) {
		try {
			Assert.assertEquals(false, FileUtils.canReadFile(null));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("blabla"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("/withoutpermissions"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("/realfile"));		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void canWriteFileTest(String path)  {
		try {
			Assert.assertEquals(false, FileUtils.canWriteFile(null));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("blabla"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("/withoutpermissions"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("/realfile"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void deleteFileOrDirectoryTest(String path) {
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory(null));	
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("blabla"));

		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("/withoutpermissions"));
	
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("/realfile"));
			
	
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("blabla"));
	
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("/withoutpermissions"));
			
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("/realdir"));
	
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}

	@Test
	public void createDirectoryTest(String path) {
		try {
			Assert.assertEquals(false, FileUtils.createDirectory(null));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.createDirectory("blabla"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.createDirectory("/withoutpermissions"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.createDirectory("/realdir"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
	}

	@Test
	public void createFileTest(String path) {
		try {
			Assert.assertEquals(false, FileUtils.createFile(null));
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.createFile("blabla"));
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.createFile("/withoutpermissions"));
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.createFile("/realfile"));
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void isSymbolicLinkTest(Path path) {
		try {
			Assert.assertEquals(false, FileUtils.isSymbolicLink(null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.isSymbolicLink("blabla"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.isSymbolicLink("/withoutpermissions"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Assert.assertEquals(false, FileUtils.isSymbolicLink("/realfile"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
