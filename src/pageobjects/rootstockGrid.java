package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="rootstockGrid"                                
               , summary=""
               , connection="QARSF_Admin"
               , object=""
     )             
public class rootstockGrid {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add']")
	public WebElement polineadd;
	
}
