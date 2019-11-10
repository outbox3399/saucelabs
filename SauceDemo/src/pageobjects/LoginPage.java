package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "user-name")
	private WebElement txtBoxUserName;

	@FindBy(id = "password")
	private WebElement txtBoxpassWord;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnLogin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		txtBoxUserName.sendKeys(user);
		txtBoxpassWord.sendKeys(pass);
		btnLogin.click();
	}
}
