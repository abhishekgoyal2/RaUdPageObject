package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

public	RediffLoginpage(WebDriver driver)
{
	this.driver=driver;
}
	WebDriver driver;
	
	By username =By.xpath(".//*[@id='login1']");
	By password =By.xpath(".//*[@id='password']");
	By go= By.name("proceed");
	By homelinktext=By.linkText("Home");
	
	public WebElement emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement pasword()
	{
		return driver.findElement(password);
	}
	
	public WebElement Loginbutton()
	{
		return driver.findElement(go);
	}
	
	public WebElement HomeLink()
	{
		return driver.findElement(homelinktext);
	}
}
