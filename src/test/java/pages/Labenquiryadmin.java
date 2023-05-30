package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.Wrapper;

public class Labenquiryadmin extends Wrapper {
	
	public Labenquiryadmin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By labenquirytab=By.xpath("//span[text()=' Labs ']");
	By enquirybutton=By.xpath("//app-labs-card-list/div/div[2]/div/div/div[2]/div[3]/div/div/span[2]");
	By contactpersonname=By.id("contact_person_name");
	By mobilenumber=By.id("mobile_number");
	By labenquirysave=By.xpath("//button[text()=' Save ']");
	By thankyoumessage=By.xpath("//*[text()=' Thank you ']");
	By buttonclose=By.className("btn-close");
	
	
	public WebElement Labenquirytab()
	{
		return driver.findElement(labenquirytab);
	}
	public WebElement Enquirybutton()
	{
		return driver.findElement(enquirybutton);
	}
	public WebElement Contactpersonname()
	{
		return driver.findElement(contactpersonname);
	}
	public WebElement Mobilenumber()
	{
		return driver.findElement(mobilenumber);
	}
	public WebElement Labenquirysave()
	{
		return driver.findElement(labenquirysave);
	}
	public WebElement Thankyoumessage()
	{
		return driver.findElement(thankyoumessage);
	}
	public WebElement Buttonclose()
	{
		return driver.findElement(buttonclose);
	}

}
