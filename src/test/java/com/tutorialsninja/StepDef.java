package com.tutorialsninja;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	private WebDriver driver = null;
	private Pageobjects po = null;
	private String bodyText = null;
	
	public StepDef() {
		System.out.println(" Path :: " + System.getProperty("user.home"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/chromedriver");
		driver = new ChromeDriver();
		po = new Pageobjects(driver);
	}

	@Given("^navigate to ninja tutorials page$")
	public void navigate_to_ninja_tutorials_page() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver.navigate().to("http://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

	@When("^I click myaccount and click register$")
	public void i_click_myaccount_and_click_register() throws Throwable {
		po.myaccount.click();
		po.register.click();

	}
	
	@And("^I enter all required input and click continue$")
	public void i_enter_all_required_input_and_click_continue(DataTable dt) throws Throwable {
	   List<Map<String, String>> signUpForms = dt.asMaps(String.class, String.class);
	   String currentTimeInMillis = String.valueOf(System.currentTimeMillis());
	   
	   for(Map<String, String> signUpForm : signUpForms) {
		   po.firstname.sendKeys(signUpForm.get("firstname"));
		   po.lastname.sendKeys(signUpForm.get("lastname"));
		   po.email.sendKeys(currentTimeInMillis + "_" + signUpForm.get("email"));
		   po.telephone.sendKeys(signUpForm.get("telephone"));
		   po.password.sendKeys(signUpForm.get("password"));
		   po.confirm_password.sendKeys(signUpForm.get("confirmpassword"));
		   po.check_policy.click();
		   po.continue_button.click();
		   bodyText = driver.findElement(By.tagName("body")).getText();
		   boolean neededLogout = Boolean.valueOf(signUpForm.get("logout"));
		   System.out.println("NeededLogout :: " + neededLogout);
		   if(neededLogout) {
			   po.logout_link.click();
			   po.myaccount.click();
			   po.register.click();
		   }
	   }
	}
	
	
	@Then("^get the response$")	
	public void get_the_response(DataTable dataTable) throws Throwable {
		List<String> actual = dataTable.asList(String.class);
		Assert.assertTrue(bodyText.contains(actual.get(0)));
		Thread.sleep(1000);
		driver.quit();
	}

	@When("^I enter First name as \"([^\"]*)\"$")
	public void i_enter_First_name_as(String first_name) throws Throwable {
		first_name = "Amudharanjani";
		po.firstname.sendKeys(first_name);
	}

	@When("^I enter last name as \"([^\"]*)\"$")
	public void i_enter_last_name_as(String last_name) throws Throwable {
		last_name = "P";
		po.lastname.sendKeys(last_name);
	}

	@When("^I enter Email as \"([^\"]*)\"$")
	public void i_enter_Email_as(String Email) throws Throwable {
		Email = System.currentTimeMillis() + "_test@gmail.com";
		po.email.sendKeys(Email);
	}

	@When("^I enter telephone as \"([^\"]*)\"$")
	public void i_enter_telephone_as(String telephone) throws Throwable {
		telephone = "9962083032";
		po.telephone.sendKeys(telephone);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pwd) throws Throwable {
		pwd = "amu@3398";
		po.password.sendKeys(pwd);

	}

	@When("^I enter password confirm as \"([^\"]*)\"$")
	public void i_enter_password_confirm_as(String confirm_pwd) throws Throwable {
		confirm_pwd = "amu@3398";
		po.confirm_password.sendKeys(confirm_pwd);
	}

	@When("^aggre the privacy policy$")
	public void aggre_the_privacy_policy() throws Throwable {
		po.check_policy.click();
	}

	@When("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		po.continue_button.click();

		/*
		 * if (po.alert.isDisplayed()) { po.click_the_login.click();
		 * po.login_email.sendKeys("test@gmail.com");
		 * po.login_pwd.sendKeys("amudha@3398"); po.click_login.click(); }
		 */

		po.click_register_successful_contd.click();
	}

	@Then("^i click login$")
	public void i_click_login() throws Throwable {
		Assert.assertEquals(po.logout_link.isDisplayed(), true);
		Thread.sleep(1000);
		driver.quit();
	}
	
	

	@Given("^navigate to tutorialsninja login page$")
	public void navigate_to_tutorialsninja_login_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/account");
		driver.manage().timeouts().implicitlyWait(5000L, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

	@When("^i login by entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_by_entering_and(String email, String pwd) throws Throwable {
		email = "pamudharanjani@gmail.com";
		pwd = "amudha@3398";
		po.login_email.sendKeys(email);
		po.login_pwd.sendKeys(pwd);
		po.click_login.click();
	}

	@When("^select your type of currency$")
	public void select_your_type_of_currency() throws Throwable {
		po.set_currency_dropdown.click();
		po.set_currency.click();

	}

	@When("^click on search box and add your search text as \"([^\"]*)\"$")
	public void click_on_search_box_and_add_your_search_text_as(String search_input) throws Throwable {
		search_input = "iPhone";
		po.click_search_magnifier.sendKeys(search_input);
		po.click_search_button.click();

	}

	@When("^add your fliter criteria as \"([^\"]*)\"$")
	public void add_your_fliter_criteria_as(String filter_criteria) throws Throwable {
		filter_criteria = "Phones & PDAs";
		po.click_all_categories.sendKeys(filter_criteria);
		po.click_add_to_cart.click();
		Thread.sleep(2000);

	}

	@When("^click add to cart and check out$")
	public void click_add_to_cart_and_check_out() throws Throwable {
		// po.top_check_out.click();

		po.click_cart_icon.click();
		po.click_checkout.click();

	}

	@When("^enter your billing details like f_name, l_name, Address, City, Postcode, country, region/state as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter_your_billing_details_like_f_name_l_name_Address_City_Postcode_country_region_state_as(
			String f_name, String l_name, String Address, String City, String Postcode, String country, String region)
			throws Throwable {
		po.always_enter_new_address.click();
		f_name = "amudha";
		l_name = "p";
		Address = "Abc street, abc town";
		City = "Coimbatore";
		Postcode = "641035";
		country = "India";
		Thread.sleep(2000);
		region = "a";
		po.payment_first_name.sendKeys(f_name);
		po.payment_lastname.sendKeys(l_name);
		po.payment_address1.sendKeys(Address);
		po.payment_city1.sendKeys(City);
		po.payment_postcode.sendKeys(Postcode);
		po.payment_country.sendKeys(country);
		po.payment_region.sendKeys(region);
		po.click_Address_payment_button.click();

	}

	@When("^enter your delivery details and click continue$")
	public void enter_your_delivery_details_and_click_continue() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		po.click_Address_payment_button = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'button-shipping-address\']")));

		po.click_Address_payment_button.click();
	}

	@When("^enter your delivery method and click continue$")
	public void enter_your_delivery_method_and_click_continue() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		po.delivery_contd = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'button-shipping-method\']")));
		po.delivery_contd.click();
	}

	@When("^enter your payment method and click continue$")
	public void enter_your_payment_method_and_click_continue() throws Throwable {

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
po.click_billing_agree_policy=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'collapse-payment-method\']/div/div[2]/div/input[1]")));
		po.click_billing_agree_policy.click();
		po.click_payment_contd.click();

	}

	@Then("^confirm your order$")
	public void confirm_your_order() throws Throwable {
		po.click_order_confirm.click();
	}

}
