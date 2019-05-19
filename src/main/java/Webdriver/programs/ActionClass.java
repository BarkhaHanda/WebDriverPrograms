package Webdriver.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	public class ActionClass {
		
		@Test
		public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("D:\\Selenium\\Projects\\WebDriverPrograms\\FileUpload (1).html");
			Actions act=new Actions(driver);					//calling Action class to perform mouse hover function
			WebElement eie=driver.findElement(By.tagName("img"));
			act.moveToElement(eie).build().perform();			//to perform mouse hover of an image.
			WebElement sel=driver.findElement(By.tagName("select"));
			
			
			Select s=new Select(sel);							//to Select an item from the list.
			//s.selectByIndex(1);
			//s.selectByValue("saab");
			s.selectByVisibleText("Saab");
			
			List<WebElement>options=s.getOptions();			//to get the size of the elements in the drop down list.
			System.out.println(options.size());
			act.contextClick().build().perform();
			}	
	}