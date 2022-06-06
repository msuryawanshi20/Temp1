package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="rootstockSolineGrid"                                
               , summary=""
               , connection="QARSF_Admin"
               , object=""
     )             
public class rootstockSolineGrid {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Add']//lightning-primitive-icon")
	public WebElement add;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@id='combobox-button-5039']")
	public WebElement select;

	
	
}
