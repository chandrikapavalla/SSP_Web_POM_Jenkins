package com.SSP_POM_Webjourney.SSP_Web_POM;

import org.openqa.selenium.By;

import com.SSP_Web_POM_Utility.BaseClass;

public class YourPolicy  extends BaseClass{
	//4th   page
	public static void fourthpage() throws Throwable {
	
	driver.findElement(By.cssSelector("input[data-fieldname='HasClaims-N']+span")).click();
	selectByTextInList(driver, "3", "[data-fieldname='Dropdown']>option");
	Thread.sleep(1000L);
	selectByTextInList(driver, "400", "[data-about='voluntary-excess-buildings']>option");
	Thread.sleep(1000L);
	selectByTextInList(driver, "yes", "[data-fieldname='AccidentalDamageBuildings']+span>label");
	Thread.sleep(1000L);
	
	selectByTextInList(driver, "28", "[data-fieldname='PolicyStart']>option");
	Thread.sleep(1000L);
	selectByTextInList(driver, "06", "[autocomplete='bday-month']>option");
	selectByTextInList(driver, "2020", "[autocomplete='bday-year']>option");
	selectByTextInList(driver, "monthly", "input[data-fieldname='PolicyPay']+span>label");
	Thread.sleep(1000L);
	selectByTextInList(driver, "no", "input[data-fieldname='PolicyImposed']+span>label");
	selectByTextInList(driver, "no", "input[data-fieldname='PolicyConviction']+span>label");
	selectByTextInList(driver, "no", "input[data-fieldname='PolicyBankruptcy']+span>label");
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("span[class='checkmark-email']")).click();
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("button[data-fieldname='continue']")).click();
	Thread.sleep(60000);

}
}
