package com.automation.stepDef;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.automation.actionsAndVerification.WebPageActions;
import com.automation.actionsAndVerification.WebPageVerifications;
import com.utilities.SetupDrivers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EcomSteps {
	
	WebPageActions actionsObj = new WebPageActions();
	WebPageVerifications verificationsObj = new WebPageVerifications();


	@Given("the browser is launched")
	public void the_browser_is_launched() {
	    
	}

    @Given("Navigate to {string}")
    public void navigate_to_page(String url) {
        actionsObj.loadAutomationWebsite(url);
    }

	@Then("the home page should be visible successfully")
	public void the_home_page_should_be_visible_successfully() {
	    verificationsObj.homePageVerification();
	}
	
//	@When("I click on the {string} button")
//	public void click_on(String message) throws Exception {
//	    if ("Signup / Login".equals(message)) {
//	    	actionsObj.loginOrSignUp();
//	    } else if ("Signup".equals(message)) {
//	    	 actionsObj.signup();
//	    }else if("Create Account".equals(message)) {
//	    	actionsObj.clickCreateAccount();
//	    }else if ("Continue".equals(message)) {
//	    	actionsObj.clickContinue();
//	    }else if("Delete Account".equals(message)) {
//	    	actionsObj.deleteAccount();
//	    }else if ("Login".equals(message)) {
//	    	actionsObj.clickLogin();
//	    }else if("Logout".equals(message)) {
//	    	actionsObj.clickLogout();
//	    }else if("Contact us".equals(message)) {
//	    	actionsObj.clickContactUs();
//	    }else if("Submit".equals(message)) {
//	    	actionsObj.clickSubmit();
//	    }else if("OK".equals(message)) {
//	    	actionsObj.acceptPopUp();
//	    }else if("Home".equals(message)) {
//	    	actionsObj.homePage();
//	    }else if("Products".equals(message)) {
//	    	actionsObj.clickProducts();
//	    }else if("View Product".equals(message)) {
//	    	actionsObj.clickViewProduct();
//	    }else if("Continue Shopping".equals(message)) {
//	    	actionsObj.clickContinueShopping();
//	    }else if ("Cart".equals(message)) {
//	    	actionsObj.viewCart();
//	    }else if("Add to cart".equals(message)) {
//	    	actionsObj.addToCart();
//	    }else if("View Cart".equals(message)) {
//	    	actionsObj.viewCartPopup();
//	    }
//	    else {
//	        throw new IllegalArgumentException("Cannot verify " + message);
//	    }
//	}
	
	
	  @When("I click on the {string} button")
	    public void click_on_button(String buttonLabel) throws Exception {
	        handleButtonClick(buttonLabel);
	    }

	    private void handleButtonClick(String buttonLabel) throws Exception {
	        switch (buttonLabel) {
	            case "Signup / Login": 
	            	actionsObj.loginOrSignUp(); break;
	            case "Signup": 
	            	actionsObj.signup(); break;
	            case "Create Account": 
	            	actionsObj.clickCreateAccount(); break;
	            case "Continue": 
	            	actionsObj.clickContinue(); break;
	            case "Delete Account": 
	            	actionsObj.deleteAccount(); break;
	            case "Login": 
	            	actionsObj.clickLogin(); break;
	            case "Logout": 
	            	actionsObj.clickLogout(); break;
	            case "Contact us": 
	            	actionsObj.clickContactUs(); break;
	            case "Submit": 
	            	actionsObj.clickSubmit(); break;
	            case "OK": 
	            	actionsObj.acceptPopUp(); break;
	            case "Home": 
	            	actionsObj.homePage(); break;
	            case "Products": 
	            	actionsObj.clickProducts(); break;
	            case "View Product": 
	            	actionsObj.viewSelectProduct(); break;
	            case "Continue Shopping": 
	            	actionsObj.clickContinueShopping(); break;
	            case "Cart": 
	            	actionsObj.viewCart(); break;
	            case "Add to cart": 
	            	actionsObj.addToCart(); break;
	            case "View Cart": 
	            	actionsObj.viewCartPopup(); break;
	            default: throw new IllegalArgumentException("Unknown button action: " + buttonLabel);
	        }
	    }

	
	
//	@Then("{string} should be visible")
//	public void should_be_visible(String message) throws Exception {
//	    if ("ENTER ACCOUNT INFORMATION".equals(message)) {
//	        verificationsObj.accountInfoSetupVerification(message);
//	    }else if("New User Signup".equals(message)) {
//	    	verificationsObj.signupPageVerification(); 
//	    }else if ("ACCOUNT CREATED!".equals(message)) {
//	        verificationsObj.accountCreatedVerification();
//	    } else if ("ACCOUNT DELETED!".equals(message)) {
//	        verificationsObj.accountDeletedVerification();
//	    } else if ("Login to your account".equals(message)) {
//	    	verificationsObj.accountLoginPageVerification();
//	    } else if ("Your email or password is incorrect!".equals(message)) {
//	    	verificationsObj.incorrectCredentialsAlert();
//	    }else if ("Email Address already exist!".equals(message)) {
//	    	verificationsObj.emailTaken();
//	    }else if ("GET IN TOUCH".equals(message)) {
//	    	verificationsObj.contactUsPageVerification();
//	    }else if("Get In Touch".equals(message)) {
//	    	verificationsObj.contactUsPageVerification();
//	    }else if("Success! Your details have been submitted successfully.".equals(message)) {
//	    	verificationsObj.contactSubmittedVerification();
//	    }else if("Write Your Review".equals(message)) {
//	    	verificationsObj.writeReviewVerification(message);
//	    }else if ("Thank you for your review.".equals(message)) {
//	    	verificationsObj.reviewSubmittedVerification();
//	    }else if("SEARCHED PRODUCTS".equals(message)) {
//	    	verificationsObj.searchedProductVerification(message);
//	    }
//	    else {
//	        throw new IllegalArgumentException("Cannot verify " + message);
//	    }
//	}
	    
	    @Then("{string} should be visible")
	    public void should_be_visible(String message) throws Exception {
	        handleMessageVerification(message);
	    }

	    private void handleMessageVerification(String message) throws Exception {
	        switch (message) {
	            case "ENTER ACCOUNT INFORMATION": 
	            	verificationsObj.accountInfoSetupVerification(message); break;
	            case "New User Signup": 
	            	verificationsObj.signupPageVerification(); break;
	            case "ACCOUNT CREATED!": 
	            	verificationsObj.accountCreatedVerification(); break;
	            case "ACCOUNT DELETED!": 
	            	verificationsObj.accountDeletedVerification(); break;
	            case "Login to your account": verificationsObj.accountLoginPageVerification(); break;
	            case "Your email or password is incorrect!": 
	            	verificationsObj.incorrectCredentialsAlert(); break;
	            case "Email Address already exist!": 
	            	verificationsObj.emailTaken(); break;
	            case "GET IN TOUCH": case "Get In Touch": 
	            	verificationsObj.contactUsPageVerification(); break;
	            case "Success! Your details have been submitted successfully.": 
	            	verificationsObj.contactSubmittedVerification(); break;
	            case "Write Your Review": 
	            	verificationsObj.writeReviewVerification(message); break;
	            case "Thank you for your review.": 
	            	verificationsObj.reviewSubmittedVerification(); break;
	            case "SEARCHED PRODUCTS": 
	            	verificationsObj.searchedProductVerification(message); break;
	            default: throw new IllegalArgumentException("Cannot verify message: " + message);
	        }
	    }
	    
	
	@When("I enter name {string} and email {string}")
	public void i_enter_name_and_email(String name, String email) throws Exception {
	    actionsObj.setName(name);
	    actionsObj.setEmail(email);
	}


	@When("I fill in the account details:")
	public void i_fill_in_the_account_details(io.cucumber.datatable.DataTable dataTable) throws Exception {
		
		  // Convert DataTable to a Map
	    List<Map<String, String>> accountDetails = dataTable.asMaps(String.class, String.class);

	    // Assuming only one row is provided in the feature file
	    Map<String, String> details = accountDetails.get(0);

	    // Extract details
	    String title = details.get("Title");
	    String name = details.get("Name");
	    String email = details.get("Email");
	    String password = details.get("Password");
	    String dob = details.get("Date of birth");
	    
	    // Call methods to input these details
	    actionsObj.fillAccountDetails(title, name, password, dob);
	}

	@When("I select the checkboxes for newsletters and special offers")
	public void i_select_the_checkboxes_for_newsletters_and_special_offers() throws Exception {
	    actionsObj.selectNewslettersAndOffers();
	}

	@When("I fill in the personal details:")
	public void i_fill_in_the_personal_details(io.cucumber.datatable.DataTable dataTable) throws Exception {
		
		List<Map<String, String>> personalDetails = dataTable.asMaps(String.class, String.class);
		
		Map<String, String> details = personalDetails.get(0);
		
		String firstName = details.get("First name");
		String lastName = details.get("Last name");
		String company = details.get("Company");
		String address = details.get("Address");
		String address2 = details.get("Address2");
		String country = details.get("Country");
		String state = details.get("State");
		String city = details.get("City");
		String zipcode = details.get("Zipcode");
		String number = details.get("Mobile Number");
		
		actionsObj.accountDetails(firstName, lastName, company, address, address2, country, state, city, zipcode, number); 
	}
	
	@Then("Logged in as {string} should be visible")
	public void logged_in_as_should_be_visible(String name) throws Exception {
	    verificationsObj.verifyLoggedInMessage(name);
	}
	
	@When("I enter correct email address and password")
	public void i_enter_correct_email_address_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> loginTable = dataTable.asMaps(String.class, String.class);
		Map<String, String> userDetails = loginTable.get(0);
		
		String email = userDetails.get("Email");
		String password = userDetails.get("Password");
		
		actionsObj.accountLogin(email, password);	   
	}
	
	@When("I enter name {string} and already registered email {string}")
	public void i_enter_name_and_already_registered_email(String name, String email) throws Exception {
	    actionsObj.setName(name);
	    actionsObj.setEmail(email);
	}
	
	@When("I fill the contact form with:")
	public void i_fill_the_contact_form_with(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> formDetails = dataTable.asMaps(String.class, String.class);
		Map<String, String> details = formDetails.get(0);
		
		String name = details.get("Name");
		String email = details.get("Email");
	    //String email = "user_" + System.currentTimeMillis() + "@example.com";
		String subject = details.get("Subject");
		String message = details.get("Message");
		
		actionsObj.fillContactForm(name, email, subject, message);
	}
	

	@When("I upload a file {string}")
	public void i_upload_a_file(String filePath) throws Exception {
		actionsObj.uploadFile(filePath);
	}
	
	@Then("I should be navigated to the {string} page successfully")
	public void i_should_be_navigated_to_the_page_successfully(String pageName) {
	    verificationsObj.verifyPageNavigation(pageName); 
	}
	
	@When("I click on 'Submit' button")
	public void i_click_on_submit_button() throws Exception  {
		actionsObj.clickSubmit();
	}
	
	@When("I enter user details:")
	public void i_enter_user_details(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> details = dataTable.asMaps(String.class, String.class);
		
		Map<String, String> userDetails = details.get(0);
		
		String name = userDetails.get("Name");
		String email = userDetails.get("Email");
		String review = userDetails.get("Review");
		
		actionsObj.fillUserDetails(name, email, review);
	}
	
	@When("I hover over the first product and click 'Add to cart'")
	public void i_hover_over_the_first_product_and_click() throws Exception {
	    actionsObj.addFirstProductToCart();
	}

	@When("I hover over the second product and click 'Add to cart'")
	public void i_hover_over_the_second_product_and_click() {
	   actionsObj.addSecondProductToCart();
	}
	

	@Then("I should see both products added to the cart")
	public void i_should_see_both_products_added_to_the_cart() {
	    verificationsObj.verifyProductsInCart("Blue Top", "Men Tshirt");
	}
	
	@Then("I should verify their prices, quantity, and total price")
	public void i_should_verify_their_prices_quantity_and_total_price() {
	    verificationsObj.verifyProductDetails();
	}
	
	@When("I increase the quantity to {int}")
	public void i_increase_the_quantity_to(int string) {
	    actionsObj.increaseProductQuantity(4);
	}

	@Then("I should verify the product is displayed in the cart with the exact quantity")
	public void i_should_verify_the_product_is_displayed_in_the_cart_with_the_exact_quantity() {
		verificationsObj.verifyProductAndQuantityInCart("Blue Top", 4); // Hardcoded parameters - fix later
	}
	
	@When("I add products to the cart")
	public void i_add_products_to_the_cart() {
	   actionsObj.clickProducts();
	   actionsObj.addFirstProductToCart();
	}
	
	@Then("I should see the cart page displayed")
	public void i_should_see_the_cart_page_displayed() {
	    verificationsObj.verifyShoppingCartPage("Shopping Cart");
	}
	
	@When("I click the 'X' button for a product")
	public void clickDeleteProductButton() throws Exception {
	    actionsObj.removeProductFromCart("1"); // Hardcoded for product ID 1; update as needed
	}
	
	
	@Then("I should see the product removed from the cart")
	public void i_should_see_the_product_removed_from_the_cart() throws Exception {
		verificationsObj.verifyProductRemovedFromCart("1"); // Hardcoded parameter - fix later
	}
	
	@Then("I should see the {string} page visible")
	public void i_should_see_the_page_visible(String pageName) {
	   verificationsObj.verifyPageVisibility(pageName);
	}
	
	@When("I enter {string} as the product name in the search input and click the search button")
	public void i_enter_as_the_product_name_in_the_search_input_and_click_the_search_button(String productName) throws Exception {
	  actionsObj.searchProduct(productName);
	}
	
	@Then("I should verify all products related to the search {string} are visible")
	public void i_should_verify_all_products_related_to_the_search_are_visible(String productName) {
	    verificationsObj.verifySearchedProducts(productName);
	}
	
	@When("I add those products to the cart")
	public void i_add_those_products_to_the_cart() throws Exception {
		actionsObj.addSearchResultsToCart();
	}

	@Then("I should verify the products in the cart")
	public void i_should_verify_the_products_in_the_cart() {
		verificationsObj.verifyProductsInCart();
	}


	@Then("I should verify the products are still visible in the cart after login")
	public void i_should_verify_the_products_are_still_visible_in_the_cart_after_login() {
	    actionsObj.viewCart();
	    verificationsObj.verifyProductsInCart();
	}
	
	@When("I scroll to the bottom of the page")
	public void i_scroll_to_the_bottom_of_the_page() throws Exception {
		actionsObj.scrollToBottom();
	}

	@Then("I should see the {string} visible")
	public void i_should_see_the_visible(String header) {
	    verificationsObj.verifyRecommendedItems(header);
	}

	@When("I click {string} on a recommended product")
	public void i_click_on_a_recommended_product(String action) throws Exception {
	    actionsObj.performActionOnRecommendedProduct(action);
	}

	@Then("I should verify the product is displayed in the cart")
	public void i_should_verify_the_product_is_displayed_in_the_cart() {
	    verificationsObj.verifyRecommendedProductInCart();
	}

}
