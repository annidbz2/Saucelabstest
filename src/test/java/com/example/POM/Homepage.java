package com.example.POM;

import org.openqa.selenium.By;

public class Homepage {
	public static By lbl_backpack = By.xpath("//*[contains(@Text,'Sauce Labs Backpack')]");
	public static By btn_addbackpack = By.xpath("//*[contains(@Text,'Sauce Labs Backpack')]/../following-sibling::*[1]");
	public static By btn_cart = By.xpath("//*[@Content-Desc='test-Cart']");
}
