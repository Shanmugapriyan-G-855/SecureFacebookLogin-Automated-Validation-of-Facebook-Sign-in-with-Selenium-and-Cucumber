package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\user\\eclipse-workspace\\FbCucumber\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {
			throw new IllegalArgumentException("Invalid browser name: " + browser);
		}
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void sendKeys(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public void sendKeysWithEnter(By locator, String text) {
		driver.findElement(locator).sendKeys(text + Keys.ENTER);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public static void clickbtn(WebElement ele) {
		ele.click();
	}

}
