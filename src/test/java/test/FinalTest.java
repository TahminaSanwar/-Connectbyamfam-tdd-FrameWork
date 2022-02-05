package test;

import org.openqa.selenium.ElementNotVisibleException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class FinalTest extends BaseClass {
	@Test
	public void autoInsTest() {
		productPages.insuranceChoicesMethod(cm, driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException | NullPointerException e) {

			e.printStackTrace();
			Assert.fail();
		}
		productPages.coverageMethod(cm);
		try {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		} catch (ElementNotVisibleException | IllegalArgumentException e) {

			e.printStackTrace();
		}
		productPages.zipCodeMethods(cm);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
			Assert.fail();
		}
		productPages.typeOfInsDropDownMethod(cm);
		productPages.getAQuoteMethod(cm);
	}

}
