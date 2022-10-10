Feature: Adactin Hotel Booking

@nandhu
Scenario Outline: Login Functionality
Given User is enter the URL
When User is enter the "<Username>" in Username Field
And User is enter the "<Password>" in Password Field
Then User is click on Login Button

Examples:
				|Username|Password|
				|admin|admin123|
				|root|root123|
				|arvind19|12345678|



@nandhu
Scenario: Search Hotel in Adactin Hotel Booking
When User is select the Location
And User is selcet the Hotel Name

@nandhu
Scenario: Search Hotel two in Adactin Hotel Booking
When User is select the City
And User is selcet the Hotel Names



