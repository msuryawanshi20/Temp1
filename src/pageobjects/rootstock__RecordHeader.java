package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="rootstock__RecordHeader"                                
               , summary=""
               , connection="QARSF_Admin"
               , auraComponent="RecordHeader"
               , namespacePrefix="rootstock"
     )             
public class rootstock__RecordHeader {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[3]/lightning-output-field//lightning-formatted-text")
	public WebElement Order_Number;

	
}
