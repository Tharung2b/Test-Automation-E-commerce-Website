package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderformPayment {
	public WebDriver driver;
	By payByCheck=By.xpath("//span[.='Pay by Check']");
	By payByWire=By.xpath("//span[.='Pay by bank wire']");
	By termsAndConditions=By.xpath("/html//input[@id='conditions_to_approve[terms-and-conditions]']");
	By orderBtn=By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");
	public OrderformPayment(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getPayByCheck() {
		return driver.findElement(payByCheck);
	}
	public WebElement getPayByWire() {
		return driver.findElement(payByWire);
	}
	public WebElement getTermsAndConditions() {
		return driver.findElement(termsAndConditions);
	}
	public WebElement getorderBtn() {
		return driver.findElement(orderBtn);
	}

}
