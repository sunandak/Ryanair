package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBookingPage {
	
	private WebDriver driver;
    JavascriptExecutor js;
	
	// By Locators
	 private By Opening_alert=By.xpath("//button[normalize-space()='Yes, I agree']");
	 private By Login_link=By.xpath("//span[text()='Log in']");
	 private By EmailId=By.xpath("//input[@placeholder='email@email.com']");
	 private By Password=By.xpath("//input[@placeholder='Password']");
	 private By Login_button=By.xpath("//button[contains(text(),'Log in')]");
	 private By Username=By.xpath("//span[@class='ry-header__user-name']");
	 private By OneWay_trip=By.xpath("//label[normalize-space()='One way']");
	 private By Departure_txt=By.xpath("//input[@id='input-button__departure']");
	 private By Departure_airport=By.xpath("//span[contains(text(),'Dublin')]");
	 private By Destination_txt=By.xpath("//input[@id='input-button__destination']");
	 private By Destination_airport=By.xpath("//span[contains(text(),'Berlin Brandenburg')]");
	 private By Month_next_toggle=By.xpath("/html[1]/body[1]/ry-tooltip[1]/div[2]/hp-app-controls-tooltips[1]/fsw-controls-tooltips-container[1]/fsw-controls-tooltips[1]/fsw-datepicker-container[1]/fsw-datepicker[1]/ry-datepicker-desktop[1]/month-toggle[1]/div[1]/div[3]/icon[1]/span[1]/*[local-name()='svg'][1]");
	 private By Month_of_Trip=By.xpath("//month-toggle[@class='ng-star-inserted']//div[9]");
	 private By Date_of_Trip=By.xpath("//div[@class='calendar-body__cell'][normalize-space()='6']");
	 private By Add_adult=By.xpath("//ry-counter[@data-ref='passengers-picker__adults']//div[@class='counter__button-wrapper--enabled']");
	 private By Add_Child=By.xpath("//ry-counter[@data-ref='passengers-picker__children']//div[@class='counter__button-wrapper--enabled']");
	 private By Done_btn=By.xpath("//button[normalize-space()='Done']");
	 private By Search=By.xpath("//button[@aria-label='Search']");
	 private By Flight_details=By.xpath("//flight-info[@class='card-info__col card-info__col--stretch']");
	 private By flight_price=By.xpath("//div[@class='price-wrapper']");
	 private By ContinueWithValueFare=By.xpath("//span[contains(.,'Continue with Value fare')]");
	 private By PassengerOne_DD=By.xpath("//pax-passenger-container[1]//pax-passenger[1]//div[1]//pax-passenger-details-container[1]//pax-passenger-details[1]//pax-passenger-details-form-container[1]//pax-details-form[1]//ry-dropdown[1]//div[2]//button[1]/span");
	 private By PassengerOne_Title=By.xpath("//div[@class='dropdown-item__label b2'][normalize-space()='Mr']");
	 private By PassengerOne_FN=By.xpath("//input[@id='formState.passengers.ADT-0.name']");
	 private By PassengerOne_LN=By.xpath("//input[@id='formState.passengers.ADT-0.surname']");
	 private By	PassengerTwo_DD=By.xpath("//button[@class='dropdown__toggle b2']");
	 private By PassengerTwo_Title=By.xpath("//div[contains(text(),'Mrs')]");
	 private By PassengerTwo_FN=By.xpath("//input[@id='formState.passengers.ADT-1.name']");
	 private By PassengerTwo_LN=By.xpath("//input[@id='formState.passengers.ADT-1.surname']");
	 private By PassengerThree_FN=By.xpath("//input[@id='formState.passengers.CHD-0.name']");
	 private By PassengerThree_LN=By.xpath("//input[@id='formState.passengers.CHD-0.surname']");
	 private By Continue_btn=By.xpath("//button[normalize-space()='Continue']");
	 private By FamilySeating_alert=By.xpath("//button[normalize-space()='Okay, got it.']");
	 private By Seat_one=By.xpath("//div[@class='seatmap__seatrow seatmap__seatrow--25 ng-star-inserted']//button[1]");
	 private By Seat_two=By.xpath("//div[@class='seatmap__seatrow seatmap__seatrow--25 ng-star-inserted']//button[2]");
     private By Seat_three=By.xpath("//div[@class='seatmap__seatrow seatmap__seatrow--25 ng-star-inserted']//button[3]");
     private By FastTrack=By.xpath("//button[normalize-space()='Add Fast Track']");
     private By NoThanks_button=By.xpath("//button[normalize-space()='No, thanks']");
     private By SmallBagOnly=By.xpath("//label[@for='ry-radio-button--0']");
     private By ViewBasket_link=By.xpath("//a[normalize-space()='View basket']");
	 private By CheckOut_btn=By.xpath("//button[normalize-space()='Check out']");
	 private By Insurance_Plus_radio_button=By.xpath("//label[@for='insurance-opt-in']//div[@class='_background']");
	 private By Charity_chk=By.xpath("//label[@for='solidaryDonation']//div[@class='_background']");
	 private By PhoneNO_txt=By.xpath("//ry-input-d[@class='contact-details__input-tel ng-untouched ng-pristine ng-invalid']//input[@name='undefined']");
	 private By CardNO_txt=By.xpath("//ry-input-d[@class='modal__input ng-untouched ng-pristine ng-invalid ng-star-inserted']//input[@name='undefined']");
	 private By Exp_Month_DD= By.xpath("//span[normalize-space()='Month']");
	 private By Exp_Month=By.xpath("//div[contains(text(),'October')]");
	 private By Exp_Year_DD=By.xpath("//span[normalize-space()='Year']");
	 private By Exp_Year=By.xpath("//div[contains(text(),'2021')]");
	 private By CVV=By.xpath("//input[@placeholder='CVV']");
	 private By CardHolderName=By.xpath("//ry-input-d[@class='ng-untouched ng-pristine ng-invalid']//input[@name='undefined']");
	 private By AddressLine=By.xpath("//billing-address//ry-input-d[1]//div[1]//input[1]");
	 private By City=By.xpath("//ry-input-d[@class='address-form__input ng-untouched ng-pristine ng-invalid']//input[@name='undefined']");
	 private By Country=By.xpath("//input[@class='b2 _autocomplete_input _autocomplete_input--dropdown']");
	 private By countryList=By.xpath("//div[@class='_autocomplete_menu__item']");
	 private By PostCode=By.xpath("//ry-input-d[@class='address-form__shrinked-field ng-untouched ng-pristine ng-invalid ng-star-inserted']//input[@name='undefined']");
	 private By CurrencyType_DD=By.xpath("//button[@class='dropdown__toggle b2']");
	 private By CurrencyType=By.xpath("//div[contains(text(),'EUR')]");
	 private By TermsandCondns=By.xpath("//label[@for='termsAndConditions']//div[@class='_background']");
	 private By PayNow_btn=By.xpath("//button[normalize-space()='Pay now']");
	 private By Error_msg=By.xpath("//div[@class='b2 ng-star-inserted']");
	 
	 
	 //constructor of the page class
	 public FlightBookingPage(WebDriver driver) {
		 this.driver=driver;
		 this.js= (JavascriptExecutor) this.driver;
	 }
	 
	 // Actions
	 public void getAlert() {
		String alert= driver.findElement(Opening_alert).getText();
		if(alert.contains("Yes, I agree")) {
			driver.findElement(Opening_alert).click();
		}
		
	 }
	 public void clickLogin_link() {
		 driver.findElement(Login_link).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 
	 public void enterEmail(String username) {
		 driver.findElement(EmailId).sendKeys(username);		
	 }
	 
	 public void enterPassword(String pwd) {
		 driver.findElement(Password).sendKeys(pwd);			
	 }
	 
	 public void clickLogin() {
		 driver.findElement(Login_button).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	 }
	 
	 public String getUsername() {
		return driver.findElement(Username).getText(); 
	 }
	 public void oneWay() {
		 driver.findElement(OneWay_trip).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 public String selectDeparture() {
		 driver.findElement(Departure_txt).clear();
		 driver.findElement(Departure_txt).click();
		 String departure= driver.findElement(Departure_airport).getText();
		 driver.findElement(Departure_airport).click();
		 return departure;
	 }	 
	 public String selectDestination() {
		 driver.findElement(Destination_txt).sendKeys("Germany");
		 String destination= driver.findElement(Destination_airport).getText();
		 driver.findElement(Destination_airport).click();
		 return destination;
	 }
	 public void selectDate() {
		 driver.findElement(Month_next_toggle).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(Month_next_toggle).click();
		 driver.findElement(Month_of_Trip).click();
		 driver.findElement(Date_of_Trip).click();
	 }
	 public void selectPassengers() {
		 driver.findElement(Add_adult).click();
		 driver.findElement(Add_Child).click();
		 driver.findElement(Done_btn).click();
	 }
	 public void clickSearch() throws Exception {
		 driver.findElement(Search).click();
		 Thread.sleep(2000);
	 }
	 public boolean getFlight() {
		 return driver.findElement(Flight_details).isDisplayed();			
	 }	 
	 public void selectFlight()  throws Exception{
		 driver.findElement(flight_price).click();
		 Thread.sleep(2000);
	 }
	 public void continuewithValuefare() {
	 js.executeScript("arguments[0].scrollIntoView();",  driver.findElement(ContinueWithValueFare));
		 driver.findElement(ContinueWithValueFare).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 public void enterPassengerInfo() {
		 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(PassengerOne_DD));
		 driver.findElement(PassengerOne_DD).click();
		 driver.findElement(PassengerOne_Title).click();
		 driver.findElement(PassengerOne_FN).sendKeys("Sri");;
		 driver.findElement(PassengerOne_LN).sendKeys("Ve");
		 driver.findElement(PassengerTwo_DD).click();
		 driver.findElement(PassengerTwo_Title).click();
		 driver.findElement(PassengerTwo_FN).sendKeys("Nandu");
		 driver.findElement(PassengerTwo_LN).sendKeys("Ko");
		 driver.findElement(PassengerThree_FN).sendKeys("Venny");
		 driver.findElement(PassengerThree_LN).sendKeys("Ve");
	 }
     public void clickContinue() {
    	 driver.findElement(Continue_btn).click();
     }
     public boolean seatingAlert() {
		return driver.findElement(FamilySeating_alert).isDisplayed(); 
     }
     public void seatingAler_okt() {
    	 driver.findElement(FamilySeating_alert).click();
     }
     public void selectSeat() throws Exception {
    	 Thread.sleep(2000);
    	js.executeScript("window.scrollBy(0,350)",driver.findElement(Seat_one));
    	 driver.findElement(Seat_one).click();
    	 driver.findElement(Seat_two).click();
    	 driver.findElement(Seat_three).click();
     }
     public boolean fastTrack_popup(){
		return driver.findElement(FastTrack).isDisplayed();
    	 
     }
     public void noThanks_btn() {
    	 driver.findElement(NoThanks_button).click();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }
     public void selectBag() {
    	 driver.findElement(SmallBagOnly).click();
     }
     public void continuebtn_trip() throws Exception {
    	 Thread.sleep(2000);
    	 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(Continue_btn));
    	 driver.findElement(Continue_btn).click();
     }
     public void viewBasket() {
    	 driver.findElement(ViewBasket_link).click();
     }
     public boolean checkout_btn() {
    	 return driver.findElement(CheckOut_btn).isDisplayed();
     }
     public void checkout() {
    	 driver.findElement(CheckOut_btn).click();
     }
     public void phontNO() {
    	 driver.findElement(PhoneNO_txt).sendKeys("4656465678");
     }
     public void insureplus() {
    	 driver.findElement(Insurance_Plus_radio_button).click();
     }
     public void charityDonation_chk() {
    	 driver.findElement(Charity_chk).click();
     }
     public void card_address() throws Exception {
    	 driver.findElement(CardNO_txt).sendKeys("5555 5555 5555 5565");
    	 Thread.sleep(2000);
    driver.findElement(Exp_Month_DD).click();
    js.executeScript("arguments[0].scrollIntoView();", driver.findElement(Exp_Month));
    		driver.findElement(Exp_Month).click();
    		js.executeScript("window.scrollBy(0,-350)", driver.findElement(Exp_Year_DD));
    		driver.findElement(Exp_Year_DD).click();
    		driver.findElement(Exp_Year).click();
    		driver.findElement(CVV).sendKeys("265");
    		driver.findElement(CardHolderName).sendKeys("Nandu V");
    		driver.findElement(AddressLine).sendKeys("Cill cais");
    		driver.findElement(City).sendKeys("Dublin");
    		driver.findElement(Country).sendKeys("Ireland");
    		 List<WebElement> CountryList = driver.findElements(countryList);

    		    for(WebElement country : CountryList){
    		        System.out.println(country.getText());
    		        if(country.getText().equals("Ireland")) {
    		        	country.click();
    		            break;
    		        }}
    		    driver.findElement(PostCode).sendKeys("f96ghg6");
     }
     public void currencyType() {
    	 driver.findElement(CurrencyType_DD).click();
    	 driver.findElement(CurrencyType).click();
     }
     public void termsandcondns() {
    	 driver.findElement(TermsandCondns).click();
     }
     public void payNow() throws Exception {
    	 driver.findElement(PayNow_btn).click();
    	 Thread.sleep(1000);
     }
     public String paymentDeclined() {
    	 String error_msg=driver.findElement(Error_msg).getText();
    	 System.out.println(error_msg);
       return error_msg;
     }
} 
