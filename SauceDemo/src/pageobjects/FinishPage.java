package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends BasePage {

	@FindBy(xpath = "//h2[@class= 'complete-header']")
	private WebElement txtSuccessfulMessage;
	
	public FinishPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSuccessfulMessage() {
		return txtSuccessfulMessage;

	}

}
