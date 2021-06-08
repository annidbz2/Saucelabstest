package com.example.StepDef;



import org.junit.runner.RunWith;

import com.example.ProductCodeFile.ProductCode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ProductStepDef {
	ProductCode procode = new ProductCode();
    @Given("^user login to application with (.+) (.+)$")
    public void user_login_to_application_with(String username, String password, String strArg1, String strArg2) throws Throwable {
    	procode.login(username,password);
    }

    @Then("^verify that proper message is displayed for the purches low$")
    public void verify_that_proper_message_is_displayed_for_the_purches_low() throws Throwable {
    	procode.verifypropermessage();
    }

    @And("^user search for (.+) and add it into cart$")
    public void user_search_for_and_add_it_into_cart(String product, String strArg1) throws Throwable {
    	procode.searchandaddtocart(product);
    }

    @And("^click on add cart button$")
    public void click_on_add_cart_button() throws Throwable {
    	procode.addcart();
    }

    @And("^user clicks on checkout button$")
    public void user_clicks_on_checkout_button() throws Throwable {
    	procode.clickoncheckout();
    }

    @And("^user enters (.+) (.+) (.+)$")
    public void user_enters(String firstname, String lastname, String postalcode, String strArg1, String strArg2, String strArg3) throws Throwable {
    	procode.enter(firstname,lastname,postalcode);
    }

    @And("^click on continue button$")
    public void click_on_continue_button() throws Throwable {
    	procode.clickoncontinue();
    }

    @And("^user scrolls down and click on Finish button$")
    public void user_scrolls_down_and_click_on_finish_button() throws Throwable {
    	procode.scrollandFinish();
    }

    @And("^user goes back to home page$")
    public void user_goes_back_to_home_page() throws Throwable {
    	procode.backtohomepage();
    }

}
