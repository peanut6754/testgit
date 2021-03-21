package stepDef;


	
	
{
		
		WebDriver driver;
	
		
		 {
		   
		   //setting up property and location for chromedriver  
			 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
			
			// Open up the chrome browser instance 
			
			ChromeDriver driver = new ChromeDriver();
		 	
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().deleteAllCookies();
			 driver.navigate().to("https://www.facebook.com/");
		
			Threed.sleep(2000);
			
		
	}
		
		
		   
		 @Given("^user is on the  yahoo sign up page$")
			public void user_is_on_the_yahoo_sign_up_page()  { 	
		
	
		 }
	@When("^user enters first name$")
	public void user_enters_first_name()  {
	   
		driver.findElement(By.name("firstname")).sendkeys("michael");
	}

	@When("^user enters last name$")
	public void user_enters_last_name()  {
	    
	}

	@When("^user enters new email address$")
	public void user_enters_new_email_address()  {
	    
	}

	@When("^user enter new password$")
	public void user_enter_new_password()  {
	    
	}

	@Then("^user should see the values in the text boxes$")
	public void user_should_see_the_values_in_the_text_boxes()  {
	   
	}


}