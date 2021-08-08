$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EligibiliyCheck.feature");
formatter.feature({
  "line": 2,
  "name": "As a person from Wales",
  "description": "",
  "id": "as-a-person-from-wales",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@nhs"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I entered DOB for \u003cage\u003e years",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria;",
  "rows": [
    {
      "cells": [
        "age"
      ],
      "line": 9,
      "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria;;1"
    },
    {
      "cells": [
        "16"
      ],
      "line": 10,
      "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria;;2"
    },
    {
      "cells": [
        "35"
      ],
      "line": 11,
      "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3122642800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@nhs"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I entered DOB for 16 years",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EligibilityChecker.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 681060300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 18
    }
  ],
  "location": "EligibilityChecker.iEnteredDOBForYears(int)"
});
formatter.result({
  "duration": 1097979200,
  "status": "passed"
});
formatter.match({
  "location": "EligibilityChecker.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 31278300,
  "status": "passed"
});
formatter.after({
  "duration": 844558700,
  "status": "passed"
});
formatter.before({
  "duration": 2585756800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Wales Test Ticket - Acceptance Criteria",
  "description": "",
  "id": "as-a-person-from-wales;wales-test-ticket---acceptance-criteria;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@nhs"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I entered DOB for 35 years",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EligibilityChecker.i_am_a_person_from_Wales()"
});
formatter.result({
  "duration": 270838000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "35",
      "offset": 18
    }
  ],
  "location": "EligibilityChecker.iEnteredDOBForYears(int)"
});
formatter.result({
  "duration": 2157231800,
  "status": "passed"
});
formatter.match({
  "location": "EligibilityChecker.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 37432300,
  "status": "passed"
});
formatter.after({
  "duration": 758148000,
  "status": "passed"
});
});