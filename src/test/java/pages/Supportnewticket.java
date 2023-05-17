package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Supportnewticket extends Wrapper {
	
	public Supportnewticket(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By supporttab=By.xpath("//span[text()='Support']");
	By newticket=By.xpath("//button[text()='New Ticket']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By subjectname=By.id("subject");
	By labname=By.xpath("//*[@formcontrolname='lab_id']");
	By comments=By.id("comment");
	By fileupload=By.xpath("//input[@id='fileDropRef']");
	By createticket=By.xpath("//*[text()=' Create ']");
	
	
	public WebElement Supporttab()
	{
		return driver.findElement(supporttab);
	}
	public WebElement Newticket()
	{
		return driver.findElement(newticket);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement Subjectname()
	{
		return driver.findElement(subjectname);
	}
	public WebElement Labname()
	{
		return driver.findElement(labname);
	}
	public WebElement Comments()
	{
		return driver.findElement(comments);
	}
	public WebElement Fileupload()
	{
		return driver.findElement(fileupload);
	}
	public WebElement Createticket()
	{
		return driver.findElement(createticket);
	}

}
