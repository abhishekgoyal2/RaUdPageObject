package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {

	WebDriver driver;
public	RediffHomepage(WebDriver driver)
{
	this.driver=driver;
}
	
	
	By searchbox =By.id("srchword");
	By Searchbutton=By.xpath(".//input[@type='submit']");
	
	
	public WebElement searchfinder()
	{
		return driver.findElement(searchbox);
	}
	
	public WebElement submitsearch()
	{
		return driver.findElement(Searchbutton);
	}
	
}
