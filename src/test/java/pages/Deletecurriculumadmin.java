package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Deletecurriculumadmin extends Wrapper {
	
	public Deletecurriculumadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickcurriculummodule=By.xpath("//span[text()=' Curriculum ']");
	By display=By.xpath("//*[@aria-label='Default select example']");
	By clicklast=By.xpath("//*[text()='Last']");
	By clickdeleteicon=By.xpath("//table/tbody/tr[last()]/td[8]/div/div/img");
	By deleteconfirm=By.xpath("//button[text()='Confirm']");
	By checkpopupmsgafterdlte=By.xpath("//*[text()=' Curriculum deleted successfully ']");
	
	
	public WebElement ClickCurriculumModule()
	{
		return driver.findElement(clickcurriculummodule);
	}
	public WebElement Display()
	{
		return driver.findElement(display);
	}
	public WebElement ClickLast()
	{
		return driver.findElement(clicklast);
	}
	public WebElement ClickDeleteIcon()
	{
		return driver.findElement(clickdeleteicon);
	}
	public WebElement DeleteConfirm()
	{
		return driver.findElement(deleteconfirm);
	}
	public WebElement CheckPopupMessageAfterDelete()
	{
		return driver.findElement(checkpopupmsgafterdlte);
	}
}
