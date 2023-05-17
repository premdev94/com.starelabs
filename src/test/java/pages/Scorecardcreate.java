package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Scorecardcreate extends Wrapper {
	
	public Scorecardcreate(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By scorecardtab=By.xpath("//span[text()='Scorecard']");
	By uploadtestfile=By.xpath("//*[text()=' Upload Test File ']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By labname=By.xpath("//*[@formcontrolname='lab']");
	By assessment=By.xpath("//*[@formcontrolname='assessment']");
	By codecontent=By.id("code-content");
	By fileupload=By.xpath("//input[@id='fileDropRef']");
	By submitscorecard=By.xpath("//*[text()='Submit ']");
	
	
	public WebElement Scorecardtab()
	{
		return driver.findElement(scorecardtab);
	}
	public WebElement Uploadfile()
	{
		return driver.findElement(uploadtestfile);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement Labname()
	{
		return driver.findElement(labname);
	}
	public WebElement Assessment()
	{
		return driver.findElement(assessment);
	}
	public WebElement Codecontent()
	{
		return driver.findElement(codecontent);
	}
	public WebElement Fileupload()
	{
		return driver.findElement(fileupload);
	}
	public WebElement Submitscorecard()
	{
		return driver.findElement(submitscorecard);
	}

}
