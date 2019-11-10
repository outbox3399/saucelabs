package testscripts;

import org.junit.Assert;
import org.junit.Test;

import pageobjects.BasePage;
import pageobjects.CheckoutInfoPage;
import pageobjects.CheckoutOverviewPage;
import pageobjects.CheckoutPage;
import pageobjects.FinishPage;
import pageobjects.LoginPage;
import pageobjects.ProductPage;

public class VerifyOrderItemsSuccessfully {

	LoginPage loginPage;
	ProductPage productPage;
	FinishPage finishPage;
	CheckoutPage checkoutPage;
	CheckoutOverviewPage checkoutOverviewPage;
	CheckoutInfoPage checkoutInfoPage;
	
	public VerifyOrderItemsSuccessfully() {
		loginPage = new LoginPage();
		productPage = new ProductPage();
		finishPage = new FinishPage();
		checkoutPage = new CheckoutPage();
		checkoutOverviewPage = new CheckoutOverviewPage();
		checkoutInfoPage = new CheckoutInfoPage();

	}

	@Test
	public void verifyOrderItemSuccessfully() {
		loginPage.login("standard_user", "secret_sauce");
		String title = loginPage.getTitle();
		Assert.assertTrue("Failed: Login failed", title.contains("Swag Labs"));

		productPage.getFirstProduct().click();
		productPage.getAddToCart().click();
		productPage.getIconCart().click();

		checkoutPage.getLinkCheckout().click();

		checkoutInfoPage.enterCheckoutInfo("Test", "Automation", "123456");

		checkoutOverviewPage.getFinish().click();
		Assert.assertTrue("Failed: Order was not successful",
				finishPage.getSuccessfulMessage().getText().equalsIgnoreCase("THANK YOU FOR YOUR ORDER"));
	}

}
