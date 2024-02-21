package step_def_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class datadrivenclass {
	
	WebDriver driver;
	
	@Given("User opens the browzer and goes to form")
	public void user_opens_the_browzer_and_goes_to_form() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://v1.training-support.net/selenium/simple-form");
	}

	@When("User enters the {string}, {string}, {string}")
	public void user_enters_the(String Firstname, String Lastname, String Email) {
		driver.findElement(By.id("firstName")).sendKeys(Firstname);
		driver.findElement(By.id("lastName")).sendKeys(Lastname);
		driver.findElement(By.id("email")).sendKeys(Email);
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String contactnumber, String message) {
	  driver.findElement(By.id("number")).sendKeys(contactnumber);
	  driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys(message);
	}

	@When("User then clicks on submit")
	public void user_then_clicks_on_submit() {
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("Confirmation box is displayed.")
	public void confirmation_box_is_displayed() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.quit();
	}
}
