package testcase;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.AdminLogin;
import pages.Facultycreateadmin;
import pages.Gradesettingcreateadmin;
import pages.Gradesettingdeleteadmin;
import pages.Groupcreateadmin;
import pages.Groupdeleteadmin;
import pages.Logout;
import pages.Studentcreateadmin;
import pages.Studentdeleteadmin;

public class Smoketest_Adminapp extends Baseclass {
	
	@Test (priority=1)
	public void adminlogin() throws InterruptedException
	{
		
		AdminLogin lp = new AdminLogin(driver);
		lp.Username().sendKeys("20ad001");
		lp.Password().sendKeys("12345");
		lp.Loginbutton().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev.digilabs.ai/dashboard");
		Thread.sleep(4000);
	}
	
	@Test (priority=2)
	public void facultycreate() throws InterruptedException
	{
		Facultycreateadmin fc = new Facultycreateadmin(driver);
		fc.ClickFacultyModule().click();
		fc.AddFaculty().click();
		Thread.sleep(3000);
		fc.Modalcontainer();
		Thread.sleep(4000);
		String FN = RandomStringUtils.randomAlphabetic(8); 
		fc.FirstName().sendKeys(FN);
		String LN = RandomStringUtils.randomAlphabetic(8); 
		fc.LastName().sendKeys(LN);
		String regno = RandomStringUtils.randomAlphanumeric(8);
		fc.RegisterNo().sendKeys(regno);
		String email = RandomStringUtils.randomAlphanumeric(8);
		fc.EmailID().sendKeys(email+"@gmail.com");
		Random random = new Random(); 
        long randomNumber = Math.abs(random.nextLong()); 
        String randomString = Long.toString(randomNumber); 
        String mobileno = randomString.substring(0, 10); 
        //System.out.println(mobileno); 
		fc.MobileNo().sendKeys(mobileno);
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		 
		 for(int i=0; i<checkboxes.size(); i++)
		 {
			 checkboxes.get(i).click();
		 }
		 Thread.sleep(3000);
		fc.CreateFaculty().click();
		Thread.sleep(3000);
		fc.Checkpopupmessage().isDisplayed();
		System.out.println(fc.Checkpopupmessage().getText());
		Thread.sleep(4000);
		
	}
	
	@Test (priority=3)
	public void studentcreate() throws InterruptedException
	{
		Studentcreateadmin sca = new Studentcreateadmin(driver);
		sca.ClickStudentModule().click();
		sca.AddStudent().click();
		Thread.sleep(3000);
		sca.Modalcontainer();
		Thread.sleep(2000);
		String FN = RandomStringUtils.randomAlphabetic(8);
		sca.StudentFirstName().sendKeys(FN);
		String LN = RandomStringUtils.randomAlphabetic(8);
		sca.StudentLastName().sendKeys(LN);
		String regno = RandomStringUtils.randomAlphanumeric(8);
		sca.StudentRegisterNo().sendKeys(regno);
		Random random = new Random(); 
        long randomNumber = Math.abs(random.nextLong()); 
        String randomString = Long.toString(randomNumber); 
        String mobileno = randomString.substring(0, 10); 
        //System.out.println(mobileno); 
		sca.Studentmobileno().sendKeys(mobileno);
		String email = RandomStringUtils.randomAlphanumeric(8);
		sca.StudentEmail().sendKeys(email+"@gmail.com");
		Select department=new Select(sca.StudentDepartment());
		department.selectByValue("ECE");
		sca.CreateStudent().click();
		Thread.sleep(3000);
		sca.CheckStudentPopupMessage().isDisplayed();
		System.out.println(sca.CheckStudentPopupMessage().getText());
		Thread.sleep(4000);
		
	}
	
	/*@Test (priority=4)
	public void studentdelete() throws InterruptedException
	{
		Studentdeleteadmin sda = new Studentdeleteadmin(driver);
		sda.ClickStudentModule().click();
		Thread.sleep(3000);
		Select display = new Select(sda.Display());
		display.selectByValue("10");
		Thread.sleep(2000);
		sda.PaginationLast().click();
		sda.DeleteCheckbox().click();
		sda.DeletedSelected().click();
		sda.Modalcontainer();
		Thread.sleep(2000);
		sda.DeleteConfirm().click();
		Thread.sleep(2000);
		sda.CheckStudentDeletePopupMessage().isDisplayed();
		System.out.println(sda.CheckStudentDeletePopupMessage().getText());
		Thread.sleep(4000);
		
	}*/
	
	@Test (priority=4)
	public void groupcreate() throws InterruptedException
	{
		Groupcreateadmin gca = new Groupcreateadmin(driver);
		gca.ClickStudentModule().click();
		gca.ClickGroupSubModule().click();
		gca.AddGroup().click();
		Thread.sleep(3000);
		gca.Modalcontainer();
		Thread.sleep(2000);
		gca.GroupName().sendKeys("Test Group - 1");
		gca.CreateGroup().click();
		Thread.sleep(3000);
		gca.CheckGroupCreatePopupMessage().isDisplayed();
		System.out.println(gca.CheckGroupCreatePopupMessage().getText());
		Thread.sleep(4000);
		
	}
	
	@Test (priority=5)
	public void groupdelete() throws InterruptedException
	{
		Groupdeleteadmin gda = new Groupdeleteadmin(driver);
		gda.ClickStudentModule().click();
		gda.ClickGroupSubModule().click();
		Thread.sleep(2000);
		Select display=new Select(gda.GroupDisplay());
		display.selectByValue("10");
		Thread.sleep(2000);
		gda.PageLast().click();
		Thread.sleep(2000);
		gda.GroupDelete().click();
		Thread.sleep(2000);
		gda.ModalContainer();
		gda.GroupConfirmDelete().click();
		Thread.sleep(2000);
		gda.CheckGroupDeletePopupMessage().isDisplayed();
		System.out.println(gda.CheckGroupDeletePopupMessage().getText());
		Thread.sleep(4000);
	}
	
	@Test (priority=6)
	public void gradesettingcreate() throws InterruptedException
	{
		Gradesettingcreateadmin gsca = new Gradesettingcreateadmin(driver);
		gsca.ClickScorecardModule().click();
		gsca.ClickGradeSettings().click();
		Thread.sleep(3000);
		gsca.Modalcontainer();
		Thread.sleep(2000);
		gsca.ClickPlusIcon().click();
		gsca.GradeTitle().sendKeys("Grade C");
		gsca.GradeFrom().sendKeys("1");
		gsca.GradeTo().sendKeys("2");
		Thread.sleep(2000);
		gsca.GradeUpdate().click();
		Thread.sleep(3000);
		gsca.CheckGradeCreatePopupMessage().isDisplayed();
		System.out.println(gsca.CheckGradeCreatePopupMessage().getText());
		Thread.sleep(4000);
	}
	
	@Test (priority=7)
	public void gradesettingdelete() throws InterruptedException
	{
		Gradesettingdeleteadmin gsda = new Gradesettingdeleteadmin(driver);
		gsda.ClickScorecardModule().click();
		gsda.ClickGradeSettings().click();
		Thread.sleep(3000);
		gsda.ModalContainer();
		Thread.sleep(2000);
		gsda.ClickDeleteIcon().click();
		Thread.sleep(2000);
		gsda.GradeUpdate().click();
		Thread.sleep(3000);
		gsda.CheckGradeDeletePopupMessage().isDisplayed();
		System.out.println(gsda.CheckGradeDeletePopupMessage().getText());
	}
	
	@Test (priority=8)
	public void signoutstarelabs() throws InterruptedException {
		 Thread.sleep(5000);
		 Logout lout = new Logout(driver);
		 lout.Adminscreenhamburgericon().click();
		 lout.Clicksignoff().click();
		 driver.close();
	}

}
