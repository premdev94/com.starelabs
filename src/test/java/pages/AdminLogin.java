package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class AdminLogin extends Wrapper {
	
	public AdminLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.id("user_name");
	By password=By.id("password");
	By loginbutton=By.xpath("//form/div[3]/button");
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Loginbutton()
	{
		return driver.findElement(loginbutton);
	}

}
