import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.Login;

public class TestLogin {

	private WebDriver driver;
	private Login login;
	
	@Before
	public void setUp() { 
		driver = new FirefoxDriver(); 
		login = new Login(driver);
		}
	
	@Test
	public void succeeded() {
		login.with("name");
		assertTrue("pass condition", 
					login.successMessagePresent());
	}
	
	@Test
	public void failed() {
		login.with("namfdgfdge");
		assertTrue("pass condition", 
					login.failureMessagePresent());
	}
	
	@After
	public void tearDown() { driver.quit(); }
}