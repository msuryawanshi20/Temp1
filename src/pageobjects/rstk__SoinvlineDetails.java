package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Soinvline Details"                                
               , summary=""
               , page="SoinvlineDetails"
               , namespacePrefix="rstk"
               , object="rstk__soinvline__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SoinvlineDetails {

	
	@TextType()
	@FindBy(xpath = "//input[@class='amount predisc']")
	public WebElement Price_Details;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save Details']")
	public WebElement SaveDetails;
	
	
	@ButtonType()
	@FindBy(xpath = "//h2[text()='Line Details']/following::button[@onclick='component_close()']")
	public WebElement Close_Details;
	
}
