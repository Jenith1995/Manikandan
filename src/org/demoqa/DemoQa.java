package org.demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQa {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	
	WebElement dDbState = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
	Select select = new Select(dDbState);
	List<WebElement> state = select.getOptions();
	for (WebElement webElement : state) {
		System.out.println(webElement.getText());
		
	}
	}

}
