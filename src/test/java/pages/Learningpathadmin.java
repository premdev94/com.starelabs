package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Learningpathadmin extends Wrapper {
	
	public Learningpathadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickcurriculummodule=By.xpath("//span[text()=' Curriculum ']");
	By display=By.xpath("//*[@aria-label='Default select example']");
	By clicklast=By.xpath("//ul/li[3]/a");
	By clickcurriculumnme=By.xpath("//table/tbody/tr[1]/td[1]");
	By clicklearningpath=By.xpath("//*[text()=' Learning Path ']");
	By titleone=By.xpath("//input[@placeholder='Title']");
	By titletwo=By.xpath("(//input[@placeholder='Title'])[2]");
	By titlethree=By.xpath("(//input[@placeholder='Title'])[3]");
	By titlefour=By.xpath("(//input[@placeholder='Title'])[4]");
	By titlefive=By.xpath("(//input[@placeholder='Title'])[5]");
	By titlesix=By.xpath("(//input[@placeholder='Title'])[6]");
	By titleseven=By.xpath("(//input[@placeholder='Title'])[7]");
	By plusone=By.xpath("(//*[text()=' + '])[1]");
	By plustwo=By.xpath("(//*[text()=' + '])[2]");
	By plusthree=By.xpath("(//*[text()=' + '])[3]");
	By plusfour=By.xpath("(//*[text()=' + '])[4]");
	By savelearningpath=By.xpath("//*[text()=' Save ']");
	By checkpopupmessage=By.xpath("//*[text()=' Learning Path saved successfully ']");
	

	
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
		return driver.findElement(clickcurriculumnme);
	}
	public WebElement ClickLearningPath()
	{
		return driver.findElement(clicklearningpath);
	}
	public WebElement TitleOne()
	{
		return driver.findElement(titleone);
	}
	public WebElement TitleTwo()
	{
		return driver.findElement(titletwo);
	}
	public WebElement TitleThree()
	{
		return driver.findElement(titlethree);
	}
	public WebElement TitleFour()
	{
		return driver.findElement(titlefour);
	}
	public WebElement TitleFive()
	{
		return driver.findElement(titlefive);
	}
	public WebElement TitleSix()
	{
		return driver.findElement(titlesix);
	}
	public WebElement TitleSeven()
	{
		return driver.findElement(titleseven);
	}
	public WebElement PlusOne()
	{
		return driver.findElement(plusone);
	}
	public WebElement PlusTwo()
	{
		return driver.findElement(plustwo);
	}
	public WebElement PlusThree()
	{
		return driver.findElement(plusthree);
	}
	public WebElement PlusFour()
	{
		return driver.findElement(plusfour);
	}
	public WebElement SaveLearningPath()
	{
		return driver.findElement(savelearningpath);
	}
	public WebElement CheckPopupMessage()
	{
		return driver.findElement(checkpopupmessage);
	}

}
