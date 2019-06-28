package org.sample1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com");
	WebElement search = driver.findElement(By.id("inputValEnter"));
	search.sendKeys("iphone 7");
	WebElement sear = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	sear.click();
	WebElement phone = driver.findElement(By.xpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]"));
	phone.click();
	String two = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(two);
	System.out.println(all);
	for(String x:all) {
		if(!two.equals(x)) {
			driver.switchTo().window(x);
			
		}
	}
	WebElement cli = driver.findElement(By.id("add-cart-button-id"));
	cli.click();
	Thread.sleep(2000);
	WebElement pay = driver.findElement(By.xpath("(//span[text()='Rs. 40,500'])[1]"));
	String text = pay.getText();
	System.out.println(text);
	
	
}
}
