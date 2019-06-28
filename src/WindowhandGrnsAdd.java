import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowhandGrnsAdd {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAMYAVENKAT\\Selenium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.greenstechnologys.com/");
	WebElement cont = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	Actions acc=new Actions(driver);
	acc.contextClick(cont).perform();
	//mouse over action
	Robot r=new Robot();
	//down
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	//enter
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String two = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(two);
	System.out.println(all);
	for(String x:all) {
		if(two.equals(x)) {
			driver.switchTo().window(x);
		}
	}
WebElement add = driver.findElement(By.xpath("//div[@class='address-block address-border']"));
String text = add.getText();
System.out.println(text);	

}
}
