package Jun1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati program koji ucitava stranicu Zadatak3.html
//		I na stranici dodaje 20 poruka “IT Bootcamp”
//		Potrebno  je u svakoj iteraciji kliknuti na dugme Show in
//		Sacekati da se novi element pojavi pre nego sto se doda sledeci

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Maja/Desktop/Zadatak3.html");

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		for (int i = 0; i < 20; i++) {
			driver.findElement(By.id("showInBtn")).click();
			WebDriverWait waiter = new WebDriverWait(driver, 30);
			WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-" + i))); 
			System.out.println(element.getText());
		}

	}

}
