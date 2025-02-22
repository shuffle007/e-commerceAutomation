package com.automation.actionsAndVerification;

import com.automation.pageElements.WebPageElements;
import com.utilities.SetupDrivers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class WebPageVerifications {
	
	WebPageElements locatorsObj;
	
	public WebPageVerifications() {
		locatorsObj = new WebPageElements();
		PageFactory.initElements(SetupDrivers.getDriver(), locatorsObj);
	}
	
	public void homePageVerification() {
		Assert.assertTrue(locatorsObj.homePageVerification.isDisplayed(), "Home page is not displayed!");
	}
	
	public void signupPageVerification() {
		Assert.assertEquals(locatorsObj.signUpPage.getText(), "New User Signup!", "Signup page verification failed!");
		
	}
	
	public void accountInfoSetupVerification(String message) {
		Assert.assertEquals(message, locatorsObj.accountInfoMsg.getText(), "Account info message mismatch!");
	}
	
	public void accountCreatedVerification() {
		Assert.assertEquals(locatorsObj.accountCreatedMessage.getText(), "ACCOUNT CREATED!", "Account creation message mismatch!");
	}
	
	public void verifyLoggedInMessage(String name) {
	    Assert.assertEquals(locatorsObj.loggedInUserName.getText(), "Logged in as " + name, 
	    "The logged-in message does not match the expected value!");
	}
	
	public void accountDeletedVerification() {
		Assert.assertEquals(locatorsObj.accountDeletedMessage.getText(), "ACCOUNT DELETED!", "Account deletion message mismatch!");
	}
	
	public void accountLoginPageVerification() {
		Assert.assertEquals(locatorsObj.loginPageVerification.getText(), "Login to your account", "Login page verification failed!");
	}
	
	public void incorrectCredentialsAlert() {
		Assert.assertEquals(locatorsObj.incorrectCredentials.getText(), "Your email or password is incorrect!", "Incorrect credentials alert message mismatch!");
	}
	
	public void emailTaken() {
		Assert.assertEquals(locatorsObj.emailTakenAlrt.getText(), "Email Address already exist!", "Email already exists alert mismatch!");
	}
	
	public void contactUsPageVerification() {
		Assert.assertEquals(locatorsObj.getInTouch.getText(), "Get In Touch", "Contact Us page verification failed!");
	}
	
	public void contactSubmittedVerification() {
		Assert.assertEquals(locatorsObj.successMessage.getText(), "Success! Your details have been submitted successfully.", "Contact form submission success message mismatch!");
	}
	
	public void verifyPageNavigation(String pageName) {
		Assert.assertEquals(locatorsObj.allProductsHeader.getText(), pageName, "Page navigation verification failed!");
	}
	
	public void writeReviewVerification(String message) {
		Assert.assertEquals(locatorsObj.writeReviewDisplay.getText().toLowerCase(), message.toLowerCase(), "Write review message mismatch!");
		
	}
	
	public void reviewSubmittedVerification() throws Exception {
		Assert.assertEquals(locatorsObj.reviewSubmitted.getText(), "Thank you for your review.", "Review submission message mismatch!");
		Thread.sleep(3000);
	}
	
	public void verifyProductsInCart(String productName1, String productName2) {
	    try {
	        Assert.assertTrue(locatorsObj.cartProduct1.getText().equals(productName1),
	                "First product is not found in the cart: " + productName1);
	        Assert.assertTrue(locatorsObj.cartProduct2.getText().equals(productName2),
	                "Second product is not found in the cart: " + productName2);
	        System.out.println("Both products are successfully added to the cart.");
	    } catch (NoSuchElementException e) {
	        Assert.fail("One or more products are not visible in the cart.", e);
	    }
	}
	
    public void verifyProductDetails() {
        verifySingleProductDetails(locatorsObj.product1Price, locatorsObj.product1Quantity, locatorsObj.product1Total);
        verifySingleProductDetails(locatorsObj.product2Price, locatorsObj.product2Quantity, locatorsObj.product2Total);
    }

    private void verifySingleProductDetails(WebElement priceElement, WebElement quantityElement, WebElement totalElement) {
        int price = Integer.parseInt(priceElement.getText().replace("Rs. ", "").trim());
        int quantity = Integer.parseInt(quantityElement.getText().trim());
        int total = Integer.parseInt(totalElement.getText().replace("Rs. ", "").trim());

        Assert.assertEquals(total, price * quantity, "Total price does not match price * quantity!");
    }
	
	 public void verifyProductAndQuantityInCart(String productName, int expectedQuantity) {
	        try {
	            // Check if the product row exists
	            Assert.assertTrue(locatorsObj.product1CartRow.isDisplayed(), 
	                "Product row for '" + productName + "' is not displayed in the cart!");

	            // Get the displayed quantity
	            String quantityText = locatorsObj.product1Quantity.getText().trim();
	            int actualQuantity = Integer.parseInt(quantityText);

	            // Assert the actual quantity matches the expected quantity
	            Assert.assertEquals(actualQuantity, expectedQuantity, 
	                "The quantity for product '" + productName + "' does not match the expected value!");

	            System.out.println("Verified that the product '" + productName + "' has the correct quantity: " + actualQuantity);

	        } catch (NoSuchElementException e) {
	            Assert.fail("Product '" + productName + "' is not found in the cart.", e);
	        }
	    }
	 
	 public void verifyShoppingCartPage(String message) {
		 Assert.assertEquals(locatorsObj.shoppingCartDisplayed.getText(), message, "Shopping cart page verification failed!");
	 }

	 public void verifyProductRemovedFromCart(String productId) {
		    WebDriverWait wait = new WebDriverWait(SetupDrivers.getDriver(), (10)); // Adjust timeout as needed
		    String productRowXpath = "//tr[@id='product-" + productId + "']";

		    try {
		        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(productRowXpath), 0));
		        System.out.println("Verified: Product with ID " + productId + " has been removed from the cart.");
		    } catch (org.openqa.selenium.TimeoutException e) {
		        throw new AssertionError("Product with ID " + productId + " was not removed from the cart within the timeout period.");
		    }
	}
	 
	public void verifyPageVisibility(String pageName) {
			Assert.assertEquals(locatorsObj.allProductsHeader.getText(), pageName, "Page visibility verification failed!");
	}
	 
	public void searchedProductVerification(String message) {
			Assert.assertEquals(locatorsObj.searchedProductsHeader.getText().toLowerCase(), message.toLowerCase(), "Searched product verification failed!");
	}
	 
	Set<String> topSynonyms = new HashSet<>(Arrays.asList("shirt", "blouse", "tank", "sweater", "hoodie", "tee", "t-shirt"));

	public void verifySearchedProducts(String searchKeyword) {
	    for (WebElement product : locatorsObj.productNamesList) { 
	        String productName = product.getText().toLowerCase();  
	        
	        boolean synonymFound = false;
	        for (String synonym : topSynonyms) {
	            if (productName.contains(synonym)) {
	                synonymFound = true;
	                break;
	            }
	        }
	        
	        // Check if product name contains the search keyword or any synonyms. If either is the case then the assert statement will be skipped 
	        if (!productName.contains(searchKeyword.toLowerCase()) && !synonymFound) {
                Assert.fail("Product name does not match search keyword: " + productName);
	        }
	        Assert.assertTrue(productName.contains(searchKeyword.toLowerCase()), 
	            "Product name does not match search keyword: " + productName);
	    }
	}
	
	public void verifyProductsInCart() {	    
	    // Extract product names from the cart and store them in a list (lowercased for comparison)
	    List<String> cartProductNames = locatorsObj.cartProductsList.stream()
	            .map(WebElement::getText)
	            .map(String::toLowerCase)
	            .collect(Collectors.toList());

	    // Get original search results from WebPageElements class
	    List<WebElement> searchResults = locatorsObj.productNamesList;

	    for (WebElement product : searchResults) {
	        String productName = product.getText().toLowerCase();
	        
	        // Assert that each searched product exists in the cart
	        Assert.assertTrue(cartProductNames.contains(productName), 
	            "Product not found in cart: " + productName);
	    }
	}
	
	public void verifyRecommendedItems(String header) {
		Assert.assertEquals(locatorsObj.recommendedItemsSection.getText().toLowerCase(), header.toLowerCase(), "Recommended items section verification failed!");
	}

	public void verifyRecommendedProductInCart() {
	    List<WebElement> cartItems = locatorsObj.cartProductsList;

	    if (cartItems.isEmpty()) {
	        throw new AssertionError("No products found in cart!");
	    }

	    List<String> cartProductNames = cartItems.stream()
	            .map(WebElement::getText)
	            .map(String::toLowerCase)
	            .collect(Collectors.toList());

	    // Get the stored recommended product name from WebPageActions
	    String expectedProductName = WebPageActions.getSelectedRecommendedProductName();

	    if (expectedProductName == null || expectedProductName.isEmpty()) {
	        throw new AssertionError("No recommended product name was stored!");
	    }

	    System.out.println("Expected Product Name: " + expectedProductName);
	    System.out.println("Cart Products: " + cartProductNames);

	    Assert.assertTrue(cartProductNames.contains(expectedProductName),
	            "Recommended product not found in cart: " + expectedProductName);
	}
}
