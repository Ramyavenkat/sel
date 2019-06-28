package driver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,%2Bsnapdeal");
	WebElement type = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	type.sendKeys("iphone 6");
	Thread.sleep(3000);
	WebElement sear = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
	sear.click();
	WebElement iphone = driver.findElement(By.xpath("//p[text()='Apple iphone 6s plus ( 16GB , 2 GB ) Gold']"));
	iphone.click();
	String second = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(second);
	System.out.println(all);
	for(String a : all){
		if(!second.equals(a)) {
			driver.switchTo().window(a);
			WebElement buy = driver.findElement(By.xpath("//span[text()='buy now']"));
			buy.click();
		}
		
		
	}
	
	
}
}
