$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/featurefile/AdactinHotel.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@nandhu"
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
  "name": "User is enter the \"\u003cUsername\u003e\" in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the \"\u003cPassword\u003e\" in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on Login Button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "adactin-hotel-booking;login-functionality;;1"
    },
    {
      "cells": [
        "admin",
        "admin123"
      ],
      "line": 12,
      "id": "adactin-hotel-booking;login-functionality;;2"
    },
    {
      "cells": [
        "root",
        "root123"
      ],
      "line": 13,
      "id": "adactin-hotel-booking;login-functionality;;3"
    },
    {
      "cells": [
        "arvind19",
        "12345678"
      ],
      "line": 14,
      "id": "adactin-hotel-booking;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 149328500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@nandhu"
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
  "name": "User is enter the \"admin\" in Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is enter the \"admin123\" in Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Adactin.user_is_enter_the_URL()"
});
