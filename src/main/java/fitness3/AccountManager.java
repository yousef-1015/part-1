package fitness3;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class AccountManager 
{
	 public ArrayList <Account> accounts;
	 public AccountManager() {
	        accounts = new ArrayList<>(); // Initialize the ArrayList
	    }
	 
	 
	 
	 
	 
	    public void addAccount(String username, String password) {
	        Account newAccount = new Account();
	        newAccount.setUsername(username);
	        newAccount.setPassword(password);
	        accounts.add(newAccount); // Add the new account to the ArrayList
	    }
	    
	    public boolean updateAccount(String username, String newPassword, String newRole, Date newBirthdate, String newPhoneNumber) {
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
	    public boolean updateBirthdate(String username, Date newBirthdate) {
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
	    
	    public boolean checkinfo(String username, String password) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
	                return true; // Credentials found
	            }
	        }
	        return false; // Credentials not found
	    }
	    
	   
	    
	    

	    
	}


