package Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDriven_FacebookLogin_Definition {

	
	WebDriver driver;
	@Given("^Open a \"([^\"]*)\" browser and launch facebook login page$")
	public void Open_a_browserName_browser_and_launch_facebook_login_page(String browserName) throws Throwable {
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("http://www.facebook.com");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_username_and_password(String uname, String pwd) throws Throwable {

		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

	@Then("^\"([^\"]*)\" must able to land on the home page$")
	public void  username_must_able_to_land_on_the_home_page(String uname) throws Throwable {
		System.out.println("Username is : "+uname);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
}
