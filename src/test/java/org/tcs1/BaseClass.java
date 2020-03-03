package org.tcs1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\new workspace\\Testing project\\DemoBase\\Driver\\chromedriver.exe");
driver=new ChromeDriver();	
	}
	public static void getUrl(String value){
		driver.get(value);
	}
	public static void fill(WebElement ele, String value){
		ele.sendKeys(value);
	}
	public static void click(WebElement ele){
		ele.click();
	}
	public static void select(WebElement ele){
		Select c=new Select(ele);
		c.selectByValue("4");
	}

}
