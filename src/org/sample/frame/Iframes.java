package org.sample.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.switchTo().frame("a077aa5e");
	WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	frame.click();
	System.out.println("done");

	//to find the elements from multiple o/p
	List<WebElement> li = driver.findElements(By.tagName("iframe"));
	System.out.println(li.size());
	
		driver.switchTo().defaultContent();
		
		
		
	}
	//driver.switchTo().parentFrame();
}

