package Testcases;

import objectRepository.RediffHomepage;
import objectRepository.RediffLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginapplication {
@Test
public void Login() throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	RediffLoginpage rd =new RediffLoginpage(driver);
	rd.emailid().sendKeys("hello");
	rd.pasword().sendKeys("12");
//	rd.Loginbutton().click();
	rd.HomeLink().click();
	
	RediffHomepage rh=new RediffHomepage(driver);
	rh.searchfinder().sendKeys("mobile");
Thread.sleep(400);
	rh.submitsearch().click();
}
	
}
