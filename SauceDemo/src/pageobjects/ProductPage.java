package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement sauceLabsBackpack;
	
	@FindBy(xpath = "//button[@class = 'btn_primary btn_inventory']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//div[@id = 'shopping_cart_container']/a")
	private WebElement iconCart;

	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstProduct(){
		return sauceLabsBackpack;
		
	}
	
	public WebElement getAddToCart(){
		return addToCart;
		
	}
	
	public WebElement getIconCart(){
		return iconCart;
		
	}

}
