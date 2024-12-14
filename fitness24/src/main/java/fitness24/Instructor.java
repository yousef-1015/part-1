package fitness24;

import java.util.ArrayList;

public class Instructor {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setSchedule(Programm program,Session session) {
    	
    	program.setSession(session);
    	
    }
	
	
	
	public Programm createProgram(String program_title, String duration, String difficulty_level, String goals, double price) {
		
		Programm temp= new Programm(program_title, duration,difficulty_level,goals,price  );
		
    	
    	return temp;
    	
    }
	
	
	
	
	
	
	
	
	
	
	

}
