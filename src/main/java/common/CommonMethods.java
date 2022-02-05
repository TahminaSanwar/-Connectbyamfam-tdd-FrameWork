package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public void hoverover(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
		
		}
	public void clickable(WebElement element) {
		element.click();
		
		}
	public void sendText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void dropDown(WebElement element, String text) {
		Select select= new Select(element);
		select.selectByVisibleText(text);
		
	}
	

}
