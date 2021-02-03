Feature: Booking flight ticket with invalid card details

  Scenario: FlightBooking
    Given User is on Ryanair home page
    When  User clicks Login link
    And   User enters email "nanduk8686@gmail.com"
    And   User enters password "Nandu@123"
    And   User clicks on login button
    Then  "nanduk8686@gmail.com" should be displayed on the Home page
    When  User selects One way radio button
    And   User selects departure
    And   User selects destination
    And   User Chooses Date
    And   User Selects Passengers
    And   Click on search button
    Then  Flight details should be displayed
    When  User Select flight from flights List
    And   Click Continue with value fare button
    And   User enters passenger details
    And   User clicks Continue button on flights page
    Then  Family seating alert should be displayed
    When  User clicks on seat alert
    And   User select seats for passengers
    And   User clicks continue button on seat selection page
    Then  FastTrack popup should be displayed
    When  User clicks No Thanks button on FastTrack popup
    And   User clicks Small Bag Only radio button
    And   User click continue button on Baggage checkin page
    And   User clicks continue button on Anything else for your trip? page
    And   User click on view basket link
    Then  Checkout should be displayed
    When  User clicks Checkout button
    And   User enters phone number
    And   User Selects Insurance Plus
    And   User selects charity Donation checkbox
    And   User enters Card details with address details
    And   User selects currency type
    And   User selects termsandconditions checkbox
    And   User clicks on Pay now button
    Then  Payment declined message should be displayed
