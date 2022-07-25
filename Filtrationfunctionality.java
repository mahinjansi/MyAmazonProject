package amazonSearchFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filtrationfunctionality {

		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdrive.gecko.driver", "geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.com");
			WebElement welem = driver.findElement(By.id("twotabsearchtextbox"));
			welem.sendKeys("T-shirt");
			welem.sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(@class, 'a-dropdown-prompt')]")).click();
			driver.findElement(By.id("s-result-sort-select_3")).click(); // Checking filtering functionality by new arrival	 // Sort by low to high price
			Thread.sleep(3000);
			List<WebElement> imgList = driver.findElements(By.xpath("//div[contains(@class, 'a-section') and contains(@class, 'aok-relative') and contains(@class, 's-image-square-aspect')]"));
			int image = imgList.size();
			System.out.println("Total no of images: " + imgList.size());
			
			for (int i=0; i<imgList.size(); i++) {
		    	WebElement elem = imgList.get(i);
		    	WebElement imgElem = elem.findElement(By.tagName("img")); 	
		   	    WebElement priceElem = elem.findElement(By.xpath(".//span[@class='a-offscreen']"));
		    //	System.out.println(i+" : "+imgElem.getAttribute("src"));
		    	
		    	System.out.println(i+" : "+ priceElem.getAttribute("innerHTML")
				 + "--Link:" + imgElem.getAttribute("src"));
		    	
		  /*	WebElement nameElem = elem.findElement(By.xpath(".//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		  //  	System.out.println(i+" : "+imgElem.getAttribute("src")); 
		    	WebElement priceElem = elem.findElement(By.xpath(".//span[@class='a-offscreen']")); // Sort by low to high price
		    	
		    	System.out.println(i+" : "+ priceElem.getAttribute("innerHTML")
				 + "--Link:" + imgElem.getAttribute("src"));*/
		    	}    		

			}
	}