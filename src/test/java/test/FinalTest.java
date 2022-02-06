package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class FinalTest extends BaseClass {
	@Test
	public void autoInsTest() {
		productPages.insuranceChoicesMethod(cm, driver);
		productPages.coverageMethod(cm);
        productPages.zipCodeMethods(cm);
		productPages.typeOfInsDropDownMethod(cm);
		productPages.getAQuoteMethod(cm);
	}

}
