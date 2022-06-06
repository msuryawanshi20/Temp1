package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Quote"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class Quote {

	@TextType()
	@FindBy(xpath = "//label[text()='Opportunity Name']/following::td[1]")
	public WebElement OpportunityName;
	@TextType()
	@FindBy(xpath = "//input[@id='Name']")
	public WebElement Quote_Name;
	@ButtonType()
	@FindBy(name = "save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//div[@id='Name_ileinner']")
	public WebElement QuoteName_Created;
	@ButtonType()
	@FindBy(xpath = "//td[@id='topButtonRow']/input[@name='rstk__create_rootstock_sales_order']")
	public WebElement CreateRootstockSalesOrder;
			
}
