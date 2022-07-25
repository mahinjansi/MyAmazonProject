package amazonSearchFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateNextPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/s?k=T-shirt&page=4&crid=1FCU1K1L2PDRG&qid=1658492227&sprefix=%2Caps%2C62&ref=sr_pg_3");
	WebElement welem = driver.findElement(By.id("twotabsearchtextbox")); 
		welem.sendKeys("T-shirt");
		welem.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		
		System.out.println("Checking search functionality of allowed to move on next page by clicking on NEXT button");
//	welem = driver.findElement(By.xpath("//a[contains(@class, 's-pagination') and contains (@class, 's-pagination-next')] ")); // Clicking on NEXT button
	//welem	= driver.findElement(By.xpath("//a[contains(@aria-label, 'Go to page 3')]")); // Clicking on #3 button
	//	welem = driver.findElement(By.xpath("//a[contains(@aria-label, 'Go to page 2')]")); // Clicking on #2 button
	//	welem = driver.findElement(By.xpath("//a[contains(@aria-label, 'Go to page 4')]")); // Clicking on #4 button
//	WebElement welem = driver.findElement(By.xpath("//a[contains(@aria-label, 'Go to page 5')]")); // Clicking on #5 button
	//	driver.findElement(By.xpath("span[contains(@class, 's-pagination-item') and contains (@class, 's-pagination-previous')]")) ;// Clicking on previous button
		
welem.sendKeys(Keys.RETURN);
	
//driver.close();
				
	}

}
