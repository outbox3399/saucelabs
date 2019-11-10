package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage {

	@FindBy(xpath = "//a[text()='FINISH']")
	private WebElement lnkFinish;
	
	public CheckoutOverviewPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFinish() {
		return lnkFinish;

	}

}
