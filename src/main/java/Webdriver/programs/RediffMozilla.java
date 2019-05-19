package Webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RediffMozilla {

	@Test
	public void Login1() {
		
		System.setProperty("webdriver.firefox.driver","D:\\Selenium\\jars\\selenium-firefox-driver-2.24.1-sources.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("barkha.handa2019");
		driver.findElement(By.id("password")).sendKeys("barkhahanda@");
		driver.findElement(By.name("proceed")).click();
		driver.close();
		
	}	
}
