package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Lightning_PageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class Lightning_PageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Purchase Order Header']")
	public WebElement purchaseOrderHeader;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement New;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Vendor']/following-sibling::div[1]//input")
	public WebElement Vendor;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Vendor']/parent::lightning-input/parent::div/parent::div/following-sibling::div//div")
	public WebElement vendor;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li/div")
	public WebElement vendorlist;


}
