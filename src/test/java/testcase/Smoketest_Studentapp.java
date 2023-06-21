package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import action.Baseclass;
import pages.StudentLogin;
import pages.Logout;
import pages.Scorecardcreate;
import pages.Supportnewticket;

public class Smoketest_Studentapp extends Baseclass {
	
	@Test (priority=1)
	public void studentlogin() throws InterruptedException
	{
		StudentLogin lp = new StudentLogin(driver);
		lp.Username().sendKeys("20cse01");
		lp.Password().sendKeys("12345");
		lp.Loginbutton().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev.digilabs.ai/labs");
		Thread.sleep(3000);
	}
	
	@Test (priority=2)
	public void scorecard() throws InterruptedException
	{
		Scorecardcreate sc = new Scorecardcreate(driver);
		sc.Scorecardtab().click();
		sc.Uploadfile().click();
		Thread.sleep(3000);
		sc.Modalcontainer();
		Thread.sleep(4000);
		Select labname = new Select(sc.Labname());
		labname.selectByValue("90");
		Select assessment = new Select(sc.Assessment());
		assessment.selectByValue("2");
		sc.Codecontent().sendKeys("Test Comments");
		sc.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\1.jpg");
		Thread.sleep(2000);
		sc.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\2.jpg");
		sc.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\new.txt");
		Thread.sleep(4000);
		sc.Submitscorecard().click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=' Upload successful ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Upload successful ']")).getText());
		Thread.sleep(3000);
		
	}
	
	@Test (priority=3)
	public void supportnewticket() throws InterruptedException
	{
		Supportnewticket nt = new Supportnewticket(driver);
		Thread.sleep(2000);
		nt.Supporttab().click();
		nt.Newticket().click();
		Thread.sleep(3000);
		nt.Modalcontainer();
		Thread.sleep(3000);
		nt.Subjectname().sendKeys("New Ticket-1");
		Select labname = new Select(nt.Labname());
		labname.selectByValue("89");
		nt.Comments().sendKeys("New Comments");
		nt.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\1.jpg");
		Thread.sleep(2000);
		nt.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\2.jpg");
		nt.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\files.zip");
		nt.Fileupload().sendKeys("C:\\Users\\premk\\Downloads\\Files\\sample.mp4");
		nt.Createticket().click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=' New ticket created successfully ']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//*[text()=' New ticket created successfully ']")).getText());
		Thread.sleep(4000);
	}
	
	@Test (priority=4)
	public void signoutstarelabs() throws InterruptedException {
		 Thread.sleep(5000);
		 Logout lout = new Logout(driver);
		 lout.Hamiconclick().click();
		 lout.Clicksignoff().click();
		 driver.close();
	}

}
