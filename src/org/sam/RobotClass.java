package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement para = driver.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;'])[1]"));
	Actions acc=new Actions(driver);
	acc.doubleClick(para).perform();
}
}
