package fitness24;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProgramMonitoringSteps {
	
	
	
	
	
	
	
	Client client1 = new Client("C001", "Alice Johnson", 28, "alice.johnson@example.com", "Weight Loss", "Vegetarian");
    Client client2 = new Client("C002", "Bob Smith", 35, "bob.smith@example.com", "Muscle Building", "Keto");
    Client client3 = new Client("C003", "Charlie Brown", 22, "charlie.brown@example.com", "Flexibility", "Vegan");
    Client client4 = new Client("C004", "Diana Prince", 30, "diana.prince@example.com", "Endurance", "Pescatarian");
    Client client5 = new Client("C005", "Ethan Hunt", 40, "ethan.hunt@example.com", "Strength Training", "No Restrictions");
    
    
    Programm program1 = new Programm(
            "Weight Loss Bootcamp", 
            "8 Weeks", 
            "Beginner", 
            "Lose 5kg in 2 months",
            5.5
        );

        Programm program2 = new Programm(
            "Muscle Building Masterclass", 
            "12 Weeks", 
            "Intermediate", 
            "Build 10kg of muscle",
            6.0
        );

        Programm program3 = new Programm(
            "Flexibility and Yoga Retreat", 
            "4 Weeks", 
            "Advanced", 
            "Achieve advanced yoga poses and flexibility",
            10.0
        );
        
        
        ArrayList<Programm> programs= new ArrayList<>();
        ArrayList<Programm> sorted = new ArrayList<>();

        Admin ad= new Admin();
        

        
        
     
        
        
        
        
        
	
    
	@Given("there exists a record of clients enrollments in programs")
	public void there_exists_a_record_of_clients_enrollments_in_programs() {
		
        program1.addClient( client1 );
        program1.addClient( client2 );
        program2.addClient( client1 );
        program2.addClient( client3 );
        program2.addClient( client4 );
        program3.addClient( client5 );
        program3.addClient( client2 );
        program3.addClient( client1 );
        program3.addClient( client3 );
        program3.addClient( client4 );
        programs.add(program1);
        programs.add(program2);
        programs.add(program3);
	}
	
	
	@When("I choose to view the progrmas by enrollment")
	public void i_choose_to_view_the_progrmas_by_enrollment() {
              ad.sortPrograms(programs);
	}
	
	
	@Then("I should see a list of programms sorted by the number of enrollments")
	public void i_should_see_a_list_of_programms_sorted_by_the_number_of_enrollments() {
		
		ArrayList<Programm> sortedPrograms = programs;
	
	    for (int i = 0; i < sortedPrograms.size() - 1; i++) {
	        Programm current = sortedPrograms.get(i);
	        Programm next = sortedPrograms.get(i + 1);
	        assert current.getEnrollment() >= next.getEnrollment() : 
	        	
	            "Programs are not sorted correctly by enrollment. " +
	            current.getProgramTitle() + " has " + current.getEnrollment() +
	            " enrollments, but " + next.getProgramTitle() + " has " + next.getEnrollment();
	    }
	    ad.viewStatistics(sortedPrograms);
	}
	
	
	
	 Programm program = new Programm("Yoga Class", "4 weeks", "Beginner", "Flexibility", 100.0);

	    // Add sample clients to the program
	    Client client11 = new Client("C001", "Alice", 25, "alice@example.com", "Fitness", "Vegan");
	    Client client22 = new Client("C002", "Bob", 30, "bob@example.com", "Strength", "Keto");

	
	
	@Given("the system keeps track of revenue, attendance on each programm")
	public void the_system_keeps_track_of_revenue_attendance_on_each_programm() {
		 // Create sample programs
	   
	    program.addClient(client11); // Enrolled clients
	    program.addClient(client22);

	    // Simulate attendance
	    program.attendedClients.add(client11); // Assuming there's an `attendedClients` list
	}
	
	
	
	@When("i choose to generate a report for a certain program")
	public void i_choose_to_generate_a_report_for_a_certain_program() {
		// Call the functions to calculate attendance rate and revenue
	    Admin.generateReport(program);
	    
	}
	@Then("a report should be generated with the right values")
	public void a_report_should_be_generated_with_the_right_values() {
 
		
		double expectedAttendance= 0.5;
		double actualAttendance= program.getAttendanceRate();
		
		double expectedRevenue = 200.0;
		double actualRevenue= program.getRevenue();
		
	    assertTrue(actualAttendance==expectedAttendance ); // Verify program title is in the report
	    assertTrue(expectedRevenue==actualRevenue); // Verify attendance rate is in the report
	}











































}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	