package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Studentdeleteadmin extends Wrapper {
	
	public Studentdeleteadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickstdmodule=By.xpath("//span[text()='Student Management']");
	By display=By.xpath("//*[@aria-label='Default select example']");
	By paginationlast=By.xpath("//*[text()='»']");
	By deletecheckbox=By.xpath("//table/tbody/tr[last()]/td[8]/div/span");
	By modalcontainer=By.className("modal-content");
	By deleteconfirm=By.xpath("//form/div[2]/div/div[2]/div[2]/span/img");
	By checkstddltepopupmsg=By.xpath("//*[text()=' User deleted successfully ']");

	
	public WebElement ClickStudentModule()
	{
		return driver.findElement(clickstdmodule);
	}
	public WebElement Display()
	{
		return driver.findElement(display);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement PaginationLast()
	{
		return driver.findElement(paginationlast);
	}
	public WebElement DeleteCheckbox()
	{
		return driver.findElement(deletecheckbox);
	}
	public WebElement DeleteConfirm()
	{
		return driver.findElement(deleteconfirm);
	}
	public WebElement CheckStudentDeletePopupMessage()
	{
		return driver.findElement(checkstddltepopupmsg);
	}

}
