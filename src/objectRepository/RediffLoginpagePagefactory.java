package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePagefactory {

	WebDriver driver;
public	RediffLoginpagePagefactory(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement GO;
	
	@FindBy(linkText="Home")
	WebElement Homelink;
	
	public WebElement emailid()
	{
		return username;
	}
	
	public WebElement pasword()
	{
		return password;
	}
	
	public WebElement Loginbutton()
	{
		return GO;
	}
	
	public WebElement HomeLink()
	{
		return Homelink;
	}
}
