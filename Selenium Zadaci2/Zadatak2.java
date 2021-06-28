package Domaci7jun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zadatak2 {
//	Napisati TestNG test koji:
//		Ucitava stranicu https://www.udemy.com/
//		Klikcemo na dugme Buy Now i
//		Proveravamo da li nas sajt vodi na stranicu za registrovanje. 
//		Neki od nacina za proveru su:
//		Da li se u naslovu stranice javlja tekst Sign Up and Start Learning!
//		Da li se na stranici prikazuje forma za registrovanje
//		Da li se u url-u stranice javlja tekste “join/signup-popup”
	@Test
	public static void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.udemy.com/");

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//U delu za pretragu ukucava tekst “2021 Complete Python Bootcamp From Zero to Hero in Python” i unosi enter		
		driver.findElement(By.xpath("//input[@name = 'q']"))
				.sendKeys("2021 Complete Python Bootcamp From Zero to Hero in Python");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

//Zatim klikce na prvi rezultat pretrage nakon cega se otvara stranica pretrage		
		driver.findElement(By.xpath("//div[@class='course-list--container--3zXPS']/div")).click();
		Thread.sleep(4000);

//Proveravamo da li postoji dugme Buy Now i da li je enablovano 	
		boolean btnBuy = elementExists(driver, By.xpath("//button[@data-purpose='buy-this-course-button']"));
		Assert.assertTrue(btnBuy, "Button does not exist");

		Assert.assertEquals(true,
				driver.findElement(By.xpath("//button[@data-purpose='buy-this-course-button']")).isEnabled(),
				"Button is disabled");

//Klikcemo na dugme Buy Now i		
		driver.findElement(By.xpath("//button[@data-purpose='buy-this-course-button']")).click();

//Da li se u naslovu stranice javlja tekst Sign Up and Start Learning!
		Assert.assertEquals(driver.findElement(By.id("auth-to-udemy-title")).getText(), "Sign Up and Start Learning!",
				"Text 'Sign Up and Start Learning!' is not displayed on the page");
		Thread.sleep(4000);

//Da li se na stranici prikazuje forma za registrovanje
		boolean signUp = elementExists(driver, By.id("signup-form"));
		Assert.assertTrue(signUp, "The registration form is not displayed");

//Da li se u url-u stranice javlja tekste “join/signup-popup”		
		String url = driver.getCurrentUrl();
		String expected = "join/signup-popup";
		Assert.assertTrue(url.contains(expected), "Url does not contain a part -" + expected);

	}

	private static boolean elementExists(WebDriver driver, By xpath) {
		boolean exists = true;
		try {
			driver.findElement(xpath);
		} catch (Exception e) {
			exists = false;
		}
		return exists;
	}

}
