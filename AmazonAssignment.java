package week3Day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssignment {
	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
		   WebDriverManager.chromedriver().setup();
		   options.addArguments("--remote-allow-origins=*");
		   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");  
		   WebDriver driver = new ChromeDriver(options);
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   WebElement Ele1 = driver.findElement(By.id("twotabsearchtextbox"));
		   Ele1.sendKeys("Phone");
		   WebElement ele = driver.findElement(By.id("nav-search-submit-button"));
		   ele.click();
		   Set<String> prc = new LinkedHashSet<String>();
		   List<WebElement> GetPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		  int PriceSize = GetPrice.size();
		  for(WebElement price:GetPrice)
		  {
			  System.out.println(price.getText());
              String getUniq = price.getText();
			  boolean uniq= prc.add(getUniq);
		      System.out.println(uniq);
		  }
		  
		  if(PriceSize==prc.size()) {
	            System.out.println("No Duplicates");
	        }
	        else{
	            System.out.println("Duplicates found");
	        }
	        
	}

}
