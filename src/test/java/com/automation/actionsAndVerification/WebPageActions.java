package com.automation.actionsAndVerification;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.pageElements.WebPageElements;
import com.utilities.SetupDrivers;



import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebPageActions {

	WebPageElements locatorsObj;
	
	public WebPageActions() {
		locatorsObj = new WebPageElements();
		PageFactory.initElements(SetupDrivers.getDriver(), locatorsObj);
	}
	
	public void loadAutomationWebsite(String url) {
		SetupDrivers.getDriver().get(url);
	}
	
	public void loginOrSignUp() throws Exception {
	    WebDriverWait wait = new WebDriverWait(SetupDrivers.getDriver(), 10); 
	    wait.until(ExpectedConditions.elementToBeClickable(locatorsObj.loginSignupBtn));
	    locatorsObj.loginSignupBtn.click();;
	}

	public void setName(String name) {
		locatorsObj.textName.clear();
		locatorsObj.textName.sendKeys(name);
	}
	
	public void setEmail(String email) throws Exception {
		locatorsObj.textEmail.clear();
		locatorsObj.textEmail.sendKeys(email);
		Thread.sleep(3000);
	}
		
	public void signup() {
		locatorsObj.signupBtn.click();
	}
	
	public void fillAccountDetails(String title, String name, String password, String dob) throws Exception {
	    
		try {	
			// Selects the title based on input
			if (title.equalsIgnoreCase("Mrs")) {
				locatorsObj.mrsRadioBtn.click();
			}
			else if(title.equalsIgnoreCase("Mr")){
				locatorsObj.mrRadioBtn.click();
			}
			else {
				 throw new IllegalArgumentException("Invalid title provided: " + title);
			}
			
			locatorsObj.textName.clear();                		
		    locatorsObj.textName.sendKeys(name);                        
		    
		    // Sets Password
		    locatorsObj.txtPassword.clear();
		    locatorsObj.txtPassword.sendKeys(password);        
		     
		    // Split Date of Birth (e.g., "01/01/1990" -> ["01", "01", "1990"])
	        String[] dobParts = dob.split("-");
	        if (dobParts.length == 3) {
	            String day = dobParts[0];
	            String month = dobParts[1];
	            String year = dobParts[2];
	
	            // Select Day
	            Select dayDropdown = new Select(locatorsObj.dayDrpDwn);
	            dayDropdown.selectByVisibleText(day);
	
	            // Select Month
	            Select monthDropdown = new Select(locatorsObj.monthDrpDwn);
	            monthDropdown.selectByVisibleText(month);
	
	            // Select Year
	            Select yearDropdown = new Select(locatorsObj.yearDrpDwn);
	            yearDropdown.selectByVisibleText(year);
	        } else {
	            throw new IllegalArgumentException("Date of Birth must be in the format DD/MM/YYYY. Provided: " + dob);
	        }
	
	        System.out.println("Account details filled successfully.");
	    } catch (Exception e) {
	        System.out.println("Error while filling account details: " + e.getMessage());
	    }
		Thread.sleep(3000);
	}
	
	public void selectNewslettersAndOffers() throws Exception {
		locatorsObj.newsLetterChkBx.click();
		locatorsObj.specialOffersChkBx.click();
		Thread.sleep(3000);
	}
	
	public void accountDetails(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String number) throws InterruptedException {
		
		locatorsObj.firstName.clear();              		
	    locatorsObj.firstName.sendKeys(firstName);
	    
 		locatorsObj.lastName.clear();              		
 	    locatorsObj.lastName.sendKeys(lastName);
 	    

 		locatorsObj.company.clear();              		
 	    locatorsObj.company.sendKeys(company);

 		locatorsObj.address.clear();              		
 	    locatorsObj.address.sendKeys(address);

 		locatorsObj.address2.clear();              		
 	    locatorsObj.address2.sendKeys(address2);
 	    
 	    // Select Country from Dropdown
 		Select dropdown = new Select(locatorsObj.country);
 		dropdown.selectByVisibleText(country);

 		locatorsObj.state.clear();              		
 	    locatorsObj.state.sendKeys(state);

 		locatorsObj.city.clear();              		
 	    locatorsObj.city.sendKeys(city);

 		locatorsObj.zipcode.clear();              		
 	    locatorsObj.zipcode.sendKeys(zipcode);

 		locatorsObj.mobileNumber.clear();              		
 	    locatorsObj.mobileNumber.sendKeys(number);
    
 	    Thread.sleep(3000);
	}
	
	public void clickCreateAccount() {
		locatorsObj.createAccntBtn.click();
	}
	
	public void clickContinue() {
		locatorsObj.continueBtn.click();
	}
	
	public void deleteAccount() {
		locatorsObj.deleteAccountButton.click();
	}
	
	public void accountLogin(String username, String password) {
		locatorsObj.loginEmail.sendKeys(username);
		locatorsObj.loinPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		locatorsObj.loginBtn.click();
	}
	
	public void clickLogout() {
		locatorsObj.logoutBtn.click();
	}
	
	public void clickContactUs() {
		locatorsObj.contactUsBtn.click();
	}
	
	public void fillContactForm(String name, String email, String subject, String message) {
		locatorsObj.textName.sendKeys(name);
		locatorsObj.contactEmail.sendKeys(email);
		locatorsObj.txtSubject.sendKeys(subject);
		locatorsObj.txtMsg.sendKeys(message);
	}
	
	public void uploadFile(String filePath) throws Exception {
		locatorsObj.uploadFile.sendKeys(filePath);
		Thread.sleep(3000);
	}
	
	public void clickSubmit() throws Exception {
		locatorsObj.submitBtn.click();
		Thread.sleep(2000);
	}
	
	public void acceptPopUp() {
		SetupDrivers.getDriver().switchTo().alert().accept();
	}
	
	public void homePage() throws Exception {
		locatorsObj.homeBtn.click();
		Thread.sleep(2500);
	}
	
	public void clickProducts() {
		locatorsObj.productsBtn.click();
	}
	
	public void viewSelectProduct() {
		locatorsObj.viewProduct1Btn.click();
	}
	
	public void submitProductReview()  {
		locatorsObj.submitReviewBtn.click();
	}
	
	public void fillUserDetails(String name, String email, String review) {
		locatorsObj.reviewerName.sendKeys(name);
		locatorsObj.reviewerEmail.sendKeys(email);
		locatorsObj.reviewMsg.sendKeys(review);
	}
	
    public void addFirstProductToCart()  {
        Actions actions = new Actions(SetupDrivers.getDriver());
        actions.moveToElement(locatorsObj.addFirstItemtoCart).perform(); // Hover
        
        WebDriverWait wait = new WebDriverWait(SetupDrivers.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(locatorsObj.addFirstItemtoCart)).click();
    }
    
    public void clickContinueShopping() throws Exception  {
    	WebDriverWait wait = new WebDriverWait(SetupDrivers.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(locatorsObj.continueShoppingBtn)).click();
    	
        Thread.sleep(2000);
    }

    public void addSecondProductToCart() {
        Actions actions = new Actions(SetupDrivers.getDriver());
        actions.moveToElement(locatorsObj.addSecondItemtoCart).perform(); // Hover
        
        WebDriverWait wait = new WebDriverWait(SetupDrivers.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(locatorsObj.addSecondItemtoCart)).click();     
    }
	
    public void viewCart() {
    	locatorsObj.viewCartBtn.click();
    }
    
    public void increaseProductQuantity(int quantity) {
    	locatorsObj.productQuantityTxt.clear();
    	locatorsObj.productQuantityTxt.sendKeys("4");
    }
    
    public void addToCart() {
    	locatorsObj.addToCartBtn.click();
    }
    
    public void removeProductFromCart(String productId) throws Exception {
        switch (productId) {
            case "1":
                 locatorsObj.deleteProduct1Button.click();
                break;  
            default:
                throw new IllegalArgumentException("Invalid product ID: " + productId);
        }
        Thread.sleep(2000); 
    }
    
    public void searchProduct(String productName) throws Exception {
    	locatorsObj.searchProductTxtBx.sendKeys(productName);
    	locatorsObj.submitSearchBtn.click();
    	Thread.sleep(2000);
    }
    
    public void addSearchResultsToCart() throws Exception {
        List<WebElement> searchResults = locatorsObj.productNamesList; // Get all product name elements
        
        for (WebElement product : searchResults) {
            // Navigates to the parent product container
            WebElement productContainer = product.findElement(By.xpath("./ancestor::div[contains(@class, 'productinfo')]"));
            
            // Finds the corresponding "Add to Cart" button inside the container
            WebElement addToCartButton = productContainer.findElement(By.xpath(".//a[contains(@class, 'add-to-cart')]"));

            addToCartButton.click();
            
            clickContinueShopping();
        }
    }
    
    public void scrollToBottom() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) SetupDrivers.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", locatorsObj.recommendedItemsSection);
        Thread.sleep(2000);
    }
    
    
    private static String selectedRecommendedProductName; // Store product name

    public void performActionOnRecommendedProduct(String action) throws Exception {
        // Validate action
        if (!action.equalsIgnoreCase("Add To Cart")) {
            throw new IllegalArgumentException("Unsupported action: " + action);
        }

        // Locate all recommended product elements
        List<WebElement> recommendedProducts = locatorsObj.recommendedProducts;
        List<WebElement> addToCartButtons = locatorsObj.addToCartButtons;

        if (recommendedProducts.isEmpty() || addToCartButtons.isEmpty()) {
            throw new NoSuchElementException("No recommended products found!");
        }
        
        // Scroll carousel to first item
        locatorsObj.carouselLeftArrow.click(); 
        Thread.sleep(2000);

        // Store the selected recommended product name so it can be retrieved later 
        // via getSelectedRecommendedProductName() method
        selectedRecommendedProductName = recommendedProducts.get(0).getText().toLowerCase();  
        System.out.println("Selected Recommended Product: " + selectedRecommendedProductName);


        // Click the first "Add to Cart" button
        WebElement addToCartButton = addToCartButtons.get(0);
        WebDriverWait wait = new WebDriverWait(SetupDrivers.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
        Thread.sleep(3000); 
    }


    public static String getSelectedRecommendedProductName() {
        return selectedRecommendedProductName;
    }

    public void viewCartPopup() {
    	locatorsObj.viewCartPopup.click();
    }
  
}



