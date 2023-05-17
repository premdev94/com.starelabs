package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Facultycreateadmin extends Wrapper {
	
	public Facultycreateadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickfctymodule=By.xpath("//span[text()=' Faculty ']");
	By addfaculty=By.xpath("//button[text()='Add Faculty']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By firstnme=By.id("firstName");
	By lastnme=By.id("lastName");
	By registerno=By.id("registerNumber");
	By emailid=By.id("emailId");
	By mobileno=By.id("mobileNumber");
	By checkboxes=By.xpath("//input[@type='checkbox']");
	By createfaculty=By.xpath("//button[text()='Save']");
	By checkpopupmsg=By.xpath("//*[text()=' Faculty created successfully ']");
	
	
	public WebElement ClickFacultyModule()
	{
		return driver.findElement(clickfctymodule);
	}
	public WebElement AddFaculty()
	{
		return driver.findElement(addfaculty);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement FirstName()
	{
		return driver.findElement(firstnme);
	}
	public WebElement LastName()
	{
		return driver.findElement(lastnme);
	}
	public WebElement RegisterNo()
	{
		return driver.findElement(registerno);
	}
	public WebElement EmailID()
	{
		return driver.findElement(emailid);
	}
	public WebElement MobileNo()
	{
		return driver.findElement(mobileno);
	}
	public WebElement Clickcheckbox()
	{
		return driver.findElement(checkboxes);
	}
	public WebElement CreateFaculty()
	{
		return driver.findElement(createfaculty);
	}
	public WebElement Checkpopupmessage()
	{
		return driver.findElement(checkpopupmsg);
	}

}
