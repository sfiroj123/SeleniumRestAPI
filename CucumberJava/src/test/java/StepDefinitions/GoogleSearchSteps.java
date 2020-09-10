package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver=null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		String projectPath=System.getProperty("user.dir");
		
	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	@Given("user is google search page")
	public void user_is_google_search_page() throws InterruptedException {
		System.out.println("user is google search page");
		driver.get("https://google.com");
		  Thread.sleep(2000);
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
		System.out.println("user enter a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	    Thread.sleep(2000);
		
		

	}

	@When("Hits enter")
	public void hits_enter() {
		System.out.println("Hits enter");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);;
	}

	@Then("User navtigated to search results")
	public void user_navtigated_to_search_results() {
		System.out.println("User navtigated to search results");
		driver.getPageSource().contains("Online Courses");
		driver.quit();

	}


}
