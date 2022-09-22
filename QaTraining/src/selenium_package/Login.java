package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
		  //1. setup the property of chromedriver to pass value to form input box through chrome web browser.
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		    // 2. Initialize Webdriver object through ChromeDriver class.
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("https://admin-demo.nopcommerce.com/login");
		  WebElement email=  browserObject.findElement(By.name("Email"));
		  WebElement password =   browserObject.findElement(By.name("Password"));
		  email.clear();
		  password.clear();
		  email.sendKeys("admin@yourstore.com");
		  password.sendKeys("admin");
browserObject.findElement(By.className("login-button")).click();
	}

}
