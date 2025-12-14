package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		String Message = driver.getTitle();
		System.out.println("Message is" + Message);
		
		WebElement Email = driver.findElement(By.id("Email"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
		
		WebElement Password = driver.findElement(By.id("Password"));
		Password.clear();
		Password.sendKeys("admin");
		
		WebElement Loging = driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button"));
		Loging.click();
		
		System.out.println("Message is " + Loging.getText());
		
		try {
			driver.wait(6);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
		
		
		
	}
}
