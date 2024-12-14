package fitness3;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Instructor {
    private ArrayList<File> submittedPDFs = new ArrayList<>();
    private ArrayList<String> fileStatuses = new ArrayList<>();
	 public ArrayList <Client> Requests = new ArrayList<>();
	 //public ArrayList <Account> requests;



    // Method to get the list of submitted PDFs
    public ArrayList<File> getSubmittedPDFs() {
        return submittedPDFs;
    }

    // Method to submit a file
    public void submitFile(File file) {
        if (file.getName().endsWith(".pdf")) {
            submittedPDFs.add(file);
            fileStatuses.add(file.getName() + " (Not Approved)");
        }
    }

    // Method to get the status of a submitted file
    public String getFileStatus(File file) {
        int index = submittedPDFs.indexOf(file);
        if (index != -1) {
            return fileStatuses.get(index);
        }
        return "File not found";
    }

    // Method to update the status of a file (e.g., to "Approved")
    public void approveFile(File file) {
        int index = submittedPDFs.indexOf(file);
        if (index != -1) {
            fileStatuses.set(index, file.getName() + " (Approved)");
        }
    }
    
    public void addRequest(String id , String name, int age ,String email, String fitnessGoal ,String dietaryPreference)
	 {
		
		 Client newAccount = new Client(id,name,age,email,fitnessGoal,dietaryPreference);
	      
	        
	        Requests.add(newAccount); 
		 
	 }
   
    
    
    
//    public void addRequest(Account newRequest) {
//	    if (usernameExists(newRequest.getUsername())) {
//	        JOptionPane.showMessageDialog(null, "Username is already taken", "ERROR", JOptionPane.ERROR_MESSAGE);
//	        return; 
//	    }
//
//	    newRequest.setStatus("INACTIVE");
//
//	    Requests.add(newRequest);}
//    
    
    
    
    
    
    
}
