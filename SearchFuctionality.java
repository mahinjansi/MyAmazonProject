package amazonSearchFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchFuctionality {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		WebElement welem = driver.findElement(By.id("twotabsearchtextbox"));
		welem.sendKeys("T-shirt");
		welem.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		
		List<WebElement> imgList = driver.findElements(By.xpath("//div[contains(@class, 'a-section') and contains(@class, 'aok-relative') and contains(@class, 's-image-square-aspect')]"));
		System.out.println("Total no of images: " + imgList.size());
		int image = imgList.size();
		
		for (int i=0; i<imgList.size(); i++) {
	    	WebElement elem = imgList.get(i);
	    	WebElement imgElem = elem.findElement(By.tagName("img"));    	
	    	System.out.println(i+" : "+imgElem.getAttribute("src"));
		}
}}






