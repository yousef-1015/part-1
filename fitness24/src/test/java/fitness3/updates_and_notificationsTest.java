package fitness3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fitness3.Client;
import fitness3.Instructor;
import fitness3.Programm;
import fitness3.Session;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updates_and_notificationsTest {

	
	
	
	
	
	
	
	
	
	
	Instructor instructor= new Instructor("khaled");
	
	
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
    
    Session session = new Session("bla bla");
    
    
	
	
	@Given("the program has clients enrolled")
	public void the_program_has_clients_enrolled() {

		program1.addClient(client1);
		program1.addClient(client2);
		program1.addClient(client3);
		program1.addClient(client4);

	    program1.setSession(session);

		
		
		
		
		
	}
	@When("i change the schedule of the program")
	public void i_change_the_schedule_of_the_program() {

		
		instructor.updatAndNotify(program1,"every thursday at 5pm");
		
		
		
		
	}
	@Then("all clients enrolled in the program should be notified")
	public void all_clients_enrolled_in_the_program_should_be_notified() {

	for(Client client: program1.enrolledClients) {
		
		System.out.println(client.getInboxList().get(0).getMessage());
		
		
		
		
	}
	
	
	
	
	}
	@Then("the change should reflect on the program")
	public void the_change_should_reflect_on_the_program() {

		
		String actual = program1.getSession().getDescription();
		
		assertTrue(actual==session.getDescription());
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
