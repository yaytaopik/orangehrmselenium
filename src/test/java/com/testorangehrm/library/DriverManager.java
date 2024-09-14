package com.testorangehrm.library;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	WebDriver driver;
	
	public void setupDriver() {
		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless=new");
//		options.addArguments("--start-maximized");
//		options.addArguments("--disable-blink-features=AutomationControlled");
//		options.addArguments("--disable-web-security");
//		options.addArguments("--allow-running-insecure-content");
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//Navigate to orangehrm demo
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
}
