package com.example.Driver;


import java.net.URL;
 

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverClass {
	
	public static ThreadLocal< AndroidDriver<AndroidElement>> dr = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static DesiredCapabilities SetCapabilities() {
		DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("browserstack.user", "andysmith_pU8NT4");
	      caps.setCapability("browserstack.key", "Hg5bwaAE1MCuSmUyEJbG");
	      caps.setCapability("app", "bs://33bfb1555bd0fc18133349e593f70ad3f3dccb29");
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
		  return caps;
	}
	
	public static void setdriver() throws MalformedURLException {
		  
		dr.set(new AndroidDriver<AndroidElement>(
	      		new URL("http://hub.browserstack.com/wd/hub"), SetCapabilities())); 
	}
	
	
	public void chromeClosure() {
		getDriver().close();
	}

}
