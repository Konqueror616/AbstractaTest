package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Page_Base;

public class mercadoLibrePage extends Page_Base {
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "../AbstractaTest/src/test/resources/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void openURL(String URL) {
		driver.get(URL);
	}
	
	public WebElement searchBox() {		
		WebElement searchBox = driver.findElement(By.id("cb1-edit"));
		return searchBox;
	}
	
	public WebElement searchButton() {		
		WebElement searchButton = driver.findElement(By.className("nav-icon-search"));
		return searchButton;
	}
	
	public WebElement accessLinkProduct(int numberItem) {		
		WebElement accessLinkProduct = driver.findElement(By.xpath("(//ol//div[@class='ui-search-item__group ui-search-item__group--title']//a)["+numberItem+"]"));
		return accessLinkProduct;
	}
	
	public WebElement priceProduct(int numberItem) {		
		WebElement searchBox = driver.findElement(By.xpath("(//ol//div[@class=\"ui-search-price ui-search-price--size-medium\"]//span[@class='price-tag ui-search-price__part']//span[@class='price-tag-fraction'])["+numberItem+"]"));
		return searchBox;
	}
	
	public WebElement nameProduct(int numberItem) {		
		WebElement nameProduct = driver.findElement(By.xpath("(//ol//h2)["+numberItem+"]"));
		return nameProduct;
	}
	

	public void closeBrowser() {
		driver.quit();
	}
	
}
