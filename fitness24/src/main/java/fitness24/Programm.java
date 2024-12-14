package fitness24;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Programm {
	
	
	private String program_title, duration, difficulty_level, goals;
	double price, revenue;
	public ArrayList<Client> enrolledClients, attendedClients;	
	
	
	 
	  public Programm(String program_title, String duration, String difficulty_level, String goals, double price) {
		    revenue = 0.0;
		    this.price=price;
	        this.program_title = program_title;
	        this.duration = duration;
	        this.difficulty_level = difficulty_level;
	        this.goals = goals;
	        this.enrolledClients = new ArrayList<>();
	        this.attendedClients = new ArrayList<>();
	        
	    }
	  // Getters and Setters
	    public String getProgramTitle() {
	        return program_title;
	    }

	    public void setProgramTitle(String program_title) {
	        this.program_title = program_title;
	    }

	    public String getDuration() {
	        return duration;
	    }

	    public void setDuration(String duration) {
	        this.duration = duration;
	    }

	    public String getDifficultyLevel() {
	        return difficulty_level;
	    }

	    public void setDifficultyLevel(String difficulty_level) {
	        this.difficulty_level = difficulty_level;
	    }

	    public String getGoals() {
	        return goals;
	    }

	    public void setGoals(String goals) {
	        this.goals = goals;
	    }

	    public ArrayList<Client> getEnrolledClients() {
	        return enrolledClients;
	    }

	    public void setEnrolledClients(ArrayList<Client> clientList) {
	        this.enrolledClients = clientList;
	    }
	    
	    public ArrayList<Client> getAttendedClients() {
	        return attendedClients;
	    }

	    public void setAttendedClients(ArrayList<Client> clientList) {
	        this.attendedClients = clientList;
	    }
	    
	    public double getAttendanceRate() {
	    	
	    	double attended = attendedClients.size();
	    	double enrolled = enrolledClients.size();
	    	return attended/enrolled;
	    	
	    }
	    
	    
	    public void addAttendant(Client client) {
	    	
	    	if (!enrolledClients.contains(client))
	    		JOptionPane.showMessageDialog(null, "Client does not exist in the list.", "Information", JOptionPane.INFORMATION_MESSAGE);
	    	else if (attendedClients.contains(client))
	    		JOptionPane.showMessageDialog(null, "Client already exists in the list.", "Information", JOptionPane.INFORMATION_MESSAGE);

	    	else attendedClients.add(client);
	    	
	    }
	    
	   

	    // Method to get enrollment count
	    public int getEnrollment() {
	        return enrolledClients.size();
	    }
	    
	    public double getRevenue() {
	        return this.getEnrollment()* this.price;
	    }

	    // Method to add a client to the program
	    public void addClient(Client client) {
	        if (!enrolledClients.contains(client)) {
	            enrolledClients.add(client);
	        }
	    }

	    // Method to remove a client from the program
	    public void removeClient(Client client) {
	        enrolledClients.remove(client);
	    }
	 
	 

	
	
	
	
	
	
	
	
	

}
