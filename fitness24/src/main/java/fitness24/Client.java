package fitness24;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {
    // Attributes
    private String id; // Unique identifier for the client
    private String name;
    private int age;
    private String email;
    private String fitnessGoal; // e.g., weight loss, muscle building
    private String dietaryPreference; // e.g., vegetarian, keto
    private double weight; // Current weight
    private double bmi; // Current BMI
    private ArrayList<Programm> enrolledPrograms; // List of programs the client has enrolled in
    private HashMap<Programm, String> achievements; // Program -> Badge/Achievement
    private ArrayList<String> feedback; // Feedback messages submitted to instructors
	private ArrayList<Inbox> inboxList;

    // Constructor
    public Client(String id, String name, int age, String email, String fitnessGoal, String dietaryPreference) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.fitnessGoal = fitnessGoal;
        this.dietaryPreference = dietaryPreference;
        this.weight = 0.0;
        this.bmi = 0.0;
        this.enrolledPrograms = new ArrayList<>();
        inboxList=new ArrayList<>();
        this.achievements = new HashMap<>();
        this.feedback = new ArrayList<>();
    }

    // Methods

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public String getDietaryPreference() {
        return dietaryPreference;
    }

    public void setDietaryPreference(String dietaryPreference) {
        this.dietaryPreference = dietaryPreference;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    // Enroll in a program
    public void enrollInProgram(Programm program) {
        if (!enrolledPrograms.contains(program)) {
            enrolledPrograms.add(program);
        }
    }

    // View enrolled programs
    public ArrayList<Programm> getEnrolledPrograms() {
        return new ArrayList<>(enrolledPrograms);
    }

    // Add achievement for a completed program
    public void addAchievement(Programm program, String badge) {
        achievements.put(program, badge);
    }

    // View achievements
    public HashMap<Programm, String> getAchievements() {
        return new HashMap<>(achievements);
    }

    // Submit feedback
    public void submitFeedback(String feedbackMessage) {
        feedback.add(feedbackMessage);
    }
    
    public double getAttendance() {
    	
    
    	
    	double attendance=0;
    	double enrolled = this.enrolledPrograms.size();
    	
    	if (enrolled==0) return 0;
    	
    	else {
    	for (Programm program: this.enrolledPrograms) {
    		
    		if (program.attendedClients.contains(this))
    			attendance++;
    		
    	}
    	
    	return attendance/enrolled;}
    	
    }
    
public double getCompletion() {
    	
    
    	
    	double completion=0;
    	double enrolled = this.enrolledPrograms.size();
    	
    	if (enrolled==0) return 0;
    	
    	else {
    	for (Programm program: this.enrolledPrograms) {
    		
    		if (program.getStatus().equals("complete"))
    			completion++;
    		
    	}
    	
    	return completion/enrolled;}
    	
    }




public String getProgress() {
	
	
	       return "\n" + this.name + 
	    		   "\nAttendance Rate: " + (getAttendance() * 100) + "%" +
	               "\ncompletion rate:" + (getCompletion() * 100) + "%";
	
	
	 
}

    // Get all feedback
    public ArrayList<String> getFeedback() {
        return new ArrayList<>(feedback);
    }

	public ArrayList<Inbox> getInboxList() {
		return inboxList;
	}

	public void setInboxList(ArrayList<Inbox> inboxList) {
		this.inboxList = inboxList;
	}
}

