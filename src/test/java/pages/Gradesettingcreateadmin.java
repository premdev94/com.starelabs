package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Gradesettingcreateadmin extends Wrapper {
	
	public Gradesettingcreateadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickscorecardmodule=By.xpath("//span[text()=' Scorecard ']");
	By clickgradesetting=By.xpath("//span[text()='Grade Setting']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By clickplusicon=By.xpath("//form/div[1]/button");
	By gradetitle=By.xpath("(//form/div[2]/div[last()]/div/div/div/input)[1]");
	By gradefrom=By.xpath("(//form/div[2]/div[last()]/div/div/div/input)[2]");
	By gradeto=By.xpath("(//form/div[2]/div[last()]/div/div/div/input)[3]");
	By gradeupdate=By.xpath("//button[text()='Update ']");
	By checkgrdectepopupmsg=By.xpath("//*[text()=' Grade saved successfully ']");
	
	
	public WebElement ClickScorecardModule()
	{
		return driver.findElement(clickscorecardmodule);
	}
	public WebElement ClickGradeSettings()
	{
		return driver.findElement(clickgradesetting);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement ClickPlusIcon()
	{
		return driver.findElement(clickplusicon);
	}
	public WebElement GradeTitle()
	{
		return driver.findElement(gradetitle);
	}
	public WebElement GradeFrom()
	{
		return driver.findElement(gradefrom);
	}
	public WebElement GradeTo()
	{
		return driver.findElement(gradeto);
	}
	public WebElement GradeUpdate()
	{
		return driver.findElement(gradeupdate);
	}
	public WebElement CheckGradeCreatePopupMessage()
	{
		return driver.findElement(checkgrdectepopupmsg);
	}

}
