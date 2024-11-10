Feature: SignIn functionality

@SignIn
Scenario Outline: SignIn with valid credentials
  Given User Navigate to SignIn page
   And  User enters validemail address <username> into email field
   And  User enters valid  password <password> into password field
   And  User clicks on signIn buttton
   Then User Successfully should get successfully in Sign In
   
Examples:
|username|password|
|mahaboobshareef787@gmail.com|9603205826mabu@|

Scenario:  SignIn with  InValid Credentials
	Given User Navigate to SignIn page
	And   User enters invalidEmail address into email field
	And   User enters invalid Password "123456mabu@" into password field
	And   User clicks on signIn buttton
	Then  User displayed  warning Message