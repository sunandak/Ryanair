package stepdefinitions;

import org.junit.Assert;

import com.pages.FlightBookingPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps {	
	
	private static String departure;
	private static String destination;
 private FlightBookingPage bookingPage=new FlightBookingPage(DriverFactory.getDriver());
	
	@Given("User is on Ryanair home page")
	public void user_is_on_ryanair_home_page() {
	  DriverFactory.getDriver().get("https://www.ryanair.com/ie/en/"); 
	  bookingPage.getAlert();
	}

	@When("User clicks Login link")
	public void user_clicks_login_link() {
		bookingPage.clickLogin_link();
	}

	@When("User enters email {string}")
	public void user_enters_email(String username) {
	    bookingPage.enterEmail(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
	   bookingPage.enterPassword(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	  bookingPage.clickLogin();
	}

	@Then("{string} should be displayed on the Home page")
	public void username_should_be_displayed_on_the_home_page(String email) {
		String loggedinUser=bookingPage.getUsername();
		System.out.println("Username is "+loggedinUser);
	    Assert.assertTrue(loggedinUser.contains(email));
	}

	@When("User selects One way radio button")
	public void user_selects_one_way_radio_button() {
		bookingPage.oneWay();
	}

	@When("User selects departure")
	public void user_selects_departure() {
	  departure= bookingPage.selectDeparture();
	  System.out.println("Departure is "+departure);
	}

	@When("User selects destination")
	public void user_selects_destination() {
   destination= bookingPage.selectDestination();
	System.out.println("Destination is "+destination);
	}

	@When("User Chooses Date")
	public void user_chooses_date() {
	   bookingPage.selectDate();
	}

	@When("User Selects Passengers")
	public void user_selects_passengers() {
	   bookingPage.selectPassengers();
	}

	@When("Click on search button")
	public void click_on_search_button() throws Exception {
	   bookingPage.clickSearch();
	}

	@Then("Flight details should be displayed")
	public void Flight_details_should_be_displayed() {
	   Assert.assertTrue(bookingPage.getFlight());	    
	}

	@When("User Select flight from flights List")
	public void user_select_flight_from_flights_list()  throws Exception {
	    bookingPage.selectFlight();
	}

	@When("Click Continue with value fare button")
	public void click_continue_with_value_fare_button() {
	   bookingPage.continuewithValuefare();
	}

	@When("User enters passenger details")
	public void user_enters_passenger_details() {
	    bookingPage.enterPassengerInfo();
	}

	@When("User clicks Continue button on flights page")
	public void user_clicks_continue_button_on_flights_page() {
	   bookingPage.clickContinue();
	}

	@Then("Family seating alert should be displayed")
	public void family_seating_alert_should_be_displayed() {
	    Assert.assertTrue(bookingPage.seatingAlert());
	}
   @When("User clicks on seat alert")
   public void user_clicks_on_seat_alert() {
	   bookingPage.seatingAler_okt();
    }
	@When("User select seats for passengers")
	public void user_select_seats_for_passengers() throws Exception {
	   bookingPage.selectSeat();
	}

	@When("User clicks continue button on seat selection page")
	public void user_clicks_continue_button_on_seat_selection_page() {
	    bookingPage.clickContinue();
	}
    @Then("FastTrack popup should be displayed")
    public void Fasttrack_popup_should_be_displayed() {
	    Assert.assertTrue(bookingPage.fastTrack_popup());
   }
	@When("User clicks No Thanks button on FastTrack popup")
	public void user_clicks_no_thanks_button_on_fast_track_popup() {
	    bookingPage.noThanks_btn();
	}

	@When("User clicks Small Bag Only radio button")
	public void user_clicks_small_bag_only_radio_button() {
	    bookingPage.selectBag();
	}

	@When("User click continue button on Baggage checkin page")
	public void user_click_continue_button_on_baggage_checkin_page() {
	   bookingPage.clickContinue();
	}

	@When("User clicks continue button on Anything else for your trip? page")
	public void user_clicks_continue_button_on_anything_else_for_your_trip_page() throws Exception {
	    bookingPage.continuebtn_trip();
	}


	@When("User click on view basket link")
	public void user_click_on_view_basket_link() {
	   bookingPage.viewBasket();
	}
	
	@Then("Checkout should be displayed")
	public void view_basket_link_should_be_displayed() {
	    Assert.assertTrue(bookingPage.checkout_btn());
	}

	@When("User clicks Checkout button")
	public void user_clicks_checkout_button() {
		bookingPage.checkout();
	}

	@When("User enters phone number")
	public void user_enters_phone_number() {
	    bookingPage.phontNO();
	}
    @When("User Selects Insurance Plus")
    public void User_Selects_Insurance_Plus() {
    	bookingPage.insureplus();
    }
	@When("User selects charity Donation checkbox")
	public void user_selects_charity_donation_checkbox() {
	   bookingPage.charityDonation_chk();
	}

	@When("User enters Card details with address details")
	public void user_enters_card_details_with_address_details() throws Exception {
	    bookingPage.card_address();
	}

	@When("User selects currency type")
	public void user_selects_currency_type() {
           bookingPage.currencyType();
	}
	
   @When("User selects termsandconditions checkbox")
   public void User_selects_termsandconditions_checkbox() {
	  bookingPage.termsandcondns(); 
   }
   
	@When("User clicks on Pay now button")
	public void user_clicks_on_pay_now_button() throws Exception {
	   bookingPage.payNow();
	}

	@Then("Payment declined message should be displayed")
	public void payment_declined_message_should_be_displayed() {
	   Assert.assertTrue(bookingPage.paymentDeclined().contains("Transaction could not be processed."));
	}
	
}
