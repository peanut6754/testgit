package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.fblogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFacebook {


	
	WebDriver driver;
	fblogin bp;

	{
		
	}
	
	
		
	@Given("^user is in the facebook login page$")
	public void user_is_in_the_facebook_login_page() throws InterruptedException  {
	    
		   
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
				
			
			   driver = new ChromeDriver();
		 	
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 
			 
			 driver.navigate().to("https://www.facebook.com/r.php");
		
			 Thread.sleep(2000);
	}
	@When("^user enter the first \"([^\"]*)\"name$")
	public void user_enter_the_first_name(String firstname) {
	 bp.getfirstName().sendKeys(firstname);  
	}

	@When("^user enter the last\"([^\"]*)\" name$")
	public void user_enter_the_last_name(String arg1) {
		
	}

	@When("^user enter the\"([^\"]*)\" email$")
	public void user_enter_the_email(String arg1) {
	}

	@When("^user enter the \"([^\"]*)\"password$")
	public void user_enter_the_password(String arg1) {
	}

	@When("^user select the \"([^\"]*)\"  month$")
	public void user_select_the_month(String arg1) {
	}

	@When("^user select the \"([^\"]*)\" day$")
	public void user_select_the_day(String arg1) {
	}

	@When("^user select the \"([^\"]*)\" year$")
	public void user_select_the_year(String arg1) {
	}

	@When("^user select a \"([^\"]*)\"gender$")
	public void user_select_a_gender(String arg1) {
	   
	}

	@When("^user click on \"([^\"]*)\"the signup buttom$")
	public void user_click_on_the_signup_buttom(String arg1) {
	}


	
}
