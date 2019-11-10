package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage{

	@FindBy(xpath = "//a[@class = 'btn_action checkout_button']")
	private WebElement lnkCheckout;

	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLinkCheckout() {
		return lnkCheckout;

	}

}
