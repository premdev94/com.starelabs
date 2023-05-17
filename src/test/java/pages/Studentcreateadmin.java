package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Studentcreateadmin extends Wrapper {
	
	public Studentcreateadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickstdmodule=By.xpath("//span[text()='Student Management']");
	By addstudent=By.xpath("//button[text()='Add Students']");
	By modalcontainer=By.xpath("(//div[@class='modal-content'])[2]");
	By stdfirstnme=By.id("first_name_001");
	By stdlastnme=By.id("last_name_001");
	By stdregno=By.id("register_number");
	By stdmbeno=By.id("mobile_number");
	By stdemail=By.id("email");
	By stddepartment=By.id("department");
	By createstudent=By.xpath("//button[text()=' Save ']");
	By checkstdpopupmsg=By.xpath("//*[text()=' Student created successfully ']");
	
	
	public WebElement ClickStudentModule()
	{
		return driver.findElement(clickstdmodule);
	}
	public WebElement AddStudent()
	{
		return driver.findElement(addstudent);
	}
	public WebElement Modalcontainer()
	{
		return driver.findElement(modalcontainer);
	}
	public WebElement StudentFirstName()
	{
		return driver.findElement(stdfirstnme);
	}
	public WebElement StudentLastName()
	{
		return driver.findElement(stdlastnme);
	}
	public WebElement StudentRegisterNo()
	{
		return driver.findElement(stdregno);
	}
	public WebElement Studentmobileno()
	{
		return driver.findElement(stdmbeno);
	}
	public WebElement StudentEmail()
	{
		return driver.findElement(stdemail);
	}
	public WebElement StudentDepartment()
	{
		return driver.findElement(stddepartment);
	}
	public WebElement CreateStudent()
	{
		return driver.findElement(createstudent);
	}
	public WebElement CheckStudentPopupMessage()
	{
		return driver.findElement(checkstdpopupmsg);
	}

}
