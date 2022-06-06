package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="FSL_HomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class FSL_HomePage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Work Orders']")
	public WebElement WorkOrders;
	@TextType()
	@FindBy(xpath = "//span[@class='test-id__field-label' and text()='Work Order Number']/following::div//span//span")
	public WebElement WorkOrderNumber;
	@TextType()
	@FindBy(xpath = "//span[@class='test-id__field-label' and text()='Status']/following::div//span//span")
	public WebElement Status;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/article//a[normalize-space(.)='New']")
	public WebElement New;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//h1//lightning-formatted-text")
	public WebElement SalesOrderHeader_Title;
			
}
