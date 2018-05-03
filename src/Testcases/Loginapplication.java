package Testcases;

import objectRepository.RediffLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginapplication {
@Test
public void Login()
{
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	RediffLoginpage rd =new RediffLoginpage(driver);
	rd.emailid().sendKeys("hello");
	rd.pasword().sendKeys("12");
	rd.Loginbutton().click();
	
}
	
}
