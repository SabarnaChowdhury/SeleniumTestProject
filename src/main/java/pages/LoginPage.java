package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver ;
	
	private By usernameTestBox = By.id("Email");
	private By passwordTestBox = By.id("Password");
	private By logingButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(usernameTestBox).clear();
		driver.findElement(usernameTestBox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordTestBox).clear();
		driver.findElement(passwordTestBox).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(logingButton).click();
	}

}
