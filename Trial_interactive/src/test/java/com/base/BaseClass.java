package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;// created reference variable for WebDriver

	public static void browserLaunch(String url) {

		WebDriverManager.edgedriver().setup();// initializing driver variable using EdgeDriver

		driver = new EdgeDriver();// created method for Browser

		driver.get(url);

	}

	public static void title() {// created method for Title
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void url() {// created method for URL
		String urls = driver.getCurrentUrl();
		System.out.println(urls);
	}

	public static void maximize() {// created method for maximized
		driver.manage().window().maximize();
	}

	public static void minimize() {// created method for minimize
		driver.manage().window().minimize();
	}

	public static void dropDownMethod(WebElement element, String text) {// created method for dropDownMethod
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void dropDownText(WebElement element, String text) {// created method for dropDownText
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public static void butClick(WebElement element) {// created method for button Click
		element.click();
	}

	public static void inputText(WebElement element, String text) {// created method for sendkeys values
		element.sendKeys(text);
	}

	public static void outputText(WebElement element) {// created method for Output Text
		System.out.println(element.getText());
	}

	public static void screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + filename + ".jpng");
		FileUtils.copyFile(source, dest);
	}

	public static void waitUntilElementVisible(WebDriver driver, WebElement webElement) {
		 
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(webElement));
 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}

	public static void closeBrowser() {// close the session
		driver.close();
	}

	public static void quitBrowser() {// Quit the driver
		driver.quit();
	}

}
