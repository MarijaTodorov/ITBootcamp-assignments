package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//	LoginPage 
//	getteri za inpute
	
	public class LoginPage extends BasicPage {
		
		public LoginPage(WebDriver driver) {	
			super(driver);
		}
		
		public WebElement getMakeAppointment() {						 
			return driver.findElement(By.id("btn-make-appointment"));
		}
		public void clickButton() {										
			this.getMakeAppointment().click();
		}

		public WebElement getUsername() {
			return driver.findElement(By.name("username"));
		}
		public WebElement getPassword() {
			return driver.findElement(By.name("password"));		
	}
		public WebElement getLogin() {
			return driver.findElement(By.id("btn-login"));
		}

		public void clickLoginButton() {
			this.getLogin().click();
		}

//metodu login koja submituje login formu - kao parametre prima username i password
		public void login(String username, String password) {
			this.clickButton();
			this.getUsername().clear();
			this.getUsername().sendKeys(username);
			this.getPassword().clear();
			this.getPassword().sendKeys(password);
			this.clickLoginButton();
		}
}
