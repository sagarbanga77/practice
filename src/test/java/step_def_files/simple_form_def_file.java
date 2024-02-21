package step_def_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class simple_form_def_file {
			
		WebDriver driver; //Global variable.
	
	
		@Given("User opens the browzer and navigates to form website")
		public void user_opens_the_browzer_and_navigates_to_form_website() {
		    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://v1.training-support.net/selenium/simple-form");
		}

		@When("User enters Firstname, Lastname, Email")
		public void user_enters_firstname_lastname_email() throws InterruptedException {
			driver.findElement(By.id("firstName")).sendKeys("Chandler");
			Thread.sleep(3000);
			driver.findElement(By.id("lastName")).sendKeys("Bing");
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("cb@gmail.com");
		}

		@When("User enters contact number and message")
		public void user_enters_contact_number_and_message() {
		   System.out.println("Entered"); //Add the actual steps 
		}

		@When("User clicks on submit")
		public void user_clicks_on_submit() {
			System.out.println("Clicked");
		}

		@Then("Confirmation box should be displayed.")
		public void confirmation_box_should_be_displayed() {
			System.out.println("Displayed");
			driver.quit();;
		}	
	}

