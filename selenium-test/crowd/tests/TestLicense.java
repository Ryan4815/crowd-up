import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.License;

public class TestLicense {

	private WebDriver driver;
	private License license;
	
	@Before
	public void setUp() { 
		driver = new FirefoxDriver(); 
		login = new License(driver);
		}
	
// This test with fail until a correct license key is provided
	@Test
	public void succeeded() {
		license.with("1234");
		assertTrue("license key authorized", 
					license.successMessagePresent());
	}
	
	@Test
	public void failed() {
		license.with("namfdgfdge");
		assertTrue("license key not authorized", 
					license.failureMessagePresent());
	}
	
	@After
	public void tearDown() { driver.quit(); }
}
