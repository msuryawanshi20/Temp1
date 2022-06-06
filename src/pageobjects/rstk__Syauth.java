package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Syauth"                                
               , summary=""
               , page="Syauth"
               , namespacePrefix="rstk"
               , object="rstk__syauth__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Syauth {

	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement authorizationID;
	@TextType()
	@FindBy(xpath = "//span/div/input")
	public WebElement description;
	@TextType()
	@FindBy(xpath = "//tbody//td/input")
	public WebElement password;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[@value='Edit']")
	public WebElement Edit1;
	
}
