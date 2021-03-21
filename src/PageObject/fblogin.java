package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fblogin {

	
	WebDriver driver;
	
	public fblogin (WebDriver x ) {
	driver=x;	
		

		
		}
	public WebElement getfirstName() {
	WebElement firstname= 
			driver.findElement(By.name("firstname"));
	return firstname;
	
	
	}
	
	public WebElement getfirstLast() {
		WebElement x = driver.findElement(By.name("lastname"));
		return x;	
}
	
	public WebElement getEmail() {
		WebElement x = driver.findElement(By.name("reg_email__"));
		return x;		
	
}
	public WebElement getPasw() {
		WebElement x = driver.findElement(By.name("reg_passwd__"));
		return x;			
	
}
	public WebElement Month() {
		WebElement x = driver.findElement(By.name("0"));
		return x;		

}
	public WebElement day() {
		WebElement x = driver.findElement(By.name("1"));
		return x;		
	
}
	public WebElement year() {
		WebElement x = driver.findElement(By.name("1988"));
		return x;		
	
}
	public WebElement gender() {
		WebElement x = driver.findElement(By.xpath("//*[@id=\"u_0_5_GK\"]"));
		return x;			
}
	public WebElement SignUp() {
		WebElement x = driver.findElement(By.xpath("//*[@id=\"u_0_13_FY\"]"));
		return x;				
	
}
	
}