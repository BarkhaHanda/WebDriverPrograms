package Webdriver.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class RediffIE {

	@Test
	public void Login2() {
		
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\jars\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("login1")).sendKeys("barkha.handa2019");
		driver.findElement(By.id("password")).sendKeys("barkhahanda@");
		driver.findElement(By.name("proceed")).click();
		driver.close();
	
	}
}
