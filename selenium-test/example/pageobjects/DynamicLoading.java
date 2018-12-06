package pageobjects;

public class DynamicLoading extends Base {
	
	By startButton = By.cssSelector("#start button");
	By finishText = By.id("finish");
	
	public DynamicLoading(WebDriver driver) { super(driver); }
	
	public void loadExample(String exampleNumber) {
			visit("url" + exampleNumber);
			click(startButton);
	}
	
	public Boolean finishTextPresent() { return waitForIsDisplayed(finishText, 10); }
}
