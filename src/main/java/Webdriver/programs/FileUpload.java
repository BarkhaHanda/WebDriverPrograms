package Webdriver.programs;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FileUpload {


		
			@Test
			public static void main(String args[]) throws IOException {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("D:\\Selenium\\Projects\\WebDriverPrograms\\FileUpload (1).html");
				//driver.findElement(By.id("upload")).sendKeys("D:\\Selenium\\Projects\\sample.exe");
				driver.findElement(By.id("upload")).click();
				Runtime.getRuntime().exec("D:\\Selenium\\Projects\\sample.exe");
				
		}
}
	
