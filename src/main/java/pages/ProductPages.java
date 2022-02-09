package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import common.CommonMethods;

public class ProductPages {
	public ProductPages(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='app-link no-underline'])[1]")
	public WebElement insuranceChoices;
	@FindBy(xpath = "(//a[contains(text(),'Coverage')])[1]")
	public WebElement coverage;
	@FindBy(xpath = "(//input[@name='zip'])[1]")
	public WebElement zipCode;
	@FindBy(xpath = "//select[@id='uid_222']")
	public WebElement typeOfInsDropDown;
	@FindBy(xpath = "//button[contains(text(),'Get a Quote')]")
	public WebElement getAQuote;

	public void insuranceChoicesMethod(CommonMethods cm, WebDriver driver) {
		BaseClass.cm.hoverover(driver, insuranceChoices);
	}

	public void coverageMethod(CommonMethods cm) {
		BaseClass.cm.clickable(coverage);

	}

	public void zipCodeMethods(CommonMethods cm) {
		BaseClass.cm.clickable(zipCode);
		BaseClass.cm.sendText(zipCode, "11355");

	}

	public void typeOfInsDropDownMethod(CommonMethods cm) {
		BaseClass.cm.clickable(typeOfInsDropDown);
		BaseClass.cm.dropDown(typeOfInsDropDown, "Renters");

	}

	public void getAQuoteMethod(CommonMethods cm) {
		BaseClass.cm.clickable(getAQuote);

	}

}
