package com.appium.pageobjectsweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {

	// Declare Page objects for Header Page
	
	private static WebElement webele = null;
	
	public static WebElement lnk_MyAccount(WebDriver driver) {
		webele = driver.findElement(By.xpath(""));
		return webele;
	}
	
}
