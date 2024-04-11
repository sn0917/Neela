package Suman.Neelas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static <driver> void main(String[] args) {
		
	        WebDriver driver = new ChromeDriver();
	 
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
	        
	        Object p= driver.getCurrentUrl();
	        	        
	        System.out.println(p);
	//driver.close();
	///System.out.println("Browser is closed so test case passed");
	
	driver.findElement(By.xpath("//div//button[@class='consent-btn']")).click();	
	System.out.println("Button Found & clicked");
	driver.close();

	
	
	}

	}
	

