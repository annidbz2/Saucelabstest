package com.example.Wrapper;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.Driver.DriverClass;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class WrapperSelenium {
	
	
	public static void ExplicitWait(WebDriver dr,long time, By b) {
	
	WebDriverWait wait = new WebDriverWait(dr,time);
    wait.until(ExpectedConditions.visibilityOfElementLocated(b));
 
	}
	
	
	public static void ExplicitWait( By by) {
		
		WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(),25);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	 
	}
	
	public static void Sendkeys(By by, String keysToSend) {
		
		DriverClass.getDriver().findElement(by).sendKeys(keysToSend);
	}
	
	public static void Click(By by) {
		
		DriverClass.getDriver().findElement(by).click();
	}
	
	
		
	public static void scrollTo(String text)
	 {                
		   ((FindsByAndroidUIAutomator<MobileElement>) DriverClass.getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
	 }
	
	public static boolean iSDisplayed(By by)
	 {                
		return DriverClass.getDriver().findElement(by).isDisplayed();
	 }
	
	public static String getText(By by) {
		return DriverClass.getDriver().findElement(by).getText();
	}
}