package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
static WebDriver driver;
@FindBy(name="userName") 
public static WebElement un; 
@FindBy(name="password") 
public static WebElement pswd;
@FindBy(xpath="//input[@name='Login']")
public static WebElement ok;
public void login(){
	un.sendKeys("lalitha");
	pswd.sendKeys("password123");
	ok.click();
}
}
