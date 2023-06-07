package facultytestcase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import pages.Assigncurriculumadmin;
import pages.Curriculumcreateadmin;
import pages.Deletecurriculumadmin;
import pages.Facultycreateadmin;
import pages.Gradesettingcreateadmin;
import pages.Gradesettingdeleteadmin;
import pages.Groupcreateadmin;
import pages.Groupdeleteadmin;
import pages.Labenquiryadmin;
import pages.Learningpathadmin;
import pages.Logout;
import pages.Materialuploadadmin;
import pages.Studentcreateadmin;
import pages.Studentdeleteadmin;

public class Smoketest_Facultyapp extends Baseclass {
	
	@Test (priority=1)
	public void adminlogin() throws InterruptedException
	{
		
		AdminLogin lp = new AdminLogin(driver);
		lp.Username().sendKeys("20FAC500");
		lp.Password().sendKeys("12345");
		lp.Loginbutton().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev.digilabs.ai/dashboard");
		Thread.sleep(4000);
	}
	
	@Test (priority=2)
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
	
	@Test (priority=3)
	public void groupcreate() throws InterruptedException
	{
		Groupcreateadmin gca = new Groupcreateadmin(driver);
		gca.ClickStudentModule().click();
		gca.ClickGroupSubModule().click();
		gca.AddGroup().click();
		Thread.sleep(3000);
		gca.Modalcontainer();
		Thread.sleep(2000);
		String GN = RandomStringUtils.randomAlphabetic(8);
		gca.GroupName().sendKeys("Z"+GN);
		gca.CreateGroup().click();
		Thread.sleep(3000);
		gca.CheckGroupCreatePopupMessage().isDisplayed();
		System.out.println(gca.CheckGroupCreatePopupMessage().getText());
		Thread.sleep(4000);
		
	}
	
	@Test (priority=4)
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
	
	@Test (priority=5)
	public void labenquiry() throws InterruptedException
	{
		Labenquiryadmin lea = new Labenquiryadmin(driver);
		lea.Labenquirytab().click();
		lea.Enquirybutton().click();
		Thread.sleep(3000);
		String personname = RandomStringUtils.randomAlphabetic(8);
		lea.Contactpersonname().sendKeys(personname);
		Random random = new Random(); 
        long randomNumber = Math.abs(random.nextLong()); 
        String randomString = Long.toString(randomNumber); 
        String mobileno = randomString.substring(0, 10); 
        //System.out.println(mobileno);
		lea.Mobilenumber().sendKeys(mobileno);
		lea.Labenquirysave().click();
		Thread.sleep(2000);
		lea.Thankyoumessage().isDisplayed();
		System.out.println(lea.Thankyoumessage().getText());
		Thread.sleep(2000);
		lea.Buttonclose().click();
		Thread.sleep(4000);
	}
	
	@Test (priority=6)
	public void curriculumcreate() throws InterruptedException
	{
		Curriculumcreateadmin cca = new Curriculumcreateadmin(driver);
		cca.ClickCurriculumModule().click();
		cca.AddCurriculum().click();
		Thread.sleep(3000);
		String curriculamname = RandomStringUtils.randomAlphabetic(8);
		cca.CurriculumName().sendKeys("Z"+curriculamname);
		String curriculamcode = RandomStringUtils.randomAlphabetic(8);
		cca.CurriculumCode().sendKeys(curriculamcode);
		Select labname=new Select(cca.LabName());
		labname.selectByValue("Apache");
		Thread.sleep(2000);
		//Select faculty=new Select(cca.FacultyName());
		//faculty.selectByVisibleText("Anil");
		cca.StudentsEnrolled().sendKeys("10");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(date); 
		c.add(Calendar.DATE, 1);
		date = c.getTime();
		String date1= dateFormat.format(date);
		cca.StartDate().sendKeys(date1);
		cca.EndDate().sendKeys("31-12-2023");
		Thread.sleep(3000);
		cca.LabPlanningCheckbox().click();
		cca.AddSlot().click();
		Thread.sleep(2000);
		Select slothours=new Select(cca.SlotHours());
		slothours.selectByValue("90");
		Thread.sleep(2000);
		cca.SlotTimeFix().click();
		cca.SlotTimeSet().click();
		cca.SlotSave().click();
		Thread.sleep(3000);
		cca.CurriculumSubmit().click();
		Thread.sleep(2000);
		cca.CurriculumPopupMessage().isDisplayed();
		System.out.println(cca.CurriculumPopupMessage().getText());
		Thread.sleep(4000);
		
	}
	
	@Test (priority=7)
	public void curriculumassign() throws InterruptedException
	{
		Assigncurriculumadmin aca = new Assigncurriculumadmin(driver);
		aca.ClickCurriculumModule().click();
		Thread.sleep(2000);
		Select display = new Select(aca.Display());
		display.selectByValue("10");
		Thread.sleep(2000);
		aca.ClickLast().click();
		aca.ClickAssignButton().click();
		aca.StudentSearch().sendKeys("20cse01");
		Thread.sleep(2000);
		aca.CheckboxChoose().click();
		aca.AssignButton().click();
		Thread.sleep(2000);
		aca.PopupMessageAfterAssign().isDisplayed();
		System.out.println(aca.PopupMessageAfterAssign().getText());
		Thread.sleep(4000);
		
	}
	
	@Test (priority=8)
	public void materialuploadcurriculum() throws InterruptedException
	{
		Materialuploadadmin muc = new Materialuploadadmin(driver);
		muc.ClickCurriculumModule().click();
		Thread.sleep(2000);
		Select display = new Select(muc.ClickDisplay());
		display.selectByValue("10");
		Thread.sleep(2000);
		muc.ClickLast().click();
		Thread.sleep(3000);
		muc.ClickCurriculumName().click();
		muc.ClickDocs().click();
		muc.LinkClick().click();
		muc.LinkClick().click();
		muc.URLOne().sendKeys("https://dev.digilabs.ai/curriculum/284?status=1");
		muc.URLTwo().sendKeys("https://dev.digilabs.ai/curriculum/284?status=2");
		muc.FileUpload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\1.jpg");
		Thread.sleep(2000);
		muc.FileUpload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\2.jpg");
		muc.FileUpload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\files.zip");
		muc.FileUpload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\sample.mp4");
		muc.DocsSave().click();
		Thread.sleep(2000);
		muc.CheckPopupMessage().isDisplayed();
		System.out.println(muc.CheckPopupMessage().getText());
		Thread.sleep(4000);
	}
	
	@Test (priority=9)
	public void learningpathcurriculum() throws InterruptedException
	{
		Learningpathadmin lpa = new Learningpathadmin(driver);
		lpa.ClickCurriculumModule().click();
		Thread.sleep(2000);
		Select display = new Select(lpa.ClickDisplay());
		display.selectByValue("10");
		Thread.sleep(2000);
		lpa.ClickLast().click();
		Thread.sleep(3000);
		lpa.ClickCurriculumName().click();
		lpa.ClickLearningPath().click();
		lpa.TitleOne().sendKeys("Main Path-1");
		lpa.PlusTwo().click();
		lpa.TitleTwo().sendKeys("Sub Path-1");
		lpa.PlusOne().click();
		lpa.TitleThree().sendKeys("Main Path-2");
		lpa.PlusThree().click();
		lpa.TitleFour().sendKeys("Sub Path-2-1");
		lpa.PlusThree().click();
		lpa.TitleFive().sendKeys("Sub Path-2-2");
		Thread.sleep(2000);
		lpa.PlusOne().click();
		lpa.TitleSix().sendKeys("Main Path-3");
		lpa.PlusFour().click();
		lpa.TitleSeven().sendKeys("Sub Path-3-1");
		Thread.sleep(2000);
		lpa.SaveLearningPath().click();
		lpa.CheckPopupMessage().isDisplayed();
		System.out.println(lpa.CheckPopupMessage().getText());
		Thread.sleep(4000);
	}
	
	@Test (priority=10)
	public void deletecurriculum() throws InterruptedException
	{
		Deletecurriculumadmin dca = new Deletecurriculumadmin(driver);
		dca.ClickCurriculumModule().click();
		Thread.sleep(2000);
		Select display1 = new Select(dca.Display());
		display1.selectByValue("10");
		Thread.sleep(2000);
		dca.ClickLast().click();
		dca.ClickDeleteIcon().click();
		Thread.sleep(2000);
		dca.DeleteConfirm().click();
		Thread.sleep(2000);
		dca.CheckPopupMessageAfterDelete().isDisplayed();
		System.out.println(dca.CheckPopupMessageAfterDelete().getText());
		Thread.sleep(4000);
		
	}
	
	@Test (priority=11)
	public void signoutstarelabs() throws InterruptedException {
		 Thread.sleep(5000);
		 Logout lout = new Logout(driver);
		 lout.Adminscreenhamburgericon().click();
		 lout.Clicksignoff().click();
		 driver.close();
	}

}
