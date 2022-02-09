package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import common.CommonMethods;

public class UpdateCreditCard {
	public UpdateCreditCard(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[contains(text(),'Update Credit Card')])[1] ")
	public WebElement updateCreditCard;
	@FindBy(xpath = "//input[@class='form-control' and @name='firstName']")
	public WebElement firstName;
	@FindBy(xpath = "//input[@title='Enter your last name.']")
	public WebElement lastName;
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	public WebElement dateOfBirth;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	public WebElement zipCode;
	@FindBy(xpath = "//label[@for='policyTypeOptions2']")
	public WebElement policyType;

	public void updateCreditCardMethod(CommonMethods cm) {
		BaseClass.cm.clickable(updateCreditCard);

	}

	public void firstNameMethod(CommonMethods cm) {

		
	    Set<String> childWindow=BaseClass.driver.getWindowHandles();
	    for(String newWindow:childWindow) {
	    	BaseClass.driver.switchTo().window(newWindow);
	    } 
	  //  cm.clickable(firstName);
	    BaseClass.cm.sendText(firstName, "Tahmina");

	}

	public void lastNameMethod(CommonMethods cm) {
	//	cm.clickable(lastName);
		BaseClass.cm.sendText(lastName, "Sanwar");

	}

	public void dateOfBirthMethod(CommonMethods cm) {
		BaseClass.cm.clickable(dateOfBirth);
		BaseClass.cm.sendText(dateOfBirth, "10271983");

	}

	public void zipCodeMethod(CommonMethods cm) {
		BaseClass.cm.clickable(zipCode);
		BaseClass.cm.sendText(zipCode, "11355");

	}

	public void policyTypeMethod(CommonMethods cm) {
		cm.clickable(policyType);

	}

}
