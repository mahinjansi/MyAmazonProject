package amazonSearchFunctionality;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaginationFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
       HashSet<String> set=new HashSet<String>();    // Creating "set" object to store all images links in the "HashSet"	
	// Adding all images from page#1 in and then page#2 To check the functionality of pagination
		System.setProperty("webdrive.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		WebElement welem = driver.findElement(By.id("twotabsearchtextbox"));
		welem.sendKeys("T-shirt");
		welem.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		
		List<WebElement> imgList = driver.findElements(By.xpath("//div[contains(@class, 'a-section') and contains(@class, 'aok-relative') and contains(@class, 's-image-square-aspect')]"));
		System.out.println("Total no of images on first page: " + imgList.size());
		int image = imgList.size();
		
		for (int i=0; i<imgList.size(); i++) {
			
	    	WebElement elem = imgList.get(i);
	    	WebElement imgElem = elem.findElement(By.tagName("img"));    	
		// 	System.out.println(i+" : "+imgElem.getAttribute("src"));
	    	String linkList =   imgElem.getAttribute("src"); // All the images links save in linkList variable
		 	set.add(linkList); // using .add() - function to add all linklist in HashSet - set object	 	
		}
		// Clicking on next page then save all images linklist into HashSet to check if there is any duplicate or not
		
		WebElement nextPagewelem = driver.findElement(By.xpath("//a[contains(@class, 's-pagination') and contains (@class, 's-pagination-next')] ")); // Clicking on NEXT button
		nextPagewelem.click();
		Thread.sleep(4000);
		List<WebElement> imgListnextPage = driver.findElements(By.xpath("//div[contains(@class, 'a-section') and contains(@class, 'aok-relative') and contains(@class, 's-image-square-aspect')]"));
		System.out.println("Total no of images on next page: " + imgListnextPage.size());
		
			for (int i=0; i<imgListnextPage.size(); i++) {
			
	    	WebElement elemnextPage = imgListnextPage.get(i);
	    	WebElement imgElemnextPage = elemnextPage.findElement(By.tagName("img"));    	
		// 	System.out.println(i+" : "+imgElem.getAttribute("src"));
	    	String linkListnextPage =   imgElemnextPage.getAttribute("src"); // All the images links save in linkList variable
		 	set.add(linkListnextPage); // using .add() - function to add all linklist in HashSet - set object	 	
		}
			WebElement thirdPagewelem = driver.findElement(By.xpath("//a[contains(@class, 's-pagination') and contains (@class, 's-pagination-next')] ")); // Clicking on NEXT button
			thirdPagewelem.click();
			Thread.sleep(4000);
			List<WebElement> imgListThirdPage = driver.findElements(By.xpath("//div[contains(@class, 'a-section') and contains(@class, 'aok-relative') and contains(@class, 's-image-square-aspect')]"));
			System.out.println("Total no of images on next page: " + imgListThirdPage.size());
			
				for (int i=0; i<imgListThirdPage.size(); i++) {
				
		    	WebElement elemThirdPage = imgListThirdPage.get(i);
		    	WebElement imgElemThirdPage = elemThirdPage.findElement(By.tagName("img"));    	
			// 	System.out.println(i+" : "+imgElem.getAttribute("src"));
		    	String linkListThirdPage =   imgElemThirdPage.getAttribute("src"); // All the images links save in linkList variable
		    	
			 	set.add(linkListThirdPage); // using .add() - function to add all linklist in HashSet - set object
				}
			
		Iterator<String> j=set.iterator();  // iterator() function print link list images
		int x = 1;
		while(j.hasNext())  
		{  
		System.out.println( x +" : " + j.next());  
		x++ ;
		}  
		
	}
}

