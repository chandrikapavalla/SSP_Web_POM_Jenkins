package com.SSP_Web_POM_TestScripts;

import org.testng.annotations.Test;

import com.SSP_POM_Webjourney.SSP_Web_POM.MenuPage;
import com.SSP_Web_POM_Utility.BaseClass;

public class TC_02 extends BaseClass {
@Test
public static void TC_002() throws Throwable {
	BaseClass.openBrowser();
	BaseClass.openApp();
	MenuPage.menu();
	BaseClass.closeBrowser();
	
}
}
