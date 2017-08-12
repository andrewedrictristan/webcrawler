/**
 * 
 */
package de.tub.mi.webcrawler.test.common;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import de.tub.mi.webcrawler.common.FileUtils;

/**
 * @author mi
 * Work in progress
 */
public class FileUtilsTests {
	
	@Test
	public void canReadFileTest1() {
		try {
			Assert.assertEquals(false, FileUtils.canReadFile("~/nonexistent10"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void canReadFileTest2() {
		try {
			Assert.assertEquals(true, FileUtils.canReadFile("/dev/null"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
	}
	
	@Test
	public void canReadFileTest3() {
		try {
			Assert.assertEquals(true, FileUtils.canReadFile("/home/mi/test200"));		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void canWriteFileTest2()  {
		try {
			Assert.assertEquals(true, FileUtils.canWriteFile("/dev/null"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void canWriteFileTest3()  {
		try {
			Assert.assertEquals(true, FileUtils.canWriteFile("/home/mi/test100"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void deleteFileOrDirectoryTest1() {
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("~/nonexistent1"));
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Test
	public void deleteFileOrDirectoryTest3() {
		try {
			Assert.assertEquals(true, FileUtils.deleteFileOrDirectory("/home/mi/test"));
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Test
	public void deleteFileOrDirectoryTest4() {
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("/home/mi/nonexistent21"));
	
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Test	
	public void deleteFileOrDirectoryTest5() {
		try {
			Assert.assertEquals(false, FileUtils.deleteFileOrDirectory("/dev/null"));
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Test
	public void deleteFileOrDirectoryTest6() {
		try {
			Assert.assertEquals(true, FileUtils.deleteFileOrDirectory("/home/mi/test3"));
		} catch (Exception ex) {
			ex.printStackTrace();			
		}
	}
	
	@Test
	public void createDirectoryTest1() {
		try {
			Assert.assertEquals(true, FileUtils.createDirectory("/home/mi/nonexistent5010"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void createDirectoryTest3() {
		try {
			Assert.assertEquals(false, FileUtils.createDirectory("/home/mi/test5"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void createFileTest1() {
		try {
			Assert.assertEquals(false, FileUtils.createFile("/home/mi/existing"));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void createFileTest2() {
		try {
			Assert.assertEquals(false, FileUtils.createFile("/dev/null"));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void createFileTest3() {
		try {
			Assert.assertEquals(true, FileUtils.createFile("/home/mi/newfile101"));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void isSymbolicLinkTest1() {
		try {
			Assert.assertEquals(false, FileUtils.isSymbolicLink("/home/mi/hellofile"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void isSymbolicLinkTest2() {
		try {
			Assert.assertEquals(false, FileUtils.isSymbolicLink("/dev/null"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void isSymbolicLinkTest3() {
		try {
			Assert.assertEquals(true, FileUtils.isSymbolicLink("/etc/systemd/system/syslog.service"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
