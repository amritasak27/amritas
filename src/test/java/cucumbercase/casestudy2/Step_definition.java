package cucumbercase.casestudy2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step_definition {
	WebDriver driver;
	Select select;
	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    driver=utilityclass.openBrowser("chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}

	@Given("^Click on signup link$")
	public void click_on_signup_link() throws Throwable {
		driver.findElement(By.linkText("SignUp")).click();
	}

	@Then("^Registration page is displayed$")
	public void registration_page_is_displayed() throws Throwable {
	  System.out.println("Login page is displayed");
	  
	}

	@Then("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@Then("^User enters firstname as \"([^\"]*)\"$")
	public void user_enters_firstname_as(String fname) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@Then("^User enters lastname as \"([^\"]*)\"$")
	public void user_enters_lastname_as(String lname) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@Then("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String pass) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("^User confirms password as \"([^\"]*)\"$")
	public void user_confirms_password_as(String cpass) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
	}

	@Then("^User selects gender$")
	public void user_selects_gender() throws Throwable {
		driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")).click();
	    
	}

	@Then("^User enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String mail) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
	}

	@Then("^User enters mobile number as \"([^\"]*)\"$")
	public void user_enters_mobile_number_as(String mno) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(mno);
	}

	@Then("^User enters date of birth as \"([^\"]*)\"$")
	public void user_enters_date_of_birth_as(String dob) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@Then("^User enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String add ) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(add);

	}

	@Then("^User selects security question$")
	public void user_selects_security_question() throws Throwable {
		Select select = new Select(driver.findElement(By.name("securityQuestion")));
		select.selectByIndex(1);
	}

	@Then("^User enters answer as \"([^\"]*)\"$")
	public void user_enters_answer_as(String color) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys(color);
	}

	@Then("^Click on Register$")
	public void click_on_Register() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals(driver.getTitle(), "Login");
	  driver.close();
	  System.out.println("Registration successful");
	}


}
