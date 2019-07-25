package skeleton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class signup {
	static WebDriver driver;
	@FindBy(name="userName") 
	public static WebElement un; 
	@FindBy(name="firstName") 
	public static WebElement fn;
	@FindBy(name="lastName") 
	public static WebElement ln;
	@FindBy(id="password") 
	public static WebElement pswd;
	@FindBy(id="pass_confirmation") 
	public static WebElement cpswd;
	@FindBy(id="emailAddress") 
	public static WebElement emailaddr;
	@FindBy(id="mobileNumber") 
	public static WebElement mobile;
	@FindBy(id="address") 
	public static WebElement addr;
	@FindBy(id="answer") 
	public static WebElement ans;
	@FindBy(id="dob") 
	public static WebElement dob1;
	@FindBy(name="securityQuestion") 
	public static WebElement dropdown;
	@FindBy(name="gender") 
	public static List <WebElement> d ;
	@FindBy(name="Submit") 
	public static WebElement ok;
	public void security_qn() {
		Select s=new Select(dropdown);
		s.selectByVisibleText("What is your favour color?");
	}
	public void enter_the_gender() {
	    //List <WebElement> d=driver.findElements(By.name("gender"));
	    d.get(0).click();
	}
	public void register()
	{
		un.sendKeys("sudeepdarsh");
		fn.sendKeys("ssss");
		ln.sendKeys("llll");
		pswd.sendKeys("123welcome");
		cpswd.sendKeys("123welcome");
		enter_the_gender();
		emailaddr.sendKeys("abc@gmail.com");
		mobile.sendKeys("9876543290");
		dob1.sendKeys("04/29/1996");
		addr.sendKeys("jdfjzsfjdsa");
		security_qn();
		ans.sendKeys("perundurai");
		ok.click();
	}	
}
