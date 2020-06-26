package com.SSP_Web_POM_Utility;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	//public static String URL="https://money.asda.com/home-insurance/";
	

	public static WebDriver driver;
	
	public static void openBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\WorkSpace\\Chandrika\\SSP_WebJourney_Pom\\chromedriver.exe");
	//‪E:\chromedriver_win32\chromedriver.exe
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	
	
	public  static void openApp() {
		
	//	to reed data from jenkinsparammeters
		driver.navigate().to(System.getProperty("URL"));
	}
	/**
	 * @param driver
	 */
	public static void implicitWait(WebDriver driver,int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	
	/**
	 * @param driver
	 */
	public static void waitForElementVisibility(WebDriver driver,By path) {
		WebDriverWait wait=new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(path));
	}
	
	
	
	
	
	public static void closeBrowser()
	{
		
	driver.quit();
	}
	

	/**
	 * @param driver
	 */

	/**
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void scrollToViewEle(WebDriver driver, WebElement first) throws InterruptedException {
		// proposer first name

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", first);
		Thread.sleep(500);
	}

	/**
	 * @param driver
	 * @throws InterruptedException
	 */

	/**
	 * @param driver
	 * @throws Exception
	 */
	public static void signUpDetails(WebDriver driver, String css1, String text) throws Exception {

		WebElement signUpField = driver.findElement(By.cssSelector("input[data-fieldname='" + css1 + "']"));
		scrollToViewEle(driver, signUpField);
		signUpField.sendKeys(text);
	}

	/**
	 * @param driver
	 * @param itr
	 */
	public static void selectByTextInList(WebDriver driver, String match, String css) {
		List<WebElement> dates = driver.findElements(By.cssSelector(css));
		Iterator itr2 = dates.iterator();

		while (itr2.hasNext()) {
			WebElement element2 = (WebElement) itr2.next();
			String detail = element2.getText();
			System.out.println(detail);
			if (detail.equalsIgnoreCase(match)) {

				element2.click();
				break;
			}
		}
	}

}
	
	


