package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderformDelivery {
	public WebDriver driver;
	
	By firstNameField=By.cssSelector("input[name='firstname']");
	By lastNameField=By.cssSelector("input[name='lastname']");
	By companyNameField=By.cssSelector("input[name='company']");
	By addressField=By.cssSelector("input[name='address1']");
	By addressComplementField=By.cssSelector("input[name='address2']");
	By cityField=By.cssSelector("input[name='city']");
	By stateDropdown=By.cssSelector("select[name='id_state']");
	By postcodeField=By.cssSelector("input[name='postcode']");
	By countryDropdown=By.cssSelector("select[name='id_country']");
	By phoneField=By.cssSelector("input[name='phone']");
	By invoiceSameAddCheckboc=By.cssSelector("/html//input[@id='use_same_address']");
	By continueBtn=By.cssSelector("button[name='confirm-addresses']");
	public OrderformDelivery(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getFirstName() {
		return driver.findElement(firstNameField);
	}
	public WebElement getLastNameField() {
		return driver.findElement(lastNameField);
	}
	public WebElement getCompanyNameField() {
		return driver.findElement(companyNameField);
	}
	public WebElement getAddressField() {
		return driver.findElement(companyNameField);
	}
	public WebElement getAddressComplementField() {
		return driver.findElement(companyNameField);
	}
	public WebElement getCityField() {
		return driver.findElement(companyNameField);
	}
	public WebElement getStateDropdown() {
		return driver.findElement(stateDropdown);
	}
	public WebElement getPostcodeField() {
		return driver.findElement(stateDropdown);
	}
	public WebElement getCountryDropdown() {
		return driver.findElement(countryDropdown);
	}
	public WebElement getPhoneField() {
		return driver.findElement(phoneField);
	}
	public WebElement getInvoiceSameAddCheckboc() {
		return driver.findElement(phoneField);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
}
