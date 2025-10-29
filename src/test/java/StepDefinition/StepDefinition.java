package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Before
	public void beforeTest() {
		System.out.println("This is before hooks");
	}

	@After
	public void afterTest() {
		System.out.println("This is after hooks");
	}

	@Before("@sanity")
	public void beforeTest1() {
		System.out.println("I will only run before tag sanity");
	}

	@After("@sanity")
	public void afterTest1() {
		System.out.println("I will only run after tag sanity");
	}

	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		// driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		System.out.println("submit button clicked");
	}

	/*
	 * @When("user credentials are wrong") public void user_credentials_are_wrong()
	 * { System.out.println("For negative testing"); }
	 * 
	 * @Then("an error message should be displayed on webpage") public void
	 * an_error_message_should_be_displayed_on_webpage() {
	 * driver.switchTo().alert().accept(); }
	 */

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

	}

	@Given("user logins into the web page")
	public void user_logins_into_the_web_page() {
		System.out.println("Login succesfull");
	}

	@Given("user enters credentials")
	public void user_enters_credentials() {
		System.out.println("credentials enters");
	}

	@Given("user searches as item")
	public void user_searches_as_item() {
		System.out.println("item searched");
	}

	@Given("user adds the item at the cart")
	public void user_adds_the_item_at_the_cart() {
		System.out.println("item added");
	}

	@Then("user verifies item added to cart")
	public void user_verifies_item_added_to_cart() {
		System.out.println("validation successfull");
	}
	
	@Given("user navigates to homepage of application")
	public void user_navigates_to_homepage_of_application() {
			System.out.println("Navigation to home page successfull");
	  	}

	@Then("user verifies the page title")
	public void user_verifies_the_page_title() {
	   System.out.println("page title verified");
	}

}
