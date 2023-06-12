package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Assigncurriculumadmin extends Wrapper {
	
	public Assigncurriculumadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickcurriculummodule=By.xpath("//span[text()=' Curriculum ']");
	By display=By.xpath("//*[@aria-label='Default select example']");
	By clicklast=By.xpath("//ul/li[3]/a");
	By clickassignbutton=By.xpath("//table/tbody/tr[1]//td[9]/div/button");
	By studentssearch=By.xpath("//input[@formcontrolname='student_search']");
	By checkboxchoose=By.name("students");
	By assignbutton=By.xpath("//*[text()='Assign']");
	By popupmessageafterassign=By.xpath("//*[text()=' Students are successfully assigned ']");
	
	
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
	public WebElement ClickAssignButton()
	{
		return driver.findElement(clickassignbutton);
	}
	public WebElement StudentSearch()
	{
		return driver.findElement(studentssearch);
	}
	public WebElement CheckboxChoose()
	{
		return driver.findElement(checkboxchoose);
	}
	public WebElement AssignButton()
	{
		return driver.findElement(assignbutton);
	}
	public WebElement PopupMessageAfterAssign()
	{
		return driver.findElement(popupmessageafterassign);
	}
}
