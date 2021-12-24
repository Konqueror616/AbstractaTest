package pagesObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Page_Base;

public class googlePage extends Page_Base {
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "../SimetrikTest/src/test/resources/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	public WebElement searchBox() {		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		return searchBox;
	}
	
	public List<WebElement> results(){		
		List<WebElement> resultsElements = driver.findElements(By.xpath("//div[@id=\"rso\"]/div"));
		return resultsElements;		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
}
