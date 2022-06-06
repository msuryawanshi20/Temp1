package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__systate"                                
               , summary=""
               , page="systate"
               , namespacePrefix="rstk"
               , object="rstk__systate__c"
               , connection="QARSF_Admin"
     )             
public class rstk__systate {

	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement stateProvince;
	@TextType()
	@FindBy(xpath = "//td/table//div/input")
	public WebElement country;
	@ChoiceListType()
	@FindBy(xpath = "//span/div/select")
	public WebElement Sales_Region;
	@TextType()
	@FindBy(xpath = "//div/table/tbody/tr/td/span/div/input")
	public WebElement comments;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	
}
