package org.tcs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseMain extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		getUrl("https://www.toolsqa.com/automation-practice-form/");
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
fill(firstName, "Praveen");
WebElement lastName = driver.findElement(By.xpath("//input[@id='lastname']"));
fill(lastName, "Kumar");
Thread.sleep(2000);
WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
click(gender);
Thread.sleep(2000);
WebElement exp = driver.findElement(By.xpath("//input[@value='7']"));
click(exp);
Thread.sleep(2000);
WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
fill(date, "14/05/1991");
Thread.sleep(2000);
WebElement prof = driver.findElement(By.xpath("//input[@id='profession-1']"));
click(prof);

Thread.sleep(3000);
WebElement crouse = driver.findElement(By.xpath("//input[@id='tool-2']"));
click(crouse);
Thread.sleep(3000);
WebElement country = driver.findElement(By.xpath("//select[@id='continents']"));
click(country);
select(country);


	

	}

}
