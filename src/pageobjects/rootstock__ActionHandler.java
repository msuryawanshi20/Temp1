package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rootstock__ Action Handler"                                
               , summary=""
               , connection="QARSF_Admin"
               , auraComponent="ActionHandler"
               , namespacePrefix="rootstock"
     )             
public class rootstock__ActionHandler {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close']")
	public WebElement close;
	
}
