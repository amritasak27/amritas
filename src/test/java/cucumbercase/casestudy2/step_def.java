package cucumbercase.casestudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class step_def {
	WebDriver driver;
	@Given("^User is on home page$")
	public void user_is_on_home_page() {
	  driver=utilityclass.openBrowser("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  System.out.println("User is on login page");
	}

	@When("^User performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_performs_login_using_and(String a, String b) {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.name("Login")).click();
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() {
		Assert.assertEquals(driver.getTitle(), "Home");
	    driver.close();
	    System.out.println("Logged in successfully");
	    
	}

}
