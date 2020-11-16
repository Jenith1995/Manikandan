package org.fruits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fruits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		
		WebElement dDnFruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select select= new Select(dDnFruits);
		List<WebElement> fruitsEven = select.getOptions();
		for (int i = 0; i <=fruitsEven.size()-1; i++) {
			String text = fruitsEven.get(i).getAttribute("value");
			if (i%2==0) {
				System.out.println(text);
				
			}
			
		}
		driver.quit();

	}

}
