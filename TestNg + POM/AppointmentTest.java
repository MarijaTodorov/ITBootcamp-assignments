package Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppointmentTest extends BasicTest {

	@Test
	public void test1() throws InterruptedException {
		SoftAssert sa = new SoftAssert();

		String facility = "Hongkong CURA Healthcare Center";
		boolean applyForHospitalReadmission = true;
		String programValue = "Medicaid";
		String visitDate = "01/01/2020";
		String comment = "Ovo je komentar";

//Ucitajte stranicu https://katalon-demo-cura.herokuapp.com/
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		Thread.sleep(2000);

//Ulogovate se na stranicu preko demo naloga 	
//John Doe/ThisIsNotAPassword
		loginPage.login("John Doe", "ThisIsNotAPassword");

//Za proveru da li je korisnik ulogovan iskoristite metodu isFormPresented iz AppointmentPage klase.
		sa.assertTrue(appointmentPage.isFormPresented(), "User is not logged in");
		Thread.sleep(2000);

//Popunite appointment formu
		appointmentPage.makeAppointment(facility, applyForHospitalReadmission, programValue, visitDate, comment);

//I proverite da li se unosi sa appointment forme uklapaju sa podacima sa summary stranice
		sa.assertEquals(summaryPage.getFacility(), facility);

		if (applyForHospitalReadmission) {
			sa.assertEquals(summaryPage.getApplyForHospitalReadmission(), "Yes");
		} else {
			sa.assertEquals(summaryPage.getApplyForHospitalReadmission(), "No");
		}

		sa.assertEquals(summaryPage.getHealthcareProgram(), programValue);
		sa.assertEquals(summaryPage.getVisitDate(), visitDate);
		sa.assertEquals(summaryPage.getComment(), comment);

		sa.assertAll();
	}
}