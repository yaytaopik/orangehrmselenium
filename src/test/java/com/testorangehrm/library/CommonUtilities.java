package com.testorangehrm.library;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.JavascriptExecutor;

public class CommonUtilities {
	
	public WebDriver driver;

	public CommonUtilities(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void sendKeys(By locator, String input) {
		driver.findElement(locator).sendKeys(input);
	}
	
	public void isDisplayed(By locator) {
		driver.findElement(locator).isDisplayed();
	}
	
}
