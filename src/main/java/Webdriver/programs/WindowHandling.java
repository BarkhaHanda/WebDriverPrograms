package Webdriver.programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	@Test
	public void Window() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String original=driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		
		Set windows=driver.getWindowHandles();	//switch to multiple windows
		Iterator itr=windows.iterator();
		while(itr.hasNext()) {
			
			
		}
		}
	
}
