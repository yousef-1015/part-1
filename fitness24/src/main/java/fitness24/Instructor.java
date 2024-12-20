package fitness24;

import java.util.ArrayList;

public class Instructor {
	
	
	private String firstname;
	
	
	
	
	
	
	




	public  Instructor(String firstname) {
		
		this.firstname= firstname;
		
		
		
		
		
	}
	
	
	
	
	public static void setSchedule(Programm programm,Session session) {
    	
for (Programm program: Admin.programs ) {
			
			if(program == programm) {
				
				program.setSession(session);
			
			}
			
			
		}    	
    }
	
	
	
	public static void createProgram(String program_title, String duration, String difficulty_level, String goals, double price) {
		
		Programm temp= new Programm(program_title, duration,difficulty_level,goals,price  );
		
    	
    	Admin.programs.add(temp);
    	
    	
    }
	
	public static void updateProgramTitle(Programm programm,String title) {
		
		for (Programm program: Admin.programs ) {
			
			if(program == programm) {
				
				program.setProgramTitle(title);
			
			}
			
			
		}
	}
		
		public static void updateProgramDuration(Programm programm,String duration) {
			
			for (Programm program: Admin.programs ) {
				
				if(program == programm) {
					
					program.setDuration(duration);				
				}
				
				
			}
		
		
		
		
	}
		
public static void updateProgramGoals(Programm programm,String duration) {
			
			for (Programm program: Admin.programs ) {
				
				if(program == programm) {
					
					program.setGoals(duration);				
				}
				
				
			}
		
		
		
		
	}

public static void updateProgramDifficulty(Programm programm,String Difficulty) {
	
	for (Programm program: Admin.programs ) {
		
		if(program == programm) {
			
			program.setDifficultyLevel(Difficulty);			
		}
		
		
	}




}


public static void updateProgramPrice(Programm programm,double price) {
	
	for (Programm program: Admin.programs ) {
		
		if(program == programm) {
			
			program.setPrice(price);
			
		}
		
		
	}




}


public static void deleteProgram(Programm program) {
		
	Admin.programs.remove(program);
	
}



public void sendInbox(Client client, Inbox inbox) {
	
	client.getInboxList().add(inbox);
	
	
	
}




public  void updatAndNotify(Programm program, String string) {
	
	Session temp = program.getSession();
	temp.setDescription(string);
	program.setSession(temp);
	
	Inbox inbox;
	String notification= "the program" + program.getProgramTitle() + "\n has been reschudeled to :" + string;
	String message;
	
	for (Client client: program.enrolledClients) {
		
		message = "\nDear" + client.getName() + notification;
		inbox= new Inbox("notification",this,message);
		
		sendInbox(client,inbox);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

}
