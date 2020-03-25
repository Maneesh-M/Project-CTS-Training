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
  "line": 41,
  "name": "",
  "description": "adding to wishlist",
  "id": "opencart-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@TC05_Storetowishlist"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "the user launched the chrome webbrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "the user opens the OpenCart page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "the user select desktop buttonclick",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "the item to wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "WishlistSD.the_user_launched_the_chrome_webbrowser()"
});
formatter.result({
  "duration": 8124301000,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSD.the_user_opens_the_OpenCart_page()"
});
formatter.result({
  "duration": 7190305900,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSD.the_user_select_desktop_buttonclick()"
});
formatter.result({
  "duration": 3303375700,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSD.the_item_to_wishlist()"
});
formatter.result({
  "duration": 12200420400,
  "status": "passed"
});
});