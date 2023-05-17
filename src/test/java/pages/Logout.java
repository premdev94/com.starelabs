package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Logout extends Wrapper {
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By hamburgericon=By.xpath("/html/body/app-root/app-features/div/div[1]/app-student-header/div[1]/div/div[2]/div[4]/img");
	By signoff=By.xpath("//*[text()='Logout ']");
	
	By adminscreenhamburgericon=By.xpath("/html/body/app-root/app-features/div/div[1]/app-header/div/div[1]/div[2]/div[3]/img");
	
	public WebElement Hamiconclick()
	{
		return driver.findElement(hamburgericon);
	}
	public WebElement Clicksignoff()
	{
		return driver.findElement(signoff);
	}
	public WebElement Adminscreenhamburgericon()
	{
		return driver.findElement(adminscreenhamburgericon);
	}

}
