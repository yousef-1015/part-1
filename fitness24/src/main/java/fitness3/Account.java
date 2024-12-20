package fitness3;


import java.util.Date;

public class Account 
{
	private String username;
	private String password;
	private String C;
	private String role;
	private String Status;
	private String birthdate;
	private String phonenumber;
	
	public boolean check;
	
	
	
	
	
	public Account(String username, String password, String role, String status, String birthdate, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.Status = status;
        this.birthdate = birthdate;
        this.phonenumber = phoneNumber;
    }
	// Default constructor
    public Account() {
        this.username = "defaultUser ";
        this.password = "defaultPass";
        this.role = role ; // Default role
        this.Status = "active";
        this.birthdate = "0/0/0" ;// Default to current date
        this.phonenumber = "000-000-0000"; // Default phone number
    }

	
	
	
	
	
	
	




	public void setUsername(String username)
	{
		this.username=username;
	} 
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole( ) {
		return role;
	}
	
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getStatus() {
    	if(Status == null) 
    	{
    		return "Inactive";
    		
    	}
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }
    public void Deactivate() {
    	Status=null;
       
    }
    public String getRoleAsString() {
        if (role != null) {
            return role;
        } else {
            return "No role assigned";
        }
    }
	
	
	 public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }
	    
	    public String getBirthdate() {
	        return birthdate;
	    }

	    public void setBirthdate(String birthdate) {
	        this.birthdate = birthdate;
	    }

	
	
	
	public void loginone(String usernamekk , String passwordkk) 
	{
		if (usernamekk.equals(username) && passwordkk.equals(password)) 
		{
			
			check = true;
			
		}
		else
		{
			check= false;
			
			
		}
		
		
		
	}
	
}