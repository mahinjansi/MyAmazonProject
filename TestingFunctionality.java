package amazonSearchFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingFunctionality {

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdrive.gecko.driver", "geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.amazon.com");
				WebElement welem = driver.findElement(By.id("twotabsearchtextbox")); 
				welem.sendKeys("T-shirt");
				welem.sendKeys(Keys.RETURN);
				Thread.sleep(5000);
				
				List<WebElement> imgList = driver.findElements(By.xpath("//div[contains(@class,'a-section') and contains(@class, 'a-spacing-base')]"));
				System.out.println("Total no of images: " + imgList.size());
				
				for (int i=0; i<imgList.size(); i++) { 
			    	WebElement elem = imgList.get(i);
			    	
			    WebElement imgElem = elem.findElement(By.tagName("img"));    	
			   	WebElement priceElem = elem.findElement(By.xpath(".//span[@class='a-offscreen']"));
			   	WebElement reviewsElem = elem.findElement(By.xpath(".//span[@class='a-icon-alt']"));
			   	WebElement ratingsElem = elem.findElement(By.xpath(".//span[@class='a-size-base s-underline-text']"));
			   	WebElement nameElem = elem.findElement(By.xpath(".//span[@class='a-size-base-plus a-color-base a-text-normal']"));
			   	
			   	
 System.out.println(i+" : "+nameElem.getAttribute("innerHTML")+ "= "+ priceElem.getAttribute("innerHTML")+ "--Reviews: "
+ reviewsElem.getAttribute("innerHTML") + "--Total Rating : " + ratingsElem.getAttribute("innerHTML")
+ "--Link:" + imgElem.getAttribute("src"));
			    	
			    //findElements(By.xpath(".//span[contains(@class,'a-offscreen')]"));*********INCORRECT PATH CODE**********
//System.out.println(i + ": "+ priceElem.getAttribute("innerHTML")+ ", tag name: " + priceElem.getTagName() 
			    	//	+ ", hash value: " + priceElem.hashCode()); //*********CODE IS WORKING PROPERLY *********
			//  priceElem.getAttribute("innerHTML")) ;//- IS USE TO FIND VALUE (PRICE)OR TAXT FROM THE ELEMENTS*********
 //     reviewsElem.getAttribute("innerHTML")); **** TO GET THE REVIEW 
//  ratingsElem.getAttribute("innerHTML"); **** TO GET THE STAR
			    }
	driver.close();
			}		
}

