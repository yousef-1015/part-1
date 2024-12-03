package fitness3;

import java.util.Date;

public class Account 
{
	private String username;
	private String password;
	private String C;
	private String role;
	private String Status;
	
	private Date birthdate;
	private String phonenumber;
	
	public boolean check;
	
	
	
	
	
	
	
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
	
	public String getRole(String role) {
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
	
	
	 public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }
	    
	    public Date getBirthdate() {
	        return birthdate;
	    }

	    public void setBirthdate(Date birthdate) {
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
