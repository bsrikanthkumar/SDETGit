package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.homepagefactory;
import pagefactory.loginpagefactory;

public class PageFactoryLoginStepsDefination 
{
	static WebDriver driver;
	loginpagefactory login;
	homepagefactory home;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() 
	{
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	}

	//@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() throws InterruptedException
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password)throws InterruptedException 
	{
		login = new loginpagefactory(driver);
		login.enterUsername(username);
		login.enterpassword(password);
		
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() 
	{
	login.clickonloginbutton();
	}

	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage()
	{
		home = new homepagefactory(driver);
		home.iscartdisplayed();
		//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigated to homepage");Thread.sleep(1000);
	}

	@And("Close the browser")
	public void close_the_browser() 
	{
		driver.close();
	}
}
