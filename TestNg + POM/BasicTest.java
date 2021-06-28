package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.AppointmentPage;
import Pages.LoginPage;
import Pages.SummaryPage;

public abstract class BasicTest {

	protected WebDriver driver;
	protected LoginPage loginPage;
	protected AppointmentPage appointmentPage;
	protected SummaryPage summaryPage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		loginPage = new LoginPage(driver);
		appointmentPage = new AppointmentPage(driver);
		summaryPage = new SummaryPage(driver);
	}

	@AfterMethod
	public void cleanup() {
		this.driver.quit();
	}
}
