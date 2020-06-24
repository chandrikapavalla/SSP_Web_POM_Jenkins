package com.SSP_POM_Webjourney.SSP_Web_POM;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.SSP_Web_POM_Utility.BaseClass;

public class MenuPage extends BaseClass{
	public static void menu() throws Throwable {
		
		
		selectByTextInList(driver, "get a quote", "[class='overview-page-menu']>div>div>div>ul>li");

		Set<String> links = driver.getWindowHandles();
		List<Object> list = links.stream().collect(Collectors.toList());
		driver.switchTo().window((String) list.get(1));

		// driver.switchTo().window(driver.getWindowHandle());
		// click on buildings cover

		Actions a = new Actions(driver);

		Thread.sleep(2000L);
		WebElement buildings = driver.findElement(By.cssSelector("div[data-label='Click|Building']"));
		a.moveToElement(buildings).click().build().perform();
	}

}
