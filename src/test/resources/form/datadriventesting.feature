#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Data Driven Testing Using Cucumber

  @tag1
  Scenario Outline: Data Driven
   Given User opens the browzer and goes to form
    When User enters the "<Firstname>", "<Lastname>", "<Email>"
    And User enters the "<contactnumber>" and "<message>"
    And User then clicks on submit
    Then Confirmation box is displayed.

    Examples: 
      | Firstname  | Lastname | Email 	    | contactnumber| message|
      | name1      |    A 		| A@gmail.com |  123456|         Hello|    
      | name2      |		2     |B@gmail.com  |  234   |	       Bellow|
      | name3      |		C     |C@gmail.com  |	 345   |      	Cellow|
      | name4      |		D     | D@gmail.com |	 456   |       	Wellow|
      | name5      |    E	 		| E@gmail.com | aabvh  |	      Yellow|
