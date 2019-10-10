package FbLogIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class common1 {
ChromeDriver dr;
	
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rosey\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver(); 
	}
	void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}
	void getWebSite(String url) {
		dr.get(url);
	}
	void myClick(By locator) {
		//dr.findElement(By.id("")).click();
		
		dr.findElement(locator).click();
	}
	void myType2(By locator, String value) {
		dr.findElement(locator).sendKeys(value);
	}
	void myType(WebElement element, String value) {
		//dr.findElement(By.id("")).sendKeys("");
		
		element.sendKeys(value);
	}
	void getUrl() {
		
		String url = dr.getCurrentUrl();
		System.out.println(url);
	}
	void pageTitle() {
		//if a method returns any value,N if i want to get that value. 
		//I have to assign that method to a variable
		String title = dr.getTitle(); 
		int a = 10;
		int k = a;
		System.out.println(title);
	}
	void verifyElement(By locator) {
		boolean b = dr.findElement(locator).isDisplayed();
		System.out.println("Is element displkayed ? " + b);
	}
	
	void selectValueInDropDown_visibleText(By by, String text) {
		new Select(dr.findElement(by)).selectByVisibleText(text);
	}
	
	void selectValueInDropDown_index(By by, int number) {
		new Select(dr.findElement(by)).selectByIndex(number);
	}
	
	void selectValueInDropDown_value(By by, String text) {
		new Select(dr.findElement(by)).selectByValue(text);
	}

}
