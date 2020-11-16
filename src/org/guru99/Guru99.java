package org.guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement dDnCountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(dDnCountry);
		List<WebElement> countryName = select.getOptions();
		for (WebElement webElement : countryName) {
			System.out.println(webElement.getText());
			
		}
		driver.quit();
	}

}
