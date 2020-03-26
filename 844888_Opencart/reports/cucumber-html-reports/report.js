$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Featurefolder/project.feature");
formatter.feature({
  "line": 2,
  "name": "OpenCart Application",
  "description": "",
  "id": "opencart-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@project_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "select an item in desktop",
  "id": "opencart-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Selectingitem"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user opens the Opencart homepage and login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user select desktop",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user select on the item",
  "keyword": "And "
});
formatter.match({
  "location": "SelectingItemSD.the_user_launched_the_chrome_browser()"
});
});