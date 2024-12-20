
Feature: Client interaction
  I want to use this template for my feature file

  
  Scenario: communicate with enrolled clients via messaging
    Given i have chosen a the client to message 
    When i send aa message to the client
    Then  the message should appear inn their inbox with my name 
    
    

      Scenario: provide feedback or progress reports
         Given i have chosen a the client to provide feedbaack 
         When i send the feedback to the client
         Then  the feedback should appear inn their inbox with my name 
     

