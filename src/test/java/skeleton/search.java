package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class search {
	static WebDriver driver;
	@FindBy(xpath="//*[@id=\"myInput\"]")
	public static WebElement search_field;
	@FindBy(xpath="/html/body/div[1]/form/input")
	public static WebElement ok;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")
	public static WebElement add_cart;		
	@FindBy(partialLinkText="Cart")
	public static WebElement view;	
	@FindBy(xpath="//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")
	public static WebElement remove;	
	public void search1(){
		search_field.sendKeys("headphone");
		ok.click();
		add_cart.click();
		view.click();
		remove.click();
}
	//name="products"
}