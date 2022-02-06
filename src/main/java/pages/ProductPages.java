package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonMethods;

public class ProductPages {
	public ProductPages(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='app-link no-underline'])[1]")
	public WebElement insuranceChoices;
	@FindBy(xpath = "(//a[contains(text(),'Coverage')])[1]")
	public WebElement coverage;
	@FindBy(xpath = "//input[@id='uid_218']")
	public WebElement zipCode;
	@FindBy(xpath = "//select[@id='uid_221']")
	public WebElement typeOfInsDropDown;
	@FindBy(xpath = "//button[contains(text(),'Get a Quote')]")
	public WebElement getAQuote;

	public void insuranceChoicesMethod(CommonMethods cm, WebDriver driver) {
		cm.hoverover(driver, insuranceChoices);
	}

	public void coverageMethod(CommonMethods cm) {
		cm.clickable(coverage);

	}

	public void zipCodeMethods(CommonMethods cm) {
		cm.clickable(zipCode);
		cm.sendText(zipCode, "11355");

	}

	public void typeOfInsDropDownMethod(CommonMethods cm) {
		cm.clickable(typeOfInsDropDown);
		cm.dropDown(typeOfInsDropDown, "Renters");

	}

	public void getAQuoteMethod(CommonMethods cm) {
		cm.clickable(getAQuote);

	}

}
