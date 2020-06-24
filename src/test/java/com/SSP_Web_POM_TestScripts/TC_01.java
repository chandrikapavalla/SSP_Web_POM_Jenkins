package com.SSP_Web_POM_TestScripts;

import org.testng.annotations.Test;

import com.SSP_POM_Webjourney.SSP_Web_POM.AboutYouPage;
import com.SSP_POM_Webjourney.SSP_Web_POM.MenuPage;
import com.SSP_POM_Webjourney.SSP_Web_POM.YourPolicy;
import com.SSP_POM_Webjourney.SSP_Web_POM.YourPropertyDetailsPage;
import com.SSP_POM_Webjourney.SSP_Web_POM.YourPropertyPage;
import com.SSP_POM_Webjourney.SSP_Web_POM.YourQuotesPage;
import com.SSP_Web_POM_Utility.BaseClass;

public class TC_01 extends BaseClass{
	@Test
	public static void Tc_001() throws Throwable {
		
		BaseClass.openBrowser();
		BaseClass.openApp();
		MenuPage.menu();
		AboutYouPage.firstpage();
		YourPropertyPage.secondpage();
		YourPropertyDetailsPage.thirdpage();
		YourPolicy.fourthpage();
		YourQuotesPage.fifthpage();
		BaseClass.closeBrowser();
		
		
		
	}
		
		
	
	
	

}
