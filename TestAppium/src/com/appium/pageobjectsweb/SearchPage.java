package com.appium.pageobjectsweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

//	Declare Page objects for Search Page
	
private static WebElement webele = null;
	
	public static WebElement lnk_SearchAccount(WebDriver driver) {
		webele = driver.findElement(By.xpath(""));
		return webele;
	}
}
