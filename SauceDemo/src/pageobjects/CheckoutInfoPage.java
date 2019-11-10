package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage extends BasePage {

	@FindBy(id = "first-name")
	private WebElement txtFirstName;

	@FindBy(id = "last-name")
	private WebElement txtLastName;

	@FindBy(id = "postal-code")
	private WebElement txtPostalCode;
	
	@FindBy(xpath = "//input[@value ='CONTINUE']")
	private WebElement btnContinue;

	public CheckoutInfoPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterCheckoutInfo(String firstName, String lastName, String zipCode) {
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtPostalCode.sendKeys(zipCode);
		btnContinue.click();
	}
}
