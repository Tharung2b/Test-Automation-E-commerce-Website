package uk.co.automationtesting.mavenproject1;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.OrderformDelivery;
import PageObjects.OrderformPayment;
import PageObjects.OrderformPersInfo;
import PageObjects.OrderformShippingmethod;
import PageObjects.ShopContentPanel;
import PageObjects.ShopHomepage;
import PageObjects.ShopProductpage;
import PageObjects.ShoppingCart;
import base.BasePage;

public class AddRemoveItemBasketTest extends BasePage {
	public AddRemoveItemBasketTest() {
		super();
	}
	@BeforeTest
	public void setup() throws IOException {
		driver=getDriver();
		driver.get(setUrl());
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	@Test
	public void AddRemoveItem() throws InterruptedException {
		ShopHomepage shophome=new ShopHomepage(driver);
		shophome.getProductOne().click();
		
		ShopProductpage shopprod=new ShopProductpage();
		Select option=new Select(shopprod.getSizeOption());
		option.selectByVisibleText("M");
		shopprod.getQuantityIncrease().click();
		shopprod.getAddToCartBtn().click();
		Thread.sleep(5000);
		
		ShopContentPanel cPanel=new ShopContentPanel(driver);
		cPanel.getContinueShoppingBtn().click();
		shopprod.getHomepageLink().click();
		shophome.getProductTwo().click();
		shopprod.getAddToCartBtn().click();
		Thread.sleep(5000);
		cPanel.getCheckoutBtn().click();
		
		ShoppingCart cart=new ShoppingCart(driver);
		cart.getdeleteItemTwo().click();
		Thread.sleep(5000);
		
		System.out.println(cart.gettotalValue().getText());
		
		Assert.assertEquals(cart.gettotalValue().getText(),"$46.24");
	}

}
