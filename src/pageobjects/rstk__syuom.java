package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__syuom"                                
               , summary=""
               , page="syuom"
               , namespacePrefix="rstk"
               , object="rstk__syuom__c"
               , connection="QARSF_Admin"
     )             
public class rstk__syuom {

	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement UOMCode;
	@ChoiceListType()
	@FindBy(xpath = "//span//select")
	public WebElement Service_Type;
	@TextType()
	@FindBy(xpath = "//span/div/input")
	public WebElement description;
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
