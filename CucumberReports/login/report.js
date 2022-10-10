$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression_run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is enter the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is enter the Username in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the Password in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginData.user_is_enter_the_URL()"
});
formatter.result({
  "duration": 211698000,
  "status": "passed"
});
formatter.match({
  "location": "LoginData.user_is_enter_the_Username_in_Username_Field()"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.match({
  "location": "LoginData.user_is_enter_the_Password_in_Password_Field()"
});
formatter.result({
  "duration": 26000,
  "status": "passed"
});
formatter.match({
  "location": "LoginData.user_is_click_on_login_button()"
});
formatter.result({
  "duration": 36300,
  "status": "passed"
});
});