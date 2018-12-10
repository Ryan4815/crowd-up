package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	private WebDriver driver;
	
	# Central setup and teardown
	@Rule
	public ExternalResource resource = new ExternalResource() {
	
		@Override
		protected void before() throws Throwable {
			driver = new FirefoxDriver();
		}
		
		@Override
		protected void after() { driver.quit(); }
	};
	
	public Base(WebDriver driver) { this.driver = driver; }
	
	public void visit(String url) { driver.get(url); }
	
	public WebElement find(By locator) { return driver.findElement(locator); }
	
	public void click(By locator) { find(locator).click(); }
	
	public void type(String inputText, By locator) { find(locator).sendKeys(inputText); }
	
	public void submit(By locator) { find(locator).submit(); }
	
	public Boolean isDisplayed(By locator) {
		try {
			return find(locator).isDisplayed();
		}
		catch (org.openqa.selenium.NoSuchElementException exception) {
			return false;
		}
	}
	
	public Boolean waitForIsDisplayed(By locator, Integer... timeout) {
		try {
			waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
					timeout.length > 0 ? timeout[0] : null));
		} catch (org.openqa.selenium.TimeoutException exception) {
			return false;
		}
		return true;
	}
	
	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeout) {
		timeout = timeout != null ? timeout : 5;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(condition);
	}
	
}