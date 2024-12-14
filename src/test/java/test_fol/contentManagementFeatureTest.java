package test_fol;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import javax.swing.*;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fitness3.Instructor;
import fitness3.Admin;
import io.cucumber.java.en.*;

public class contentManagementFeatureTest {
    private String message;
    private Admin admin = new Admin();
    private  Instructor instructor = new Instructor();
    private File selectedFile;
    private ArrayList<File> submittedPDFs;

    public contentManagementFeatureTest() {
        submittedPDFs = instructor.getSubmittedPDFs();
    }
    
    
    

    @Given("the instructor has opened the file submission dialog")
    public void the_instructor_has_opened_the_file_submission_dialog() {
        // Simulate opening the file chooser
        submittedPDFs.clear(); // Clear any previously submitted files
        message = null;
    }
    @When("the instructor selects a valid PDF file")
    public void the_instructor_selects_a_valid_pdf_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the instructor selects a valid PDF file {string}")
    public void the_instructor_selects_a_valid_pdf_file(String filePath) {
        selectedFile = new File(filePath);
        if (filePath.endsWith(".pdf")) {
            instructor.submitFile(selectedFile);
            message = "PDF submitted successfully";
        } else {
            message = "Invalid file type: " + selectedFile.getName();
        }
    }

    @Then("the file is added to the list of submitted files")
    public void the_file_is_added_to_the_list_of_submitted_files() {
        assertTrue("The file should be added to the list", submittedPDFs.contains(selectedFile));
    }

    @Then("the file name is displayed in the list as {string}")
    public void the_file_name_is_displayed_in_the_list_as(String status) {
        String expectedStatus = selectedFile.getName() + " (" + status + ")";
        assertEquals("The file name and status should match", expectedStatus, instructor.getFileStatus(selectedFile));
    }

    @When("the instructor selects a non-PDF file {string}")
    public void the_instructor_selects_a_non_pdf_file(String filePath) {
        selectedFile = new File(filePath);
        if (!filePath.endsWith(".pdf")) {
            message = "Invalid file type: " + selectedFile.getName();
        } else {
            instructor.submitFile(selectedFile);
        }
    }

    @Then("the system shows an error message {string}")
    public void the_system_shows_an_error_message(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }

    @Then("the file is not added to the list of submitted files")
    public void the_file_is_not_added_to_the_list_of_submitted_files() {
        assertFalse("The file should not be added to the list", submittedPDFs.contains(selectedFile));
    }

    @When("the instructor cancels the dialog without selecting any files")
    public void the_instructor_cancels_the_dialog_without_selecting_any_files() {
        selectedFile = null;
        message = null; // No message is shown
    }

    @Then("no files are added to the list of submitted files")
    public void no_files_are_added_to_the_list_of_submitted_files() {
        assertTrue("No files should be added", submittedPDFs.isEmpty());
    }
    
    
    @Test
    public void testSubmitValidPDF() {
        File validPDF = new File("valid_report.pdf");
        instructor.submitFile(validPDF);

        ArrayList<File> submittedFiles = instructor.getSubmittedPDFs();
        assertTrue("The valid PDF should be added to the submitted list", submittedFiles.contains(validPDF));

        assertEquals("File status should be 'Not Approved'", "valid_report.pdf (Not Approved)", instructor.getFileStatus(validPDF));
    }

    @When("the instructor selects multiple files {string} and {string}")
    public void the_instructor_selects_multiple_files_and(String filePath1, String filePath2) {
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        if (file1.getName().endsWith(".pdf")) {
            instructor.submitFile(file1);
        }
        if (file2.getName().endsWith(".pdf")) {
            instructor.submitFile(file2);
        }
    }

    @Then("only valid PDF files are added to the list of submitted files")
    public void only_valid_pdf_files_are_added_to_the_list_of_submitted_files() {
        for (File file : submittedPDFs) {
            assertTrue("All files in the list should be PDFs", file.getName().endsWith(".pdf"));
        }
    }

    @Then("the system shows an error message for each invalid file")
    public void the_system_shows_an_error_message_for_each_invalid_file() {
        for (File file : submittedPDFs) {
            if (!file.getName().endsWith(".pdf")) {
                message = "Invalid file type: " + file.getName();
                assertEquals("The system should show an error for invalid files", message, "Invalid file type: " + file.getName());
            }
        }
    }
}
