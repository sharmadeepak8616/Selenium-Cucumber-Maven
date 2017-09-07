package Steps_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Simple_WordPressLogin_Definition {
	
	WebDriver driver;
	
	@Given("^Open wordpress application in chrome browser$")
	public void Open_wordpress_application_in_chrome_browser() throws Throwable
	{
		
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");

	}

	@When("^I enter valid username and password$")
	public void I_enter_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.id("user_login")).sendKeys("admin");;
		driver.findElement(By.id("user_pass")).sendKeys("demo123");;
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();

	}

	@Then("^I must successfully land on Dashboard page$")
	public void I_must_successfully_land_on_Dashboard_page() throws Throwable {
		
		System.out.println(driver.getTitle());

	}

	
	
	
	

}
