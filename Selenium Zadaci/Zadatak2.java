package Jun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji:
//			Ucitava stranicu http://cms.demo.katalon.com/
//			Hvata link Cart iz navigacije
//			i ispisuje u konzoli href atribut tog taga - tj ispisace http://cms.demo.katalon.com/cart/ 
//			preko metode .getAttribute
//			i ispisuje tekst tog linka 
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cms.demo.katalon.com/");

		WebElement shopLink = driver.findElement(By.xpath("//*[@id='primary-menu']/ul/li[1]/a"));
		String b = shopLink.getAttribute("href");
		System.out.println(b);

	}

}
