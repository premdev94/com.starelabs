package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Gradesettingdeleteadmin extends Wrapper {
	
	public Gradesettingdeleteadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickscorecardmodule=By.xpath("//span[text()=' Scorecard ']");
	By clickgradesettings=By.xpath("//span[text()='Grade Setting']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By clickdeleteicon=By.xpath("//form/div[2]/div[last()]/div/div[4]/button");
	By gradeupdate=By.xpath("//button[text()='Update ']");
	By checkgradedltepopupmsg=By.xpath("//*[text()=' Grade saved successfully ']");
	
	
	public WebElement ClickScorecardModule()
	{
		return driver.findElement(clickscorecardmodule);
	}
	public WebElement ClickGradeSettings()
	{
		return driver.findElement(clickgradesettings);
	}
	public WebElement ModalContainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement ClickDeleteIcon()
	{
		return driver.findElement(clickdeleteicon);
	}
	public WebElement GradeUpdate()
	{
		return driver.findElement(gradeupdate);
	}
	public WebElement CheckGradeDeletePopupMessage()
	{
		return driver.findElement(checkgradedltepopupmsg);
	}

}
