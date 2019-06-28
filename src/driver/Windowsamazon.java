package driver;

import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Windowsamazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_EAIaIQobChMIh9agn_SD4wIVgzUrCh0qEgaCEAAYASAAEgKxGvD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIh9agn_SD4wIVgzUrCh0qEgaCEAAYASAAEgKxGvD_BwE");
	WebElement ser = driver.findElement(By.xpath("//input[@type='text']"));
	ser.sendKeys("samsung phones");
	WebElement btn = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	btn.click();
	Thread.sleep(3000);
	WebElement phone = driver.findElement(By.xpath("(//span[text()='Samsung Galaxy M20 (Charcoal Black, 4+64GB)'])[1]"));
	phone.click();
	String sec = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(sec);
	System.out.println(all);
	
	//for(String x:all) {
		//if(!sec.equals(x)) {
		//driver.switchTo().window(x);
		//}
		
	//}
	//Thread.sleep(3000);



	WebElement cart = driver.findElement(By.id("add-to-cart-button"));
	cart.click();
}
}
//}
//doubt