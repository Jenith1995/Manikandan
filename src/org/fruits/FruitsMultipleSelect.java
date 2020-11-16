package org.fruits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FruitsMultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		
		WebElement dDnFruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select select= new Select(dDnFruits);
		
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		List<WebElement> fruitsEven = select.getOptions();
		for (int i = 0; i <=fruitsEven.size()-1; i++) {
			select.selectByIndex(i);
			
		}
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		System.out.println(text2);
		driver.quit();

	}

}
