package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSetp {
	WebDriver driver=null;
@Given("Browser is open for Login")
public void browser_is_open_for_login() {
	System.out.println("Browser is open");
	String projectPath=System.getProperty("user.dir");
	
System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
}

@Given("User is on login page")
public void user_is_on_login_page() {
	driver.get("https://example.testproject.io/web/");
}



@When("^user enter(.*) and (.*)for Demo$")

public void user_enter_username_and_password_for_demo(String uname, String pass) {	driver.findElement(By.id("name")).sendKeys("Raghav");

driver.findElement(By.id("name")).sendKeys(uname);
driver.findElement(By.id("password")).sendKeys(pass);
driver.findElement(By.id("login")).click();

 
}
@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	driver.findElement(By.id("logout")).isDisplayed();
	driver.close();
}
}
