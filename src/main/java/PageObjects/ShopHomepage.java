package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomepage {
	public WebDriver driver;
	By productOne=By.linkText("Hummingbird Printed T-Shirt");
	By productTwo=By.linkText("Hummingbird Printed Sweater");
	By productThree=By.linkText("The Best Is Yet To Come'...");
	public ShopHomepage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getProductOne() {
		return driver.findElement(productOne);	
	}
	public WebElement getProductTwo() {
		return driver.findElement(productTwo);
	}
	public WebElement getproductThree() {
		return driver.findElement(productThree);
	}
}
