package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;

	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	By label_logo = By.xpath("//dive[@class ='app_logo']");
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);

	}
	public void clicklogin()
	{
		driver.findElement(btn_login).click();

	}
	public void isLogoDisplayed()
	{
		driver.findElement(label_logo).isDisplayed();
	}
	public void userLogin(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}


}
