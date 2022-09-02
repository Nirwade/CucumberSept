package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
		
		driver.get("https://www.simplilearn.com/");
		Thread.sleep(500);	    
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
		WebElement loginlink = driver.findElement(By.className("login"));

		loginlink.click();  
	}

	@When("I enter username")
	public void i_enter_username() {
		 WebElement Username = driver.findElement(By.name("user_login")); 

		 Username.sendKeys("123@smkfkgmail.com");
	}

	@When("I enter password")
	public void i_enter_password() {
		
		 WebElement password = driver.findElement(By.name("user_pwd")); 
		 password.sendKeys("AbS!cd@1234");

		 WebElement Remer = driver.findElement(By.className("rememberMe"));
		 Remer.click();
	}

	@When("I click on the login Button")
	public void i_click_on_the_login_button() {
		
		 WebElement loginbtn = driver.findElement(By.name("btn_login")); 
		 loginbtn.click();  
	}

	@Then("I should be Landed on the home page")
	public void i_should_be_landed_on_the_home_page() {
	   
		
		System.out.println("landed on home page");
	}

	@When("I enter username {string}")
	public void i_enter_username(String Usernamval) {
		
		 WebElement username = driver.findElement(By.name("user_login")); 

		 username.sendKeys(Usernamval);
	    
	}

	@When("I enter password {string}")
	public void i_enter_password(String passwordval) {
	   
	
	WebElement password = driver.findElement(By.name("user_pwd")); 
	 password.sendKeys(passwordval);

}
	
	@Then("I should get message as {string}")
	public void i_should_get_message_as(String Expectedmsg) {
	    
		 WebElement Errmsg = driver.findElement(By.id("msg_box"));
		 String Actualmsg=Errmsg.getText();
		 Assert.assertEquals(Expectedmsg, Actualmsg);
		 
		 System.out.println("Succuessful validation");
	}
	
}
