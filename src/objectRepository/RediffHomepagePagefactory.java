package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePagefactory {

	WebDriver driver;
public	RediffHomepagePagefactory(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	@FindBy(id="srchword")
	WebElement searchbox;
	
	@FindBy(xpath=".//input[@type='submit']")
	WebElement Searchbutton;
	
	
	
	public WebElement searchfinder()
	{
		return searchbox;
	}
	
	public WebElement submitsearch()
	{
		return Searchbutton;
	}
	
	
}
