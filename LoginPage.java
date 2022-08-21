package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	ChromeDriver driver;

	@Given("Launch the Chrome Browser")
	public void launchBrower()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			}
	@And ("Load the URL and Maximize")
	public void loadURLAndMaximize()	
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	}
	@Given("Enter the username as {string}")
	public void typeUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	@And("Enter the password as {string)")
	public void typePassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click on the Login button")
	public void clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify home page is displayed")
	public void verifyHomePage()
	{
		String attribute = driver.findElement(By.className("decorativeSubmit")).getAttribute("value");
		if(attribute.equals("Logout"))
			System.out.println("Successfully Logged In");	
		else
			System.out.println("Home page is not displayed");
	}
	@But("Verify the error message is displayed")
	public void verifyErrorMessage()
	{
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}
}
