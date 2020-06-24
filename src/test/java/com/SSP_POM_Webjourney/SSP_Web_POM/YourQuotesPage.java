package com.SSP_POM_Webjourney.SSP_Web_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SSP_Web_POM_Utility.BaseClass;

public class YourQuotesPage extends BaseClass {
	public static void fifthpage() throws Throwable {
	String thanks="Thanks for getting a quote iuddrt";
	Thread.sleep(1000L);
	WebElement labeltitle=driver.findElement(By.cssSelector("[class='label-title']"));
	Thread.sleep(1000L);
	String title=labeltitle.getText();
	Thread.sleep(1000L);
	System.out.println(title);
	Thread.sleep(1000L);
	if(title.equalsIgnoreCase(thanks))
	{
	System.out.println("labeltitile matched with name");
	Thread.sleep(1000L);
	}
	else
		System.out.println("not matched");
	Thread.sleep(1000L);
	
	String quoteref="2020041112130" ;
	System.out.println("reference number matched"+quoteref);
	Thread.sleep(1000L);
	WebElement ref=driver.findElement(By.cssSelector("[class='quote-ref']>b"));
	Thread.sleep(1000L);
	String actualref=ref.getText();
	Thread.sleep(1000L);
	if(actualref.equalsIgnoreCase(quoteref))
	{
		System.out.println("reference number matched");
		Thread.sleep(1000L);
		
	}
	
	else
		System.out.println("ref number not matched");
	Thread.sleep(1000L);
	
	
	driver.navigate().to("https://homeinsurance.asda.com/?_ga=2.11010353.462059740.1586594025-43689212.1586438712");
	Thread.sleep(1000L);
	selectByTextInList(driver, "retrieve a quote", "[class='retrieve-link']>span");
	Thread.sleep(1000L);
	signUpDetails(driver, "QuoteReferenceNumber", actualref);
	Thread.sleep(1000L);
	signUpDetails(driver, "Email", "abcd@gmail.com");
	Thread.sleep(1000L);
	driver.findElement(By.cssSelector("button[data-fieldname='RetrieveQuoteButton']")).click();
}
}
