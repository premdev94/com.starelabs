package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Groupcreateadmin extends Wrapper {
	
	public Groupcreateadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickstdmodule=By.xpath("//span[text()='Student Management']");
	By clickgroupsubmodule=By.xpath("//p[text()='Group']");
	By addgroup=By.xpath("//button[text()=' Add Group ']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By groupname=By.id("name");
	By creategroup=By.xpath("//button[text()='Save']");
	By checkgrpctepopupmsg=By.xpath("//*[text()=' Group created successfully ']");
	
	
	public WebElement ClickStudentModule()
	{
		return driver.findElement(clickstdmodule);
	}
	public WebElement ClickGroupSubModule()
	{
		return driver.findElement(clickgroupsubmodule);
	}
	public WebElement AddGroup()
	{
		return driver.findElement(addgroup);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement GroupName()
	{
		return driver.findElement(groupname);
	}
	public WebElement CreateGroup()
	{
		return driver.findElement(creategroup);
	}
	public WebElement CheckGroupCreatePopupMessage()
	{
		return driver.findElement(checkgrpctepopupmsg);
	}

}
