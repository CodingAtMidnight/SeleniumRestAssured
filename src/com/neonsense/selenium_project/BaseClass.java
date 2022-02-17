package com.neonsense.selenium_project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private static WebDriver driver;
	
	public void visitWebsite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0nort\\Desktop\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspiration.com/");
	}
	
	public void spendAndSave() throws InterruptedException {
		visitWebsite();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	//TODO VERIFY
	// Trouble locating the Get Aspiration Plus option and radio options
	public void emailAddressPopUp() throws InterruptedException {
		visitWebsite();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[2]/button")).click();
		driver.switchTo( ).alert( );
	}
	
	
	
}
