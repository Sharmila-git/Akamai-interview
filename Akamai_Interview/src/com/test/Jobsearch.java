package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jobsearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharmi\\Downloads\\eclipse-jee-mars-2-win32-x86_64 (1)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://akamaijobs.referrals.selectminds.com/");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.name("keyword"));
		element1.sendKeys("Test");
		element1.sendKeys(Keys.TAB);	
		Thread.sleep(5000);	
		WebElement location = driver.findElement(By.xpath("//input[@class='default']"));
		Select select = new Select(location);
		select.selectByVisibleText("Krakow, Poland");
		driver.findElement(By.id("jSearchSubmit")).click();
		

	}

}
