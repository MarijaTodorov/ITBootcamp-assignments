package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Napomena: Datum se takodje postavlja preko metode sendKeys samo je potrebno datum uneti u formatu 
// "dd/mm/yyyy" => npr: "21/09/2020"

public class AppointmentPage extends BasicPage {

	public AppointmentPage(WebDriver driver) {
		super(driver);
	}

//getter za facility select	

	public Select getFacilitySelect() {
		WebElement fs = this.driver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/form/div[1]/div/select"));
		Select facility = new Select(fs);
		return facility;
	}

//getter za apply for hospital readmission	
	public WebElement getHospitalReadmission() {
		return driver.findElement(By.xpath("//input[@value='Yes']"));
	}

//getter za radio dugme (trazeno po value atributu)
	public WebElement getRadioButton(String radioInputName) {
		return driver.findElement(By.xpath("//*[@name = 'programs'][@value ='" + radioInputName + "']"));
	}

//getter za visit date input
	public WebElement getDateInput() {
		return driver.findElement(By.xpath("//input[@name='visit_date']"));
	}

//getter za comment input	
	public WebElement getCommentInput() {
		return driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
	}

//getter za book appointment button
	public WebElement getAppointmentButton() {
		return driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
	}

//metodu isFormPresented() koja vraca informaciju da li je ucitan element id="appointment", 
	public boolean isFormPresented() {
		List<WebElement> form = driver.findElements(By.xpath("//*[@id=\"appointment\"]"));
		return form.size() > 0;
	}

// metodu makeAppointment
	public void makeAppointment(String facilityValue, boolean applyForHospitalReadmission, String programValue,
			String visitDate, String comment) {

		this.getFacilitySelect().selectByValue(facilityValue);

		if (applyForHospitalReadmission) {
			this.getHospitalReadmission().click();
		}

		this.getRadioButton(programValue).click();

		this.getDateInput().sendKeys(visitDate);

		this.getCommentInput().sendKeys(comment);

		this.getAppointmentButton().click();
	}

}
