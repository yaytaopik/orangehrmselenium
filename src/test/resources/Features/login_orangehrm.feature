@login
Feature: Login orange hrm
	Scenario: Admin login into orange hrm with valid credentials
		Given Admin login using username "Admin" and password "admin123"
		And Admin successfully login
		
		Scenario: Admin login into orange hrm with invalid username credentials
		Given Admin login using username "Admiral" and password "admin123"
		And Alert message username required should displayed
	