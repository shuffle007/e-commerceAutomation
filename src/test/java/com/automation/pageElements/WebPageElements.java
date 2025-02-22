package com.automation.pageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPageElements {

	// ========================= Home Page Elements ========================= //
	@FindBy (xpath="//h2[contains(text(), 'Features Items')]")
	public WebElement homePageVerification;
	
	@FindBy (xpath = "//a[contains(text(), 'Home')]")
	public WebElement homeBtn;
	
	@FindBy (xpath= "//a[contains(text(), 'Signup / Login')]")
	public WebElement loginSignupBtn;	
	
	@FindBy (xpath= "//h2[contains(text(), 'New User Signup!')]")
	public WebElement signUpPage;
	
	// ========================= Signup Form ========================= //		
	@FindBy (xpath= "//input[@name='name']")
	public WebElement textName;	// nameField
	
	@FindBy (xpath= "//input[@data-qa='signup-email']")
	public WebElement textEmail;	

	@FindBy (xpath= "//button[contains(text(), 'Signup')]")
	public WebElement signupBtn;
	
	@FindBy (xpath= "//input[@value = 'Mr']")
	public WebElement mrRadioBtn;
	
	@FindBy (xpath= "//input[@value = 'Mrs']")
	public WebElement mrsRadioBtn;
	
	@FindBy (xpath= "//input[@name='password']")
	public WebElement txtPassword;
	
	// ========================= Dropdowns for DOB ========================= //
	@FindBy (xpath= "//select[@name='days']")
	public WebElement dayDrpDwn;
	
	@FindBy (xpath= "//select[@name='months']")
	public WebElement monthDrpDwn;
	
	@FindBy (xpath= "//select[@name='years']")
	public WebElement yearDrpDwn;
	
	@FindBy (xpath= "//section[@id='form']//h2[contains(., 'Enter Account Information')]")
	public WebElement accountInfoMsg;
	
	// ========================= Subscription Checkboxes ========================= //
	@FindBy (xpath= "//label[contains(text(), 'newsletter')]")
	public WebElement newsLetterChkBx;
	
	@FindBy (xpath= "//label[contains(text(), 'Receive special offers from our partners!')]")
	public WebElement specialOffersChkBx;
	
	// ========================= Account Details ========================= //
	@FindBy (xpath= "//input[@name='first_name']")
	public WebElement firstName;
	
	@FindBy (xpath= "//input[@name='last_name']")
	public WebElement lastName;
	
	@FindBy (xpath= "//input[@name='company']")
	public WebElement company;
	
	@FindBy (xpath= "//input[@name='address1']")
	public WebElement address;
	
	@FindBy (xpath= "//input[@name='address2']")
	public WebElement address2;
	
	@FindBy (xpath= "//select[@name='country']")
	public WebElement country;
	
	@FindBy (xpath= "//input[@name='state']")
	public WebElement state;
	
	@FindBy (xpath= "//input[@name='city']")
	public WebElement city;
	
	@FindBy (xpath= "//input[@name='zipcode']")
	public WebElement zipcode;
	
	@FindBy (xpath= "//input[@name='mobile_number']")
	public WebElement mobileNumber;
	
	@FindBy (xpath = "//button[@data-qa='create-account']")
	public WebElement createAccntBtn;
	
	@FindBy (xpath = "//h2[@data-qa='account-created']")
	public WebElement accountCreatedMessage; 
	
	@FindBy (xpath = "//a[@data-qa='continue-button']")
	public WebElement continueBtn;
	
	@FindBy (xpath = "//a[@href='/delete_account']")
	public WebElement deleteAccountButton;	
	
	@FindBy (xpath = "//b[contains(text(), 'Account Deleted!')]")
	public WebElement accountDeletedMessage;	
	
	@FindBy (xpath = "//li/a[contains(text(),'Logged in as')]")
	public WebElement loggedInUserName;
	
	// ========================= Login Page ========================= //
	@FindBy (xpath = "//h2[contains(text(), 'Login to your account')]")
	public WebElement loginPageVerification;
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	public WebElement loginEmail;
	
	@FindBy (xpath = "//input[@data-qa='login-password']")
	public WebElement loinPassword;
	
	@FindBy (xpath = "//button[@data-qa='login-button']")
	public WebElement loginBtn;
	
	@FindBy (xpath = "//p[contains(text(), 'Your email or password is incorrect!')]")
	public WebElement incorrectCredentials;
	
	@FindBy (xpath = "//a[@href='/logout']")
	public WebElement logoutBtn;
	
	@FindBy (xpath = "//p[contains(text(), 'Email Address already exist!')]")
	public WebElement emailTakenAlrt;
	
	// ========================= Contact Us Page ========================= //
	@FindBy (xpath = "//a[@href='/contact_us']")
	public WebElement contactUsBtn;
	
	@FindBy (xpath = "//h2[contains(text(), 'Get In Touch')]")
	public WebElement getInTouch;
	
	@FindBy (xpath = "//input[@name='email']")
	public WebElement contactEmail;

	@FindBy (xpath = "//input[@name='subject']")
	public WebElement txtSubject;
	
	@FindBy (xpath = "//textarea[@name='message']")
	public WebElement txtMsg; 
	
	@FindBy (xpath = "//input[@name=\"upload_file\"]")
	public WebElement uploadFile;
	
	@FindBy (xpath = "//input[@name='submit']")
	public WebElement submitBtn;
	
	@FindBy (xpath = "//div[contains(text(), 'Success! Your details have been submitted successfully.')]")
	public WebElement successMessage;	
	
	// ========================= Products Page ========================= //

	@FindBy (xpath = "//a[@href='/test_cases']")
	public WebElement testCasesBtn;
	
	@FindBy (xpath = "//a[@href='/products']")
	public WebElement productsBtn;
	
	@FindBy(xpath = "//h2[contains(text(), 'All Products')]")
	 public WebElement allProductsHeader; 
	
	@FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductTxtBx;
	
	@FindBy(xpath = "//button[@id='submit_search']")
    public WebElement submitSearchBtn;
	
	@FindBy(xpath = "//h2[contains(text(), 'Searched Products')]")
    public WebElement searchedProductsHeader;	
	
	@FindBy(xpath = "//div[@class='features_items']//div[contains(@class, 'productinfo')]/p")
    public List<WebElement> productNamesList; 
	
	@FindBy (xpath = "//a[@href='/product_details/1']")
	public WebElement viewProduct1Btn;	
	
	@FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
	public WebElement continueShoppingBtn;
	
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
	public WebElement addFirstItemtoCart;

	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
	public WebElement addSecondItemtoCart;
	
	// ========================= Product Review Page ========================= //
	
	@FindBy (xpath = "//a[@href='#reviews']")
	public WebElement writeReviewDisplay;
	
	@FindBy (xpath = "//button[@id='button-review']")
	public WebElement submitReviewBtn;
	
	@FindBy (xpath = "//span[contains(text(), 'Thank you for your review.')]")
	public WebElement reviewSubmitted;
		
	@FindBy (xpath = "//input[@id='name']")
	public WebElement reviewerName;

	@FindBy (xpath = "//input[@id='email']")
	public WebElement reviewerEmail;
	
	@FindBy (xpath = "//textarea[@name='review']")
	public WebElement reviewMsg;
	
	// ========================= Cart Elements ========================= //

	@FindBy(xpath = "(//a[@href='/view_cart'])[1]")
	public WebElement viewCartBtn;
	
	@FindBy(xpath = "//tr[@id='product-1']//h4/a")
	public WebElement cartProduct1;
	
	@FindBy(xpath = "//tr[@id='product-2']//h4/a")
	public WebElement cartProduct2;
	
	  // Locators for Product 1
    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_price']/p")
    public WebElement product1Price;

    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_quantity']/button")
    public WebElement product1Quantity;

    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_total']//p[@class='cart_total_price']")
    public WebElement product1Total;

    // Locators for Product 2
    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_price']/p")
    public WebElement product2Price;

    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_quantity']/button")
    public WebElement product2Quantity;

    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_total']//p[@class='cart_total_price']")
    public WebElement product2Total;
    
    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement productQuantityTxt;
    
    @FindBy(xpath = "//button[contains(., 'Add to cart')]")
    public WebElement addToCartBtn;
    
//  @FindBy(xpath = "//tr[contains(.,'Blue Top')]")
//  public WebElement cartProductRow;
    
    @FindBy(xpath = "//tr[@id='product-1']")
    public WebElement product1CartRow;
    
//    @FindBy(xpath = "//tr[contains(.,'Blue Top')]//td[@class='cart_quantity']/button")
//    public WebElement productQuantity;	// manual, not dynamic
    
    @FindBy(xpath = "//li[contains(., 'Shopping Cart')]")
    public WebElement shoppingCartDisplayed;
    
    @FindBy(xpath = "//tr[@id='product-1']//a[@class='cart_quantity_delete']")
    public WebElement deleteProduct1Button;

    @FindBy(xpath = "//tr[@id='product-1']")
    public WebElement product1Row;
    
    @FindBy(xpath = "//table[@id='cart_info_table']//tr[contains(@id, 'product-')]//h4/a")
    public List<WebElement> cartProductsList; 
    
    // ========================= Recommended Products ========================= //

    @FindBy(xpath = "//h2[text()='recommended items']")  
    public WebElement recommendedItemsSection;

    @FindBy(xpath = "//div[@id='recommended-item-carousel']//div[contains(@class, 'productinfo')]//p")  
    public List<WebElement> recommendedProducts;
    
    @FindBy(xpath = "//div[@id='recommended-item-carousel']//a[contains(@class, 'add-to-cart')]")  
    public List<WebElement> addToCartButtons;
    
    @FindBy(xpath = "(//a[@href = '/view_cart'])[2]")  
    public WebElement viewCartPopup;
    
    @FindBy(xpath = "(//i[@class='fa fa-angle-left'])[2]")  
    public WebElement carouselLeftArrow;

}
