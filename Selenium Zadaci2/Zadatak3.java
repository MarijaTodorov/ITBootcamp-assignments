package Domaci8jun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zadatak1 {
//	Ucitava stranicu https://demo.opensource-socialnetwork.org/login
//	Prijavljuje se na sajt koristeci podatke administrator/administrator

	@Test
	public static void openSource() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensource-socialnetwork.org/login");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='friend-list-item-37']/div/div/img")).click();

		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, "t");
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);
		driver.get("https://demo.opensource-socialnetwork.org/u/Anika25");

//Proverava da li na stranici postoji Add Friend dugme
		boolean addExists1 = elementExists(driver, By.linkText("Add friend"));
		Assert.assertTrue(addExists1, "Add button does not exist");

//Salje zahtev za prijateljstvo
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//div[@class='top-container']/div[9]/a"));
		add.click();

//Proverava da li je prikazana poruka koja sadrzi tekst “Your friend request has been sent!”		
		String friendAdded = driver.findElement(By.xpath("//div[@class='ossn-system-messages-inner']/div")).getText();
		String txt = "Your friend request has been sent!";
		Assert.assertTrue(friendAdded.contains(txt), "The message related to the sent friend request is not displayed");

//Proverava da li na stranici postoji dugme Cancel Request
		boolean cancelExists1 = elementExists(driver, By.linkText("Cancel Request"));
		Assert.assertTrue(cancelExists1, "Cancel Request button does not exist");

//Zatim osvezava stranicu i
		driver.navigate().refresh();

//Opet proverava da li na stranici postoji dugme Cancel Request
		boolean cancelExists2 = elementExists(driver, By.linkText("Cancel Request"));
		Assert.assertTrue(cancelExists2, "Cancel Request button does not exist");
		Thread.sleep(2000);

//Ponistava zahtev za prijateljstvo		
		driver.findElement(By.linkText("Cancel Request")).click();

//Proverava da li je prikazana poruka koja sadrzi tekst “Friend request deleted!”
		String canceledRequest = driver.findElement(By.xpath("//div[@class='ossn-system-messages-inner']/div"))
				.getText();
		String checkTxt = "Friend request deleted!";
		Assert.assertTrue(canceledRequest.contains(checkTxt),
				"the message related to the canceled request is not displayed");

//I na kraju proverava da li na stranici je prikazano Add Friend dugme
		boolean addExists2 = elementExists(driver, By.linkText("Add friend"));
		Assert.assertTrue(addExists2, "Add button does not exist");
	}

	private static boolean elementExists(WebDriver driver, By by) {
		boolean exist = true;
		try {
			driver.findElement(by);
		} catch (Exception e) {
			exist = false;
		}
		return exist;
	}
}
