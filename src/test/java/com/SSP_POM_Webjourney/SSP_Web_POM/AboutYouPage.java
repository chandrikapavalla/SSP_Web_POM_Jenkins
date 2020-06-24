package com.SSP_POM_Webjourney.SSP_Web_POM;

import org.openqa.selenium.By;

import com.SSP_Web_POM_Utility.BaseClass;

public class AboutYouPage extends BaseClass {
	public static void firstpage() throws Throwable {
	selectByTextInList(driver, "mrs", "input[data-fieldname='ProposerTitle']+span");

	signUpDetails(driver, "ProposerFirstName", "iuddrt");

	signUpDetails(driver, "ProposerLastName", "nigf");
	signUpDetails(driver, "ProposerEmail", "abcde@gmail.com");
	signUpDetails(driver, "ProposerPhoneNumber", "05865543258");

	selectByTextInList(driver, "9", "#dob-wrapper-day>select>option");
	selectByTextInList(driver, "12", "#dob-wrapper-month>select>option");
	selectByTextInList(driver, "1994", "#dob-wrapper-year>select>option");
	// postcode nr1 1xr
	signUpDetails(driver, "Postcode", "NR1 1XR");

	// find my address

	driver.findElement(By.cssSelector("button[value='Find my address']>span")).click();
	Thread.sleep(2000L);
	// address list
	selectByTextInList(driver, "3 River Heights, Wherry Road, Norwich, NR1 1XR",
			"select[data-fieldname='UkAdressDropdown']>option");
	selectByTextInList(driver, "married", "input[data-fieldname='ProposerMaritalStatus']+span>label");

	selectByTextInList(driver, "Unemployed", "select[data-fieldname='OccupationType']>option");
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("[data-fieldname='ProposerAdditionalOccupation-N']+span>label")).click();
	selectByTextInList(driver, "no", "[data-fieldname='JointPolicy']+span>label");
	driver.findElement(By.cssSelector(".checkmark")).click();
	driver.findElement(By.cssSelector("[data-fieldname='continue']>span")).click();
	}
	

}
