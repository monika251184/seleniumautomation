package selenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject=new ChromeDriver();
		browserObject.get("https://www.amazon.com");
		browserObject.manage().window().maximize();
		Select itemSelect=new Select(browserObject.findElement(By.name("url")));
		itemSelect.selectByVisibleText("Computers");
		Thread.sleep(4000);
		browserObject.findElement(By.id("twotabsearchtextbox")).sendKeys("dell pc");
		browserObject.findElement(By.id("nav-search-submit-button")).click();
		browserObject.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		browserObject.navigate().back();
		browserObject.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[12]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		browserObject.close();		
	}

}
