package com.SSP_POM_Webjourney.SSP_Web_POM;

import org.openqa.selenium.By;

import com.SSP_Web_POM_Utility.BaseClass;

public class YourPropertyPage extends BaseClass{
	
	public static void secondpage() throws Throwable {
	selectByTextInList(driver, "i rent", "[data-fieldname='PropertyOwnershipType']+span>label");
	selectByTextInList(driver, "6", "[data-fieldname='YearsAtProperty']>option");
	Thread.sleep(2000L);
	selectByTextInList(driver, "yes", "[data-fieldname='MainResidence']>option");
	Thread.sleep(2000L);
	driver.findElement(By.cssSelector("[data-fieldname='Occupants-ISF']+span>label")).click();
	Thread.sleep(2000L);
	selectByTextInList(driver, "3", "[data-fieldname='PropertyOccupantsAdults']>option");
	Thread.sleep(1000L);
	selectByTextInList(driver, "1", "[data-fieldname='PropertyOccupantsChildren']>option");
	selectByTextInList(driver, "no", "[data-fieldname='PropertySmokers']+span>label");
	Thread.sleep(1000L);
	selectByTextInList(driver, "day and night", "[data-fieldname='PropertyOccupied']+span>label");
	Thread.sleep(1000L);
	
	selectByTextInList(driver, "no", "[data-fieldname='PropertyEmpty']+span>label");
	selectByTextInList(driver, "no business use", "[data-fieldname='PropertyBusinessUse']+span>label");
	signUpDetails(driver, "Year", "1998");
	selectByTextInList(driver, "no", "input[data-fieldname='PropertyForSale']+span>label");
	selectByTextInList(driver, "flat", "input[data-fieldname='HouseType']+div>div+label");
	Thread.sleep(1000L);
	selectByTextInList(driver, "Flat/apartment - purpose build(self contained)", "[data-fieldname='PropertyType']>option");
	selectByTextInList(driver, "first floor", "[data-fieldname='PropertyType']>option");

	signUpDetails(driver, "CurrentMarketValue", "80,000");
	signUpDetails(driver, "RebuildCost", "20000");
	selectByTextInList(driver, "no", "input[data-fieldname='PropertyInBuilding']+span>label");
	selectByTextInList(driver, "yes", "input[data-fieldname='PropertyUnderpinned']+span>label");
	selectByTextInList(driver, "yes", "input[data-fieldname='PropertyState']+span>label");
	selectByTextInList(driver, "grade 1", "input[data-fieldname='PropertyListed']+span>label");
	driver.findElement(By.cssSelector("[data-fieldname='continue']")).click();

}
}
