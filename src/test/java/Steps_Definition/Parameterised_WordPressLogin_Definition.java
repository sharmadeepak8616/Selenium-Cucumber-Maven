package Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameterised_WordPressLogin_Definition {

	WebDriver driver ; 
	@Given("^Open wordpress application in \"([^\"]*)\" browser$")
	public void Open_wordpress_application_in_browser(String browserName) throws Throwable {
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.get("http://demosite.center/wordpress/wp-login.php");
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_and(String uname, String pwd) throws Throwable {

		driver.findElement(By.id("user_login")).sendKeys(uname);
		driver.findElement(By.id("user_pass")).sendKeys(pwd);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
	}

	@Then("^must successfully land on Dashboard page$")
	public void must_successfully_land_on_Dashboard_page() throws Throwable {
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
}
