package cucumbercase.casestudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class Step_def_sce {
	WebDriver driver;
	WebDriverWait wait;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		   driver=utilityclass.openBrowser("chrome");
		    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User enters valid credentials and performs login$")
	public void user_enters_valid_credentials_and_performs_login() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));		
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@Then("^User must be navigated to the home page of TestMeApp$")
	public void user_must_be_navigated_to_the_home_page_of_TestMeApp() throws Throwable {
	    Assert.assertEquals(driver.getTitle(),"Home");
	}

	@Given("^Alex should be on home page$")
	public void alex_should_be_on_home_page() throws Throwable {
	    System.out.println("Redirected to home page");
	}

	@When("^Alex enters the first four letters of the product$")
	public void alex_enters_the_first_four_letters_of_the_product() throws Throwable {
	    driver.findElement(By.name("products")).sendKeys("head");
	}

	@When("^Selects the product from list and clicks on find details$")
	public void selects_the_product_from_list_and_clicks_on_find_details() throws Throwable {
	  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("^Alex is redirected to the product page$")
	public void alex_is_redirected_to_the_product_page() throws Throwable {
	  Assert.assertEquals(driver.getTitle(),"Search");
	
	}
	@When("^Add the product to cart$")
	public void add_the_product_to_cart() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("^Select cart link$")
	public void select_cart_link() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@When("^Navigate to view cart$")
	public void navigate_to_view_cart() throws Throwable {
		  Assert.assertEquals(driver.getTitle(), "View Cart");
	}

	@When("^Checkout$")
	public void checkout() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		Assert.assertEquals(driver.getTitle(), "Cart Checkout");
	}

	@When("^Proceed to pay$")
	public void proceed_to_pay() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Proceed to Pay']")).click();
	}

	@When("^Navigate to payment page$")
	public void navigate_to_payment_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Redirecting to Payment Gateway");
	}

	@When("^Payment Gateway$")
	public void payment_Gateway() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,100);
  	  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/h3"),"Net Banking"));
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();
  	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
  	  driver.findElement(By.name("username")).sendKeys("123456");
  	  driver.findElement(By.name("password")).sendKeys("Pass@456");
  	  driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
  	  //driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
  	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
  	  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	}

	@When("^Order Details$")
	public void order_Details() throws Throwable {
		 Assert.assertEquals(driver.getTitle(), "Order Details");
    	
	}

	@Then("^Signout$")
	public void signout() throws Throwable {
		 driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		  driver.close();
	}


	@Given("^Alex should be in home page$")
	public void Alex_should_be_in_home_page()
	{
		 Assert.assertEquals(driver.getTitle(),"Home");
	}
	@When("^Alex enters the first four letters$")
	public void Alex_enters_the_first_four_letters() throws Throwable {
		 driver.findElement(By.name("products")).sendKeys("golu");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("^No message displayed$")
	public void no_message_displayed() throws Throwable {
		 Assert.assertEquals(driver.getTitle(),"Search");
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText();
		 driver.close();
		 //String temp= "Sorry no products available in this category. Please try some other";
		 /*if(text.equals(temp))
		 {
			 System.out.println("Successful");
			 driver.close();
		 }
		 else
		 {
			 System.out.println("Unsuccessful");
			 driver.close();
		 }
		// Assert.assertEquals(driver.getTitle(),"Home");
	*/
	}

}
