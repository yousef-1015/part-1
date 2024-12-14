package fitness3;
import java.awt.*;

import java.util.ArrayList;
import java.util.Date;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Admin 
{
	 public ArrayList <Account> accounts;
	 public ArrayList <Account> requests;
	 

	 
	 public Admin() {
	        accounts = new ArrayList<>(); 
	        requests= new ArrayList<>();
	    }
	 
	 
	 
	 
	 
	    public void addAccount(String username, String password, String role) {
	    	 if (usernameExists(username)) {
	    	        JOptionPane.showMessageDialog(null, "Username is already taken", "ERROR", JOptionPane.ERROR_MESSAGE);
	    	        return; // Exit the method to prevent adding a duplicate account
	    	    }
	        Account newAccount = new Account();
	        newAccount.setUsername(username);
	        newAccount.setPassword(password);
	        newAccount.setRole(role); // Set the role
  
	        accounts.add(newAccount); 
// Add the new account to the ArrayList
	    }
	    public void Addfaccount(String username , String password,String Role,String phnoenumber,String birthdate) {
	    	 if (usernameExists(username)) {
	    	        JOptionPane.showMessageDialog(null, "Username is already taken", "ERROR", JOptionPane.ERROR_MESSAGE);
	    	        return; // Exit the method to prevent adding a duplicate account
	    	    }
	    	
	    	Account newAccount = new Account();
	        newAccount.setUsername(username);
	        newAccount.setPassword(password);
	        newAccount.setRole(Role); 
	        newAccount.setBirthdate(birthdate);
	        newAccount.setPhonenumber(phnoenumber);
	        
	        accounts.add(newAccount); 

	    	
	    	
	    	
	    }
	    
	    public boolean updateAccount1(String username, String newPassword, String newRole, String newBirthdate, String newPhoneNumber) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setPassword(newPassword);
	                account.setRole(newRole);
	                account.setBirthdate(newBirthdate);
	                account.setPhonenumber(newPhoneNumber);
	                return true; 
	            }
	        }
	        
	        JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);

	        
	        return false; 
	    
	    }
	    public boolean usernameExists(String username) {
	      
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                return true; 
	            }
	        }
	        return false; 
	    }
	    
	    public boolean updatePassword(String username, String newPassword) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setPassword(newPassword);
	                return true; 
	            }
	            else {	    
	            	JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);
}
	        }

	        return false; 
	    }
	    public boolean updateRole(String username, String newRole) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) 
	            {
	                account.setRole(newRole);
	                return true; 
	            }
	            else {	    
	            	JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);
}
	        }

	        return false; 
	    }
	    public boolean updateBirthdate(String username, String newBirthdate) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setBirthdate(newBirthdate);
	                return true; 
	            }
	            else {	    
	            	JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);
}
	        }

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
		            else {	    
		            	JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);
}
		            	
		            }
	        
	    	return false;

	    	
	    	
	    }
	    public boolean updatePhoneNumber(String username, String newPhoneNumber) {
	        for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	                account.setPhonenumber(newPhoneNumber);
	                return true; 
	            }
	            else {	    
	            	JOptionPane.showMessageDialog(null, "Username Does Not Exist ", "ERROR", JOptionPane.ERROR_MESSAGE);
}
	        }

	        return false; 
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
	        return null; 
	    }





		public boolean updateAccount(String username, String newPassword, String newRole) {
			 for (Account account : accounts) {
		            if (account.getUsername().equals(username)) {
		                account.setPassword(newPassword);
		                account.setRole(newRole);
		                return true; 
		            }
			
			
			
		}
				return false;

	
	    }





		public boolean deactivateAccount(String username) {
			 for (Account account : accounts) {
		            if (account.getUsername().equals(username)) {
		            	account.setStatus("INACTIVE");
		            	account.settest(false);

		            	return true; 
		            }
			
			
		}
			return false;
		}





		public String updateAccount(String uSERNAME, String pASSWORD, String rOLE, String pHONENUM, String bDATE) {
			// TODO Auto-generated method stub
			return null;
		}





		public void addAccount(Account tAccount)
		{
			Addfaccount(tAccount.getUsername(),tAccount.getPassword(),tAccount.getRole(),tAccount.getPhonenumber(),tAccount.getBirthdate());
		}
		
		
		public void updateAccount2(String username, String newPassword, String newRole, String newPhoneNumber, String newBirthdate) {
		    for (Account account : accounts) {
		        if (account.getUsername().equals(username)) {
		            if (newPassword != null && !newPassword.isEmpty()) {
		                account.setPassword(newPassword);
		            }
		            if (newRole != null && !newRole.isEmpty()) {
		                account.setRole(newRole);
		            }
		            if (newPhoneNumber != null && !newPhoneNumber.isEmpty()) {
		                account.setPhonenumber(newPhoneNumber);
		            }
		            if (newBirthdate != null && !newBirthdate.isEmpty()) {
		                account.setBirthdate(newBirthdate);
		            }
		            JOptionPane.showMessageDialog(null, "Account updated successfully", "INFO", JOptionPane.INFORMATION_MESSAGE);
		            return; // Exit the method after successful update
		        }
		    }
		    JOptionPane.showMessageDialog(null, "Username Does Not Exist", "ERROR", JOptionPane.ERROR_MESSAGE);
		}





		public void displayAccounts() {
		    StringBuilder accountDetails = new StringBuilder();
		    
		    if (accounts.isEmpty()) {
		        accountDetails.append("No accounts available.");
		    } else {
		        for (Account account : accounts) {
		            accountDetails.append("Username: ").append(account.getUsername())
                    				.append(", Password: ").append(account.getPassword())

		                          .append(", Role: ").append(account.getRole())
		                          .append(", Status: ").append(account.getStatus())
		                          .append(", Birthdate: ").append(account.getBirthdate())
		                          .append(", Phone Number: ").append(account.getPhonenumber())
		                          .append("\n");
		        }
		    }
		    
		    // Display the account details in a dialog
		    JOptionPane.showMessageDialog(null, accountDetails.toString(), "Account Details", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		public void Deactivate(String username) {
			for (Account account : accounts) {
	            if (account.getUsername().equals(username)) {
	            	
	            	account.settest(false);
	            	
	            }
	            

			
			
			
			}
			
			
		}
		
		
		 public void displaystatus(String username) {
		    	
		    	for (Account account : accounts) {
		            if (account.getUsername().equals(username)) {
					    JOptionPane.showMessageDialog(null, username +"'s Status "+ account.getStatus(), "Account Details", JOptionPane.INFORMATION_MESSAGE);

		            	
		            }}
		    	

		    }
		
		 
		 public void addRequest(String username , String password,String phnoenumber,String birthdate)
		 {
			 if (usernameExists(username)) {
	 	        JOptionPane.showMessageDialog(null, "Username is already taken", "ERROR", JOptionPane.ERROR_MESSAGE);
	 	        return; 
	 	    }
			 Account newAccount = new Account();
		        newAccount.setUsername(username);
		        newAccount.setPassword(password);
		        newAccount.setRole("INACTIVE"); 
		        newAccount.setBirthdate(birthdate);
		        newAccount.setPhonenumber(phnoenumber);
		        
		        requests.add(newAccount); 
			 
		 }	
		 public void displayRequests() {
			    StringBuilder accountDetails = new StringBuilder();
			    
			    if (requests.isEmpty()) {
			        accountDetails.append("No accounts available.");
			    } else {
			        for (Account account : requests) {
			            accountDetails.append("Username: ").append(account.getUsername())
	                 				.append(", Password: ").append(account.getPassword())
			                          .append(", Role: ").append(account.getRole())
			                          .append(", Status: ").append(account.getStatus())
			                          .append(", Birthdate: ").append(account.getBirthdate())
			                          .append(", Phone Number: ").append(account.getPhonenumber())
			                          .append("\n");
			        }
			    }
			    
			    // Display the account details in a dialog
			    JOptionPane.showMessageDialog(null, accountDetails.toString(), "Requests", JOptionPane.INFORMATION_MESSAGE);
			}
		 
		 public void addRequest(Account newRequest) {
			    if (usernameExists(newRequest.getUsername())) {
			        JOptionPane.showMessageDialog(null, "Username is already taken", "ERROR", JOptionPane.ERROR_MESSAGE);
			        return; 
			    }

			    newRequest.setStatus("INACTIVE");

			    requests.add(newRequest);}

		 
		 
		 	public void approveRequest(Account toApprove) 
		 	{
		 		 if (requests.contains(toApprove)) {
		 	        toApprove.setStatus("ACTIVE");
		 	        
		 	        requests.remove(toApprove);
		 	        
		 	        accounts.add(toApprove);
		 	       JOptionPane.showMessageDialog(null, "Request approved and account activated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
		 	    } else {
		 	        // Notify error if the account does not exist in requests
		 	        JOptionPane.showMessageDialog(null, "Account not found in requests.", "Error", JOptionPane.ERROR_MESSAGE);
		 	    }
		 		
		 	}
		 	
		 	public void openPDF(File file) {
		        if (file != null && Desktop.isDesktopSupported()) {
		            try {
		                Desktop.getDesktop().open(file);
		                System.out.println("Opening PDF: " + file.getName());
		            } catch (IOException e) {
		                System.err.println("Failed to open PDF: " + e.getMessage());
		            }
		        } else {
		            System.out.println("Cannot open file. Desktop is not supported.");
		        }
		    }
		 	public void getallfeedbacks() {
		 	    for (Account account : accounts) {
		 	        String feedback = account.getfeedback();
		 	        if (feedback == null || feedback.isEmpty()) {
		 	            System.out.println(account.getUsername() + "'s Feedback: No feedback provided");
		 	        } else {
		 	            System.out.println(account.getUsername() + "'s Feedback: " + feedback);
		 	        }
		 	    }
		 	}
		 	
		 	
		 	public void addClient() 
		 	{
		 		
		 		
		 		
		 	};
		 	
		 		
		 		
		 		
		 		
		 	}
		 	
		 	
		 	
		 	
		 	



	    
	   

	    

	    
	


