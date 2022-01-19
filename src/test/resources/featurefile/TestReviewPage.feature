Feature: Search keyword on the review page from keword
  Scenario: Search specific keyword for search
    Given : I am at the review page
    When : I type the "火锅" on search bar and click search button
    When : I type the "川菜" on search bar and click search button
    When : I type the "美食" on search bar and click search button
    Then : I should be at the specific search page