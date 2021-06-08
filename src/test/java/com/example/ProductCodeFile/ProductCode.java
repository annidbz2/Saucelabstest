package com.example.ProductCodeFile;


import org.testng.Assert;

import com.example.POM.CartPage;
import com.example.POM.DeatilsPage;
import com.example.POM.Homepage;
import com.example.POM.Loginpage;
import com.example.POM.OrderSuccessfulpage;
import com.example.POM.confirmationPage;
import com.example.Wrapper.WrapperSelenium;

public class ProductCode {



	public void login(String username, String password) {
		WrapperSelenium.ExplicitWait(Loginpage.txt_username);
		WrapperSelenium.Sendkeys(Loginpage.txt_username, username);
		WrapperSelenium.Sendkeys(Loginpage.txt_password, password);
		WrapperSelenium.Click(Loginpage.btn_login );
		
	}

	public void verifypropermessage() {
		 Assert.assertEquals("THANK YOU FOR YOU ORDER", WrapperSelenium.getText(OrderSuccessfulpage.lbl_ordersuccessful));
		
	}

	
	public void searchandaddtocart(String product) {
		WrapperSelenium.ExplicitWait(Homepage.btn_cart);
		if(WrapperSelenium.iSDisplayed(Homepage.lbl_backpack)) {
			Assert.assertTrue(true);
		} 
		else {
			Assert.assertTrue(false);
		}
		
		
	}

	public void addcart() {
		 
		WrapperSelenium.Click(Homepage.btn_addbackpack);
		WrapperSelenium.Click(Homepage.btn_cart);
	}

	public void clickoncheckout() {
		WrapperSelenium.ExplicitWait(Loginpage.txt_username);
		WrapperSelenium.Click(CartPage.btn_checkout);
		
	}

	public void enter(String firstname, String lastname, String postalcode) {
		WrapperSelenium.ExplicitWait(DeatilsPage.txt_firstname);
		WrapperSelenium.Sendkeys(DeatilsPage.txt_firstname, firstname);
		WrapperSelenium.Sendkeys(DeatilsPage.txt_lastname, lastname);
		WrapperSelenium.Sendkeys(DeatilsPage.txt_postcode, postalcode);
		
		
	}

	public void clickoncontinue() {
		WrapperSelenium.Click(DeatilsPage.btn_continue );
		
	}

	public void scrollandFinish() {
		WrapperSelenium.scrollTo("Finish");
		WrapperSelenium.Click(confirmationPage.btn_Finish);
	}

	public void backtohomepage() {
		WrapperSelenium.Click(OrderSuccessfulpage.btn_backhome);
		
	}

	 

}
