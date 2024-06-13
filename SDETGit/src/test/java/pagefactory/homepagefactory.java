package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagefactory 
{
	WebDriver driver;
	@FindBy(xpath="//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement lbl_cart;
	
	public void iscartdisplayed()
	{
		lbl_cart.isDisplayed();
	}
	public homepagefactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
