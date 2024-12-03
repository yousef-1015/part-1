package fitness3;

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
	public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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
