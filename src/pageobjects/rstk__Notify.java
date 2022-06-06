package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Notify"                                
               , summary=""
               , page="Notify"
               , namespacePrefix="rstk"
               , object=""
               , connection="QARSF_Admin"
     )             
public class rstk__Notify {

	@TextType()
	@FindBy(xpath = "//td[@class='messageCell']//div")
	public WebElement SO_Header_Deleted;


	
}
