@project_Feature
Feature: OpenCart Application

  @TC01_Selectingitem
  Scenario: 
    select an item in desktop

    Given the user launched the chrome browser
    When the user opens the Opencart homepage and login
    Then the user select desktop
    And the user select on the item

  @TC02_Shownumber
  Scenario: 
    select the number of items to be shown

    Given the user launched the chromebrowser
    When the user opens the Opencart application
    Then the user select desktop icon
    And the user selects the number

  @TC03_Sorting
  Scenario: 
    sorting the number of elements

    Given the user launched the chrome
    When the user opens the Opencart page
    Then the user select desktop iccon
    And the user selects the type of sorting

  @TC04_Storetoexcelsheet
  Scenario: 
    storing the details to excell sheet

    Given the user launched the browser
    When the user opens the Opencart webpage
    Then the user select desktop button
    And the user adds the details of items to excelsheet

  @TC05_Storetowishlist
  Scenario: 
    adding to wishlist

    Given the user launched the chrome webbrowser
    When the user opens the OpenCart page
    Then the user select desktop buttonclick
    And the item to wishlist
