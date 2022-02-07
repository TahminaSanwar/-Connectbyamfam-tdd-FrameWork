package test;

import org.testng.annotations.Test;

import base.BaseClass;

public class UpdateCreditCardTest extends BaseClass{
	@Test
	public void test() throws InterruptedException {
		updateCreditCard.updateCreditCardMethod(cm);
		Thread.sleep(3000);
		updateCreditCard.firstNameMethod(cm);
		Thread.sleep(3000);
		updateCreditCard.lastNameMethod(cm);
		Thread.sleep(3000);
		updateCreditCard.dateOfBirthMethod(cm);
		Thread.sleep(3000);
		updateCreditCard.zipCodeMethod(cm);
		Thread.sleep(3000);
		updateCreditCard.policyTypeMethod(cm);
		Thread.sleep(3000);
		
	}

}
