package Webdriver.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	public void ss() {
	
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");						//Opening Browser.
		TakesScreenshot shot=((TakesScreenshot)driver);				//Using Interface "TakesScreenshot" and type casting it."		
		File src=shot.getScreenshotAs(OutputType.FILE);				//shot.getScreenshotAs(OutputType.FILE); -- creating object of "TakesScreenshot" and saving output as File.
																	//File src-- saving the file in RAM.
		File dest=new File("pic.png");							//Creating new object of file as "dest" and saving the SS in it.
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
