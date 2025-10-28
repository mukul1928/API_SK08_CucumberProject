package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters username")
	public void user_enters_username() {
	   driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr643521");
	}

	@When("user enters password")
	public void user_enters_password() {
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("esypapE");
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	}

	@When("user credentials are wrong")
	public void user_credentials_are_wrong() {
	    System.out.println("For negative testing");
	}

	@Then("an error message should be displayed on webpage")
	public void an_error_message_should_be_displayed_on_webpage() {
	//	driver.switchTo().alert().accept();
	}	
}
