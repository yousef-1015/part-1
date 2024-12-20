package fitness3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fitness3.Client;
import fitness3.Inbox;
import fitness3.Instructor;
import fitness3.Programm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Progress_trackingTest {
	
	

	private Instructor instructor = new Instructor("ahmad");
	private Client client;
	private String message = "this is testing";
    private String feedback = "this is feedback\n";
    private String report,progress;
	private String type="message";
	private ArrayList<Client> clients= new ArrayList<>();
	private Inbox inbox = new Inbox("message",instructor,message);
	private Inbox progressReport ;

	private boolean found2 = false;

	private boolean found = false;
	
	

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

	
	

      @Given("the system keeps track of Clients and I have chosen a client to monitor")
public void the_system_keeps_track_of_clients_and_i_have_chosen_a_client_to_monitor() {
    	  
    	  
    	  
    	  
    	  System.out.println("Setting up the test...");

          clients.add(client4);
          clients.add(client2);

          System.out.println("Clients list size: " + clients.size());

          client = clients.get(1); // Assign client1
          System.out.println("Client selected: " + client.getName());
          
          
          
        program1.setStatusComplete();
      	program2.setStatusComplete();
      	program3.setStatusComplete();

           program1.addClient( client2 );
           program2.addClient( client2  );
           program3.addClient( client2 );
           program2.addAttendant(client2);
           
           programs.add(program1);
           programs.add(program2);
           programs.add(program3);
  
  	  
    // Write code here that turns the phrase above into concrete actions
}
       @When("i get the progress of the client")
public void i_get_the_progress_of_the_client() {
        
    	   progress = client.getProgress();
    	   
    	   
}
      @Then("I should see their progress")
public void i_should_see_their_progress() {
    	  
    	  
    	  System.out.println(progress);

    	  double actual_attendance = 1.0/3.0;
    	  double actual_completion = 1.0;
    	  
    	    	  
    	  assertTrue( client.getAttendance()== actual_attendance);
    	  assertTrue(client.getCompletion() == actual_completion);
    	  
    	  
    	  System.out.println(progress);
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  

}

	
}
