package com.SSP_POM_Webjourney.SSP_Web_POM;

import org.openqa.selenium.By;

import com.SSP_Web_POM_Utility.BaseClass;

public class YourPropertyDetailsPage extends BaseClass {
	public static void thirdpage() throws Throwable {
	
	selectByTextInList(driver, "yes", "[data-fieldname='Distance from water']+span>label");
	selectByTextInList(driver, "no", "[data-fieldname='PropertyTrees']+span>label");
	selectByTextInList(driver, "no", "[data-fieldname='IsBuildingAtRisk']+span>label");
	selectByTextInList(driver, "no", "[data-fieldname='FloodedProperty']+span>label");
	selectByTextInList(driver, "concrete", "[data-fieldname='ExternalWallsMaterials']+span>label");
	selectByTextInList(driver, "no", "[data-fieldname='ExternalWallsCracks']+span>label");
	selectByTextInList(driver, "concrete", "[data-fieldname='RoofMaterial']+span>label");
	selectByTextInList(driver, "about a half", "[data-fieldname='FlatRoof']>option");
	selectByTextInList(driver, "2", "[data-fieldname='NumberOfBedrooms']+span>label");
	selectByTextInList(driver, "1", "[data-fieldname='NumberOfBathrooms']+span>label");
	selectByTextInList(driver, "0", "[data-fieldname='ReceptionRooms']+span>label");
	selectByTextInList(driver, "0", "[data-fieldname='OtherRooms']+span>label");
	driver.findElement(By.cssSelector("[data-fieldname='LockType-5LeverMorticeLock']+div>div+label")).click();
	Thread.sleep(1000L);
	selectByTextInList(driver, "no patio door", "[data-fieldname='PatioDoorsLocks']+span>label");
	Thread.sleep(1000L);
	selectByTextInList(driver, "no other door leads outside", "[data-fieldname='OtherDoorsLock']+span>label");
	Thread.sleep(1000L);
	selectByTextInList(driver, "no", "[data-fieldname='WindowsLocks']+span>label");
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("[data-fieldname='WorkingAlarm-Y']+span>label")).click();
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("[data-fieldname='MaintainedAlarm-Y']+span>label")).click();
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("[data-fieldname='MonitoredAlarm-Y']+span>label")).click();
	
	Thread.sleep(1000L);
	selectByTextInList(driver, "2", "[data-fieldname='SmokeAlarms']+span>label");
	Thread.sleep(1000L);
	selectByTextInList(driver, "yes", "[data-fieldname='NeighbourhoodWatch']+span>label");
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("[data-fieldname='continue']")).click();
	Thread.sleep(1000L);

	}
}
