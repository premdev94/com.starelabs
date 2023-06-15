package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Groupdeleteadmin extends Wrapper {
	
	public Groupdeleteadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickstdmodule=By.xpath("//span[text()='Student Management']");
	By clickgroupsubmodule=By.xpath("//p[text()='Group']");
	By groupdisplay=By.xpath("//select[@aria-label='Default select example']");
	By pagelast=By.xpath("//*[text()='»']");
	By groupdelete=By.xpath("//table/tbody/tr[2]/td[4]/div/img[2]");
	By modalcontainer=By.className("modal-content");
	By groupcfrmdelete=By.xpath("//button[text()='Confirm']");
	By checkgrpdltepopupmsg=By.xpath("//*[text()=' Group deleted successfully ']");
	
	public WebElement ClickStudentModule()
	{
		return driver.findElement(clickstdmodule);
	}
	public WebElement ClickGroupSubModule()
	{
		return driver.findElement(clickgroupsubmodule);
	}
	public WebElement GroupDisplay()
	{
		return driver.findElement(groupdisplay);
	}
	public WebElement PageLast()
	{
		return driver.findElement(pagelast);
	}
	public WebElement GroupDelete()
	{
		return driver.findElement(groupdelete);
	}
	public WebElement ModalContainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement GroupConfirmDelete()
	{
		return driver.findElement(groupcfrmdelete);
	}
	public WebElement CheckGroupDeletePopupMessage()
	{
		return driver.findElement(checkgrpdltepopupmsg);
	}

}
