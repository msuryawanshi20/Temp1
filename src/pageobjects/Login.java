package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Login"                                
     , summary=""
     , relativeUrl=""
     , connection="Arena"
     )             
public class Login {

	@TextType()
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Email;
	@ButtonType()
	@FindBy(xpath = "//input[@id='app-continue-button']")
	public WebElement continueButton;
	@TextType()
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	@ButtonType()
	@FindBy(xpath = "//input[@id='app-login-button']")
	public WebElement logIn;
			
}
