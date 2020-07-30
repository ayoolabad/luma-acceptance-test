$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn.feature");
formatter.feature({
  "line": 2,
  "name": "Log In",
  "description": "",
  "id": "log-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LogIn"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Log into account.",
  "description": "",
  "id": "log-in;log-into-account.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Sign In page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the \"\u003cEmail\u003e\" address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user inputs the \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Sign In page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user MyDashboard page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "log-in;log-into-account.;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 13,
      "id": "log-in;log-into-account.;;1"
    },
    {
      "cells": [
        "baddie2abdul@hotmail.com",
        "Badbadabdul04"
      ],
      "line": 14,
      "id": "log-in;log-into-account.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Log into account.",
  "description": "",
  "id": "log-in;log-into-account.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LogIn"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Sign In page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the \"baddie2abdul@hotmail.com\" address",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user inputs the \"Badbadabdul04\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Sign In page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user MyDashboard page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.userIsOnSignInPage()"
});
formatter.result({
  "duration": 10045259073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "baddie2abdul@hotmail.com",
      "offset": 17
    }
  ],
  "location": "LogInSteps.userEntersTheAddress(String)"
});
formatter.result({
  "duration": 878519901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Badbadabdul04",
      "offset": 17
    }
  ],
  "location": "LogInSteps.userInputsThe(String)"
});
formatter.result({
  "duration": 216166534,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userClicksOnSignInPage()"
});
formatter.result({
  "duration": 1482617674,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userMyDashboardPageIsDisplayed()"
});
formatter.result({
  "duration": 54581,
  "status": "passed"
});
});