package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement user = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
				user.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.cssSelector("#password"));
				pass.sendKeys("ijjnkjj ");
		WebElement loginbutton = driver.findElement(By.cssSelector("#login-button"));
				loginbutton.click();
//		WebElement passtest= driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
//		boolean flag = passtest.isDisplayed();
//		if(flag) {
//			System.out.print("test case pass");
//		}
//		else {
//			System.out.print(" test case fail"); 
//		}
//		driver.close();
		
		WebElement worng = driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
		String expectedText = worng.getText();
		System.out.println(expectedText);
		if(expectedText.contains("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("password is correct");
		}
		else {
			System.out.println("password is incorrect");
		}
		driver.close();
		
		
				
				
		
		
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		
		
	
	}

}
