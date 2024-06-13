package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
public class POMLoginStepsDefination 
{
	static WebDriver driver;
	LoginPage login;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() 
	{
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();	
	// 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	}

	//@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() throws InterruptedException
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password)throws InterruptedException 
 
	{
		login = new LoginPage();
		login.enterUsername(username);
		login.enterPassword(password);
		
		
//		driver.findElement(By.id("user-name")).sendKeys(username);Thread.sleep(1000);
//		driver.findElement(By.id("password")).sendKeys(password);Thread.sleep(1000);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() throws InterruptedException 
	{
		login.clicklogin();Thread.sleep(1000);

	}

	@Then("User is navigated to homepage")
	public void user_is_navigated_to_home_page() throws InterruptedException 
	{
		login.isLogoDisplayed();
	//	Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigated to homepage");Thread.sleep(1000);
		
	}

	@And("Close the browser")
	public void close_the_browser() 
	{
		driver.close();
	}
}*/
