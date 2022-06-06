package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="rootstockpolineGrid"                                
               , summary=""
               , connection="QARSF_Admin"
               , object=""
     )             
public class rootstockpolineGrid {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@title='Add']")
	public WebElement polineadd;
	
}
  