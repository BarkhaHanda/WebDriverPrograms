package Webdriver.programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert1 {

	@Test
	public void Alert2() throws IOException {
		System.setProperty("windows.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("D:\\Selenium\\Projects\\WebDriverPrograms\\FileUpload (1).html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.tagName("button")).click();
		try {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.tagName("button")).click();
		String text=alert.getText();
		System.out.println(text);
		alert.dismiss();		
		}
	
	catch(Exception e) {
		
		System.out.println("Alert not found");
}
		
		driver.close();
	}
}