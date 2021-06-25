package Jun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji ucitava stranicu https://www.kupujemprodajem.com/search.php?action=list&submit%5Bsearch%5D=Tra%C5%BEi&dummy=name
//			i za pretragu setuje cenu u rasponu od 100 do 200 eura. Radio dugme funkcionise isto kao i checkbox

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kupujemprodajem.com/search.php?action=list&submit%5Bsearch%5D=Tra%C5%BEi&dummy=name");
		driver.findElement(By.className("kpBoxCloseButton")).click();
		driver.findElement(By.id("priceSecondSelection")).click();
		driver.findElement(By.id("search_by_price_number_min")).sendKeys("100");
		driver.findElement(By.id("search_by_price_number_max")).sendKeys("200");
		driver.findElement(By.xpath("//input[@value='eur']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Primeni']")).click();

	}

}
