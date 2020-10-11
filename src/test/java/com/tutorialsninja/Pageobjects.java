package com.tutorialsninja;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Pageobjects {
		@FindBy(xpath = "//*[@id=\'top-links\']/ul/li[2]/a/span[1]")
		WebElement myaccount;

		@FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
		WebElement register;

		@FindBy(id = "input-firstname")
		WebElement firstname;

		@FindBy(id = "input-lastname")
		WebElement lastname;

		@FindBy(id = "input-email")
		WebElement email;

		@FindBy(id = "input-telephone")
		WebElement telephone;

		@FindBy(id = "input-password")
		WebElement password;

		@FindBy(id = "input-confirm")
		WebElement confirm_password;

		@FindBy(xpath = "//*[@id=\'content\']/form/div/div/input[1]")
		WebElement check_policy;

		@FindBy(xpath = "//*[@id=\'content\']/form/div/div/input[2]")
		WebElement continue_button;

		@FindBy(xpath = "//*[@id=\'top-links\']/ul/li[2]/ul/li[5]/a")
		WebElement logout;

		@FindBy(xpath = "//*[@id=\'top-links\']/ul/li[2]/ul/li[2]/a")
		WebElement login;

		@FindBy(id = "input-email")
		WebElement login_email;

		@FindBy(id = "input-password")
		WebElement login_pwd;

		@FindBy(xpath = "//*[@id=\'content\']/div/div[2]/div/form/input")
		WebElement click_login;

		@FindBy(xpath = "//*[@id=\'form-currency\']/div/button")
		WebElement set_currency_dropdown;

		@FindBy(xpath = "//*[@id=\'form-currency\']/div/ul/li[3]/button")
		WebElement set_currency;

		@FindBy(xpath = "//*[@id=\'search\']/input")
		WebElement click_search_magnifier;

		@FindBy(xpath = "//*[@id=\'content\']/div[1]/div[2]/select")
		WebElement click_all_categories;

		@FindBy(xpath = "//*[@id=\'search\']/span/button")
		WebElement click_search_button;

		@FindBy(xpath = "//*[@id=\'content\']/div[3]/div/div/div[2]/div[2]/button[1]")
		WebElement click_add_to_cart;
		
		@FindBy(xpath="//*[@id=\'cart\']/button")
		WebElement click_cart_icon;

		@FindBy(xpath = "//*[@id=\'cart\']/ul/li[2]/div/p/a[2]")
		WebElement click_checkout;
		
		@FindBy(xpath="//*[@id=\'top-links\']/ul/li[5]/a")
		WebElement top_check_out;
		
		@FindBy(xpath="//*[@id=\'collapse-payment-address\']/div/form/div[3]/label")
		WebElement always_enter_new_address;
		
		@FindBy(xpath="//*[@id=\'collapse-shipping-address\']/div/form/div[1]")
		WebElement always_existing_delivery_address;

		@FindBy(id = "input-payment-firstname")
		WebElement payment_first_name;

		@FindBy(id = "input-payment-lastname")
		WebElement payment_lastname;

		@FindBy(id = "input-payment-address-1")
		WebElement payment_address1;

		@FindBy(id = "input-payment-city")
		WebElement payment_city1;

		@FindBy(id = "input-payment-postcode")
		WebElement payment_postcode;

		@FindBy(id = "input-payment-country")
		WebElement payment_country;

		@FindBy(id ="input-payment-zone")
		WebElement payment_region;

		@FindBy(id = "button-payment-address")
		WebElement click_Address_payment_button;

		@FindBy(xpath = "//*[@id=\'cart\']/button")
		WebElement click_cart;
		
		@FindBy (xpath="//*[@id=\'account-register\']/div[1]")
		WebElement alert;
		
		@FindBy(xpath="//*[@id=\'column-right\']/div/a[1]")
		WebElement click_the_login;
		
		@FindBy(xpath="//*[@id=\'content\']/h2[1]")
		WebElement in_my_account;
		
		@FindBy(xpath="//*[@id=\'common-success\']/ul/li[2]/a")
		WebElement click_register_successful_contd;
		
		@FindBy(xpath="//*[@id=\'column-right\']/div/a[13]")
		WebElement logout_link;
		
		@FindBy(id="button-shipping-address")
		WebElement delivery_contd;
		
		@FindBy(id="button-shipping-method")
		WebElement delivery_method_contd;
		
		@FindBy(xpath="//*[@id=\'collapse-payment-method\']/div/div[2]/div/input[1]")
		WebElement click_billing_agree_policy;
		
		@FindBy(id="button-payment-method")
		WebElement click_payment_contd;
		
		@FindBy(id="button-confirm")
		WebElement click_order_confirm;

	public Pageobjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}

	}


