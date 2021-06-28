package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//SummaryPage
//ima gettere za sve elemenete sa summary stranice koji nose informacije appointment-a

public class SummaryPage extends BasicPage {

	public SummaryPage(WebDriver driver) {
		super(driver);
	}

	public String getFacility() {
		return driver.findElement(By.id("facility")).getText();
	}

	public String getApplyForHospitalReadmission() {
		return driver.findElement(By.id("hospital_readmission")).getText();
	}

	public String getHealthcareProgram() {
		return driver.findElement(By.id("program")).getText();
	}

	public String getVisitDate() {
		return driver.findElement(By.id("visit_date")).getText();
	}

	public String getComment() {
		return driver.findElement(By.id("comment")).getText();
	}

}
