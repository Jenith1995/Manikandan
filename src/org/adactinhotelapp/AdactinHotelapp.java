package org.adactinhotelapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelapp {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFle = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle = new File("D:\\Mani\\Selenium\\Day9\\Q8\\LoginPage.png");
		FileUtils.copyFile(srcFle, dstFle);

		WebElement txtUserId = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserId.sendKeys("Manigandan");

		WebElement txtPwd = driver.findElement(By.xpath("//input[@id='password']"));
		txtPwd.sendKeys("800107" + Keys.TAB.TAB.ENTER);

		Thread.sleep(5000);
		TakesScreenshot screenshot2 = (TakesScreenshot) driver;
		File srcFle2 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle2 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\Booking.png");
		FileUtils.copyFile(srcFle2, dstFle2);

		WebElement dDnLocation = driver.findElement(By.xpath("//select[@name='location']"));
		Select select = new Select(dDnLocation);
		List<WebElement> location = select.getOptions();
		for (WebElement webElement : location) {
			System.out.println(webElement.getText());

		}
		select.selectByVisibleText("London");

		WebElement dDnHotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select select2 = new Select(dDnHotels);
		List<WebElement> hotels = select2.getOptions();
		for (WebElement webElement1 : hotels) {
			System.out.println(webElement1.getText());

		}
		select2.selectByVisibleText("Hotel Creek");

		WebElement dDnRoom = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select select3 = new Select(dDnRoom);
		List<WebElement> Rooms = select3.getOptions();
		for (WebElement webElement2 : Rooms) {
			System.out.println(webElement2.getText());

		}
		select3.selectByVisibleText("Double");

		Thread.sleep(5000);
		WebElement dDnRoomNumber = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select select4 = new Select(dDnRoomNumber);
		List<WebElement> roomNumbers = select4.getOptions();
		for (WebElement webElement3 : roomNumbers) {
			System.out.println(webElement3.getText());

		}
		select4.selectByVisibleText("4 - Four");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		WebElement txtCheckInDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		txtCheckInDate.sendKeys("30/12/2020" + Keys.TAB);

		WebElement txtCheckOutDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		txtCheckOutDate.sendKeys("01/01/2021" + Keys.TAB);

		WebElement dDnAdultPerRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select select5 = new Select(dDnAdultPerRoom);
		List<WebElement> adultsNumbers = select5.getOptions();
		for (WebElement webElement : adultsNumbers) {
			System.out.println(webElement.getText());

		}
		select5.selectByVisibleText("4 - Four");
		WebElement dDnChilPerRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select select6 = new Select(dDnChilPerRoom);
		List<WebElement> childNumber = select6.getOptions();
		for (WebElement webElement : childNumber) {
			System.out.println("Childers are: " + webElement.getText());

		}
		select6.selectByVisibleText("3 - Three");

		TakesScreenshot screenshot3 = (TakesScreenshot) driver;
		File srcFle3 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle3 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\FillingTheRequriments.png");
		FileUtils.copyFile(srcFle3, dstFle3);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		TakesScreenshot screenshot4 = (TakesScreenshot) driver;
		File srcFle4 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle4 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\BookingConfirmation.png");
		FileUtils.copyFile(srcFle4, dstFle4);

		WebElement btnHotelSelect = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		btnHotelSelect.click();

		Thread.sleep(5000);
		TakesScreenshot screenshot5 = (TakesScreenshot) driver;
		File srcFle5 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle5 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\HotelSelection.png");
		FileUtils.copyFile(srcFle5, dstFle5);

		WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		btnContinue.click();

		Thread.sleep(5000);
		TakesScreenshot screenshot6 = (TakesScreenshot) driver;
		File srcFle6 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle6 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\BookingId.png");
		FileUtils.copyFile(srcFle6, dstFle6);

		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtFirstName.sendKeys("TestingMonday");

		WebElement txtLastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtLastName.sendKeys("VP");
		WebElement btnBookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", btnBookNow);
		
		WebElement txtAdd = driver.findElement(By.xpath("//textarea[@id='address']"));
		txtAdd.sendKeys("Chennai");

		WebElement txtCardNumber = driver.findElement(By.xpath("//input[@id='cc_num']"));
		txtCardNumber.sendKeys("1234567890123456");

		WebElement dDnCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select select7 = new Select(dDnCardType);
		List<WebElement> cardType = select7.getOptions();
		for (WebElement webElement : cardType) {
			System.out.println(webElement.getText());

		}
		select7.selectByVisibleText("American Express");

		WebElement dDnExpiryMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select select8 = new Select(dDnExpiryMonth);
		select8.selectByVisibleText("April");

		WebElement dDnExpiryYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select select9 = new Select(dDnExpiryYear);
		select9.selectByVisibleText("2022");

		WebElement txtCvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		txtCvv.sendKeys("123");

		Thread.sleep(5000);
		TakesScreenshot screenshot7 = (TakesScreenshot) driver;
		File srcFle7 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle7 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\Payment.png");
		FileUtils.copyFile(srcFle7, dstFle7);

		WebElement btnBookNow1 = driver.findElement(By.xpath("//input[@id='book_now']"));
		btnBookNow1.click();
		
		Thread.sleep(5000);
		WebElement srollDownSearch = driver.findElement(By.xpath("//input[@id='search_hotel']"));
		executor.executeScript("arguments[0].scrollIntoView(true)", srollDownSearch);
		
		WebElement txtOrderNumber = driver.findElement(By.xpath("//input[@id='order_no']"));
		String orderNumber = txtOrderNumber.getAttribute("value");
		System.out.println("The Order Number is :"+orderNumber);

		Thread.sleep(5000);
		TakesScreenshot screenshot8 = (TakesScreenshot) driver;
		File srcFle8 = screenshot.getScreenshotAs(OutputType.FILE);
		File dstFle8 = new File("D:\\Mani\\Selenium\\Day9\\Q8\\BookingIdGeneration.png");
		FileUtils.copyFile(srcFle8, dstFle8);
		driver.quit();

	}

}
