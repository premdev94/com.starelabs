package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Curriculumcreateadmin extends Wrapper {
	
	public Curriculumcreateadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickcurriculummodule=By.xpath("//span[text()=' Curriculum ']");
	By addcurriculum=By.xpath("//button[text()=' Add Curriculum ']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By curriculumnme=By.id("curriculamName");
	By curriculumcode=By.id("curriculumCode");
	By labname=By.id("lab_name");
	By facultyname=By.id("faculty_name");
	By studentsenrolled=By.id("allocated_students");
	By startdate=By.xpath("//input[@formcontrolname='start_date']");
	By enddate=By.xpath("//input[@formcontrolname='end_date']");
	By labplanningcheckbox=By.xpath("(//div[@class='lab-planning-custom-checkbox'])[1]");
	By addslot=By.xpath("(//b[text()='Add'])[1]");
	By slothours=By.xpath("//select[@formcontrolname='slot_hours']");
	By slottimefix=By.xpath("//form/div/div[2]/div/div[2]");
	By slottimeset=By.xpath("//button[text()='Set']");
	By slotsave=By.xpath("//button[text()='Save']");
	By curriculumsubmit=By.xpath("//button[text()='Submit']");
	By curriculumpopupmessage=By.xpath("//*[text()=' Curriculum created successfully ']");
	
	
	public WebElement ClickCurriculumModule()
	{
		return driver.findElement(clickcurriculummodule);
	}
	public WebElement AddCurriculum()
	{
		return driver.findElement(addcurriculum);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement CurriculumName()
	{
		return driver.findElement(curriculumnme);
	}
	public WebElement CurriculumCode()
	{
		return driver.findElement(curriculumcode);
	}
	public WebElement LabName()
	{
		return driver.findElement(labname);
	}
	public WebElement FacultyName()
	{
		return driver.findElement(facultyname);
	}
	public WebElement StudentsEnrolled()
	{
		return driver.findElement(studentsenrolled);
	}
	public WebElement StartDate()
	{
		return driver.findElement(startdate);
	}
	public WebElement EndDate()
	{
		return driver.findElement(enddate);
	}
	public WebElement LabPlanningCheckbox()
	{
		return driver.findElement(labplanningcheckbox);
	}
	public WebElement AddSlot()
	{
		return driver.findElement(addslot);
	}
	public WebElement SlotHours()
	{
		return driver.findElement(slothours);
	}
	public WebElement SlotTimeFix()
	{
		return driver.findElement(slottimefix);
	}
	public WebElement SlotTimeSet()
	{
		return driver.findElement(slottimeset);
	}
	public WebElement SlotSave()
	{
		return driver.findElement(slotsave);
	}
	public WebElement CurriculumSubmit()
	{
		return driver.findElement(curriculumsubmit);
	}
	public WebElement CurriculumPopupMessage()
	{
		return driver.findElement(curriculumpopupmessage);
	}

}
