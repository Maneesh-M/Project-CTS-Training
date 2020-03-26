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
  "name": "select an item in desktop",
  "description": "",
  "id": "opencart-application;select-an-item-in-desktop",
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
  "line": 6,
  "name": "the user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user opens the Opencart homepage and login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user select desktop",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user select on the item",
  "keyword": "And "
});
formatter.match({
  "location": "SelectingItemSD.the_user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 7915184300,
  "status": "passed"
});
formatter.match({
  "location": "SelectingItemSD.the_user_opens_the_Opencart_homepage_and_login()"
});
formatter.result({
  "duration": 2782584700,
  "status": "passed"
});
formatter.match({
  "location": "SelectingItemSD.the_user_select_desktop()"
});
formatter.result({
  "duration": 3337747800,
  "status": "passed"
});
formatter.match({
  "location": "SelectingItemSD.the_user_select_on_the_item()"
});
formatter.result({
  "duration": 10175471800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "select the number of items to be shown",
  "description": "",
  "id": "opencart-application;select-the-number-of-items-to-be-shown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02_Shownumber"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "the user launched the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user opens the Opencart application",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user select desktop icon",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user selects the number",
  "keyword": "And "
});
formatter.match({
  "location": "ShowCountSD.the_user_launched_the_chromebrowser()"
});
formatter.result({
  "duration": 5728720200,
  "status": "passed"
});
formatter.match({
  "location": "ShowCountSD.the_user_opens_the_Opencart_application()"
});
formatter.result({
  "duration": 2735106600,
  "status": "passed"
});
formatter.match({
  "location": "ShowCountSD.the_user_select_desktop_icon()"
});
formatter.result({
  "duration": 3463755700,
  "status": "passed"
});
formatter.match({
  "location": "ShowCountSD.the_user_selects_the_number()"
});
formatter.result({
  "duration": 9040329800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "sorting the number of elements",
  "description": "",
  "id": "opencart-application;sorting-the-number-of-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC03_Sorting"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "the user launched the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user opens the Opencart page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user select desktop iccon",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "the user selects the type of sorting",
  "keyword": "And "
});
formatter.match({
  "location": "SortingSD.the_user_launched_the_chrome()"
});
formatter.result({
  "duration": 5831375000,
  "status": "passed"
});
formatter.match({
  "location": "SortingSD.the_user_opens_the_Opencart_page()"
});
formatter.result({
  "duration": 4120799600,
  "status": "passed"
});
formatter.match({
  "location": "SortingSD.the_user_select_desktop_iccon()"
});
formatter.result({
  "duration": 2598865600,
  "status": "passed"
});
formatter.match({
  "location": "SortingSD.the_user_selects_the_type_of_sorting()"
});
formatter.result({
  "duration": 8009541600,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "storing the details to excell sheet",
  "description": "",
  "id": "opencart-application;storing-the-details-to-excell-sheet",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC04_Storetoexcelsheet"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "the user launched the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the user opens the Opencart webpage",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "the user select desktop button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "the user adds the details of items to excelsheet",
  "keyword": "And "
});
formatter.match({
  "location": "StoretoExcelSD.the_user_launched_the_browser()"
});
formatter.result({
  "duration": 5769091300,
  "status": "passed"
});
formatter.match({
  "location": "StoretoExcelSD.the_user_opens_the_Opencart_webpage()"
});
formatter.result({
  "duration": 2705422200,
  "status": "passed"
});
formatter.match({
  "location": "StoretoExcelSD.the_user_select_desktop_button()"
});
formatter.result({
  "duration": 4059477800,
  "status": "passed"
});
formatter.match({
  "location": "StoretoExcelSD.the_user_adds_the_details_of_items_to_excelsheet()"
});
formatter.result({
  "duration": 8560026200,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "adding to wishlist",
  "description": "",
  "id": "opencart-application;adding-to-wishlist",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC05_Storetowishlist"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "the user launched the chrome webbrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "the user opens the OpenCart page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "the user select desktop buttonclick",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "the item to wishlist",
  "keyword": "And "
});
formatter.match({
  "location": "WishlistSD.the_user_launched_the_chrome_webbrowser()"
});
formatter.result({
  "duration": 5870505200,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSD.the_user_opens_the_OpenCart_page()"
});
formatter.result({
  "duration": 2902666700,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSD.the_user_select_desktop_buttonclick()"
});
formatter.result({
  "duration": 19642515500,
  "status": "passed"
});
formatter.match({
  "location": "WishlistSD.the_item_to_wishlist()"
});
formatter.result({
  "duration": 15109503000,
  "status": "passed"
});
});