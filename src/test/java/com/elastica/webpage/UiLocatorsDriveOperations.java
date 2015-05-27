package com.elastica.webpage;

import org.openqa.selenium.By;






import com.elastica.webelements.ButtonElement;
import com.elastica.webelements.HtmlElement;
import com.elastica.webelements.LinkElement;
import com.elastica.webelements.TextFieldElement;

public interface UiLocatorsDriveOperations {
	
	    public static final LinkElement uploadLink = new LinkElement("Login Text Box", By.linkText("Upload"));
	    public static final LinkElement uploadFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(2) span span ul li:nth-child(1)"));
	    public static final HtmlElement fileSelectionCheckboxList = new HtmlElement("Login Text Box", By.cssSelector(".centerColumn .fillTable>table>tbody .file .selectArea"));
	    public static final LinkElement shareLink = new LinkElement("Login Text Box", By.linkText("Share"));
	    public static final TextFieldElement emailToShareTextBox = new TextFieldElement("Login Text Box", By.cssSelector(".cp_primaryInput.cp_anyInput.t_urtc"));
	    public static final TextFieldElement quickNoteTextBox = new TextFieldElement("Login Text Box", By.cssSelector(".sd_email_message"));
	    public static final ButtonElement shareButton = new ButtonElement("Login Text Box", By.cssSelector(".sd_email_share.default"));
	    public static final ButtonElement closeButton = new ButtonElement("Login Text Box", By.cssSelector(".sd_done.default"));
	    public static final LinkElement manageLink = new LinkElement("Login Text Box", By.linkText("Manage"));
	    public static final LinkElement delete = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(7) span span ul li:nth-child(2)"));
	    public static final LinkElement createLink = new LinkElement("Login Text Box", By.linkText("Create"));
	    public static final LinkElement createFolderLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(1)"));
	    public static final TextFieldElement typeInFolderNameTextbox = new TextFieldElement("Login Text Box", By.cssSelector(".folderName"));
	    public static final ButtonElement createFolderButton = new ButtonElement("Login Text Box", By.cssSelector(".UserContent .buttonContainer input"));
	    public static final LinkElement createTextFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(7)"));
	    public static final LinkElement createWordFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(2)"));
	    public static final LinkElement createExlFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(3)"));
	    public static final LinkElement createPptFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(4)"));
	    public static final LinkElement createOnenoteFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(5)"));
	    public static final LinkElement createExlSurveyFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(1) span span ul li:nth-child(6)"));
	    
	    
	    
	    
	    
	   
}
