package uk.co.automationtesting.mavenproject1;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
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

public class OrderCompleteTest extends BasePage {
	public OrderCompleteTest() {
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
	public void endToEndTest() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		ShopHomepage shophome=new ShopHomepage(driver);
		shophome.getProductOne().click();
		
		ShopProductpage shopprod=new ShopProductpage();
		Select option=new Select(shopprod.getSizeOption());
		option.selectByVisibleText("M");
		shopprod.getQuantityIncrease().click();
		shopprod.getAddToCartBtn().click();
		Thread.sleep(5000);
		ShopContentPanel cPanel=new ShopContentPanel(driver);
		cPanel.getCheckoutBtn().click();
		
		ShoppingCart cart=new ShoppingCart(driver);
		cart.getHavePromo().click();
		cart.getPromoTextbox().sendKeys("200OFF");
		cart.getPromoAddBtn().click();
		cart.getProceedToCheckoutBtn().click();
		
		OrderformPersInfo pinfo=new OrderformPersInfo(driver);
		pinfo.getGenderMr().click();
		pinfo.getFirstNameField().sendKeys("Tharun");
		pinfo.getLastNameField().sendKeys("Patnam");
		pinfo.getEmailField().sendKeys("abc1@gmail.com");
		pinfo.getTermsConditionsCheckbox().click();
		pinfo.getContinueBtn().click();
		
		OrderformDelivery orderDelivery=new OrderformDelivery(driver);
		orderDelivery.getAddressField().sendKeys("123 Main Street");
		orderDelivery.getCityField().sendKeys("Hyderabad");
		Select state=new Select(orderDelivery.getStateDropdown());
		orderDelivery.getPostcodeField().sendKeys("77021");
		orderDelivery.getContinueBtn().click();
		
		OrderformShippingmethod shipMethod=new OrderformShippingmethod(driver);
		shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my collection box");
		shipMethod.getContinueBtn().click();
		
		OrderformPayment orderPay=new OrderformPayment(driver);
		orderPay.getPayByCheck().click();
		orderPay.getTermsAndConditions();
		orderPay.getorderBtn().click();
		
	}

}
