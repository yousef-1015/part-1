
Feature: progress tracking


  Scenario: monitor client progress
    Given the system keeps track of Clients and I have chosen a client to monitor
    When i get the progress of the client 
    Then I should see their progress

