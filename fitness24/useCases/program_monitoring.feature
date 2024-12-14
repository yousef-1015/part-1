
 Feature:  program monitoring



 Scenario: View statistics on the most popular programs by enrollment.
         Given there exists a record of clients enrollments in programs
         When I choose to view the progrmas by enrollment
         Then I should see a list of programms sorted by the number of enrollments
 
 

Scenario: Generate reports on revenue, attendance, and client progress=
       Given the system keeps track of revenue, attendance on each programm
       When i choose to generate a report for a certain program
       Then a report should be generated



Scenario: Track active programs
    Given there are active programs in the system
    When I view the "Active Programs" page
    Then I should see a list of all programs currently in progress
    And their start and end dates should be displayed
    
    

  Scenario: Track completed programs
    Given there are completed programs in the system
    When I view the "Completed Programs" page
    Then I should see a list of all programs that have ended
    And their completion dates should be displayed
