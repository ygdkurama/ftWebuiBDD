Feature: Search keyword on the review page

#  Scenario Outline: Search specific keyword
#    Given : I am at the review page
#    When : I type the "<kw1>" on search bar and click search button
#    Then : I should be at the specific search page
#
#    Examples:
#      | kw1 |
#      | 火锅  |
#      | 美食  |
#      | 川菜  |

  Scenario: Search specific keyword
    Given : I am at the review page
    When : I type the "火锅" on search bar and click search button
    Then : I should be at the specific search page

#  Scenario : Search specific keyword1
#    Given : I am at the review page
#    When : I type the "川菜" on search bar and click search button
#    Then : I should be at the specific search page
#
#  Scenario : Search specific keyword2
#    Given : I am at the review page
#    When : I type the "美食" on search bar and click search button
#    Then : I should be at the specific search page



