package fitness24;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Admin 
{
	 public ArrayList <Account> accounts;
	 public Admin() {
	        accounts = new ArrayList<>(); // Initialize the ArrayList
	    }
	 
	 
	 
	 
	 
	    public void addAccount(String username, String password, String role) {
	        Account newAccount = new Account();
	        newAccount.setUsername(username);
	        newAccount.setPassword(password);
	        newAccount.setRole(role); // Set the role

	        accounts.add(newAccount); 
// Add the new account to the ArrayList
	    }
	    
	    public boolean updateAccount(String username, String newPassword, String newRole, String newBirthdate, String newPhoneNumber) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setPassword(newPassword);
	                account.setRole(newRole);
	                account.setBirthdate(newBirthdate);
	                account.setPhonenumber(newPhoneNumber);
	                return true; // Update successful
	            }
	        }
	        
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);

	        
	        return false; // Account not found
	    
	    }
	    
	    
	    public boolean updatePassword(String username, String newPassword) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setPassword(newPassword);
	                return true; 
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);

	        return false; 
	    }
	    public boolean updateRole(String username, String newRole) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) 
	            {
	                account.setRole(newRole);
	                return true; 
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);

	        return false; 
	    }
	    
	    public boolean updateBirthdate(String username, String newBirthdate) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setBirthdate(newBirthdate);
	                return true; 
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);

	        return false; 
	    }
	    
	    
	    
	    public boolean updateStatus (String username,String ustatus) 
	    {
	    	 for (Account account : accounts) {
		            if (account.getUsername().equals(username))
		            {
		            	account.setStatus(ustatus);
		    	    	return true;
		            	
		            }
		            }
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);
	        
	    	return false;

	    	
	    	
	    }
	    public boolean updatePhoneNumber(String username, String newPhoneNumber) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setPhonenumber(newPhoneNumber);
	                return true; 
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);

	        return false; 
	    }
	    
	    
	    
	    public void displayAccounts() {
	        for (Account account : accounts) {
	            System.out.println("Username: " + account.getUsername() + ", Password: " + account.getPassword() + ", Login Successful: " );
	        }
	    }
 
	    // Method to get the list of accounts
	    public ArrayList<Account> getAccounts() {
	        return accounts;
	    }
	    
	    public String checkinfo(String username, String password) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
	                return account.getRoleAsString(); // Return the role if credentials are valid
	            }
	        }
	        return null; // Credentials not found
	    }
	    
	    
	    public ArrayList<Programm> sortPrograms( ArrayList<Programm> pro){
	    	
	    	ArrayList<Programm> sorted =  pro;
	    	sorted.sort((p1, p2) -> Integer.compare(p2.getEnrollment(), p1.getEnrollment()));

	    	
			return sorted;
	    	
	    	
	    	
	    	
	    }
	    
	    
        public double getProgramAttendanceRate(Programm program) {
	    	
	    	return program.getAttendanceRate();
	    	
	    }
        
        
        public double getProgramRevenue(Programm program) {
	        return program.getEnrollment()* program.price;
	    }
	    
	    
	    
	    public void viewStatistics(ArrayList<Programm> programm) {
	        // Sort the programs based on the enrollment (descending order)

	    	ArrayList<Programm> temp = programm;
	    	sortPrograms(temp);
	        // Output the sorted list of programs by program title and enrollment count
	        for (Programm program : temp) {
	            System.out.println("Program: " + program.getProgramTitle() + ", Enrollments: " + program.getEnrollment());
	        }
	    }
	}
	    
	    
	    
	    
	    
	    
	    
	    
	
	    