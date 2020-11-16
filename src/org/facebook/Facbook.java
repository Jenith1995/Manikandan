package org.facebook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facbook {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFle = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle = new File("D:\\Mani\\Selenium\\Day9\\Home.png");
		FileUtils.copyFile(srcFle, dstFle);
		
		WebElement btnCreateAcc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		btnCreateAcc.click();
		
		Thread.sleep(5000);
		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		File srcFle1 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle1 = new File("D:\\Mani\\Selenium\\Day9\\CreateAcc.png");
		FileUtils.copyFile(srcFle1, dstFle1);
		
		WebElement dDnYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select select = new Select(dDnYear);
		List<WebElement> Year = select.getOptions();
		for (int i = 1; i <= Year.size()-1; i++) {
			String totalYears = Year.get(i).getAttribute("value");
			System.out.println(totalYears);
			
		}
		
		driver.quit();

	}

}
