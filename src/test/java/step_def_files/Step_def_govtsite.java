package step_def_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_def_govtsite {
	
	WebDriver driver;
	
	@Given("User is on the govt website and on create new account page")
	public void user_is_on_the_govt_website_and_on_create_new_account_page() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.get("https://www.india.gov.in/user/register");
		   driver.manage().window().maximize();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String Username, String Emailaddress) {

		driver.findElement(By.id("edit-name")).sendKeys(Username);
		driver.findElement(By.id("edit-mail")).sendKeys(Emailaddress);
	}

	@When("User enters {string}, {string}, {string},{string},{string}")
	public void user_enters(String  FirstName, String LastName, String Country, String PINCode, String Education) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-first-name-und-0-value']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-last-name-und-0-value']")).sendKeys(LastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='edit-profile-main-field-country-und']")).sendKeys(Country);
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-pin-code-und-0-value']")).sendKeys(PINCode);
		driver.findElement(By.xpath("//select[@id='edit-profile-main-field-education-und']")).sendKeys(Education);
	}

	@When("Selects the checkbox and provide a {string}")
	public void selects_the_checkbox_and_provide_a(String Text) {
		driver.findElement(By.className("form-checkbox")).click();
		driver.findElement(By.name("captcha_response")).sendKeys(Text);
	}

	@When("Clicks on Create New Account")
	public void clicks_on_create_new_account() {
		driver.findElement(By.id("edit-submit")).click();
		
	}

	@Then("Message should be displayed")
	public void message_should_be_displayed() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}


}
