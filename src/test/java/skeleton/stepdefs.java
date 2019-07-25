package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class stepdefs {
	WebDriver driver;
	@Given("open the homepage")
	public void open_the_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}
	@Given("register the product")
	public void register_the_product() {
		signup regis = PageFactory.initElements(driver, signup.class);
		regis.register();
	}
	@Given("login the page")
	public void login_the_page() {
		login loginpage = PageFactory.initElements(driver, login.class);
		loginpage.login();
	}

	@Given("search the product")
	public void search_the_product() {
		search searchpage = PageFactory.initElements(driver, search.class);
		searchpage.search1();
	}
}
