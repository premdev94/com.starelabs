package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Materialuploadadmin extends Wrapper {
	
	public Materialuploadadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickcurriculummodule=By.xpath("//span[text()=' Curriculum ']");
	By display=By.xpath("//*[@aria-label='Default select example']");
	By clicklast=By.xpath("//*[text()='Last']");
	By clickcurriculumname=By.xpath("//table/tbody/tr[last()]/td[1]");
	By clickdocs=By.xpath("//*[text()='Ref Doc']");
	By linkclick=By.xpath("//*[text()='+']");
	By url1=By.id("addUrl0");
	By url2=By.id("addUrl1");
	By fileupload=By.xpath("//input[@id='fileDropRef']");
	By docssave=By.xpath("//*[text()='Save']");
	By checkpopupmsg=By.xpath("//div[@role='alert']");
	
	
	public WebElement ClickCurriculumModule()
	{
		return driver.findElement(clickcurriculummodule);
	}
	public WebElement ClickDisplay()
	{
		return driver.findElement(display);
	}
	public WebElement ClickLast()
	{
		return driver.findElement(clicklast);
	}
	public WebElement ClickCurriculumName()
	{
		return driver.findElement(clickcurriculumname);
	}
	public WebElement ClickDocs()
	{
		return driver.findElement(clickdocs);
	}
	public WebElement LinkClick()
	{
		return driver.findElement(linkclick);
	}
	public WebElement URLOne()
	{
		return driver.findElement(url1);
	}
	public WebElement URLTwo()
	{
		return driver.findElement(url2);
	}
	public WebElement FileUpload()
	{
		return driver.findElement(fileupload);
	}
	public WebElement DocsSave()
	{
		return driver.findElement(docssave);
	}
	public WebElement CheckPopupMessage()
	{
		return driver.findElement(checkpopupmsg);
	}

}
