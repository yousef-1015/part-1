package test_fol;
import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import fitness3.AccountManager;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class LoginFeatureTest {
    public  String Username, Password;
    public AccountManager loginaccount;

    public LoginFeatureTest() {
        loginaccount = new AccountManager();
        loginaccount.addAccount("ahmad", "ahmadpass");
        loginaccount.addAccount("kareem", "kareempass");
        loginaccount.addAccount("fawzi", "fawzipass");
        loginaccount.addAccount("khaled", "khlaedpass");
 

    }

    @Given("the username should be filled {string}")
    public void the_username_should_be_filled(String username) {
        this.Username = username;
    }

    @Given("the password should be filled {string}")
    public void password_should_be_filled(String password) {
    	this.Password = password;
    }

    @When("I choose to login")
    public void i_choose_to_login() {
        // This method can remain empty or be used for additional logic if needed.
    }
    @Then("display a message {string}")
    public void display_a_message(String expectedMessage) {
        boolean loginSuccessful = loginaccount.checkinfo(Username, Password);
         
        String actualMessage;

        if (loginSuccessful) {
        	
        	
            JOptionPane.showMessageDialog(null, expectedMessage, "Login Status", JOptionPane.INFORMATION_MESSAGE);

//            actualMessage = "Login successful";
//        } else {
//            actualMessage = "Login failed";
        }

       // JOptionPane.showMessageDialog(null, actualMessage, "Login Status", JOptionPane.INFORMATION_MESSAGE);
        
        //assertEquals(expectedMessage, actualMessage);
        assertTrue(loginSuccessful);
    }
		
		
	}

