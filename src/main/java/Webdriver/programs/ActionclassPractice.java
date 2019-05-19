package Webdriver.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class ActionclassPractice {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Selenium\\Projects\\WebDriverPrograms\\FileUpload (1).html");
		Actions act=new Actions(driver);
		WebElement webe=driver.findElement(By.tagName("img"));
		act.moveToElement(webe).build().perform();	//to perform mouse hover of an image.
		WebElement web1=driver.findElement(By.tagName("select"));
		Select s1=new Select(web1);
		s1.selectByValue("saab");
	
		List<WebElement>options=s1.getOptions();
		System.out.println(options.size());
		act.contextClick().build().perform();
	
	}
	
	
}
