package Webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffChrome {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("barkha.handa2019");
		driver.findElement(By.id("password")).sendKeys("barkhahanda@");
		driver.findElement(By.name("proceed")).click();
		driver.close();
		}
}
