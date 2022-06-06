package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ PO Issue"                                
               , summary=""
               , page="Poissue"
               , namespacePrefix="rstk"
               , object="rstk__woiss__c"
               , connection="QARSFAdmin"
     )             
public class rstk__POIssue {

	public WebDriver driver;

	public rstk__POIssue(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@TextType()
	@FindBy(xpath = "//input[@id='poiss_ordno__c_autocomplete']")
	public WebElement POHeader;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement POlist;
	@ChoiceListType(multipleSelectionString = true, values = {
			@ChoiceListValue(value = "1", title = "Display Non-Serial Components"),
			@ChoiceListValue(value = "3", title = "Include Backflush"),
			@ChoiceListValue(value = "5", title = "Display Document"),
			@ChoiceListValue(value = "6", title = "Display Loc Comments"),
			@ChoiceListValue(value = "7", title = "Display Dmd Comments"),
			@ChoiceListValue(value = "8", title = "Allow Over-Issue"),
			@ChoiceListValue(value = "0", title = "Display All Components"),
			@ChoiceListValue(value = "2", title = "Display Serial Components"),
			@ChoiceListValue(value = "4", title = "Auto-Select Serial Numbers") })
//	@FindBy(xpath = "//td/select/option[normalize-space(.)='Include Backflush']")
	@FindBy(xpath = "//td/select//option[@value='3']")
	public WebElement Displayoption;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Display Components']")
	public WebElement displayComponents;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Issue Selected Components']")
	public WebElement issueSelectedComponents;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='PO Line']/parent::span/parent::th/following-sibling::td//select")
	public WebElement POLine;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='PO Line']/parent::span/parent::th/following-sibling::td//select/option")
	public WebElement dropdownpoline;
	
		@PageTable(row = Table.class)
		@FindBy(xpath = "//table[contains(@id,'pb_components2')]/tbody/tr")
		public List<Table> table;
		
		@PageRow(byColumn = true)
		public static class Table {

		@BooleanType()
		@FindBy(xpath = ".//td[1]/input[1]")
		public WebElement selected;
		
		@TextType()
		@FindBy(xpath = ".//td[7]/span/input[contains(@name,'issueQty__c')]")
		public WebElement issueqty;
		}
			
		public void selectdropdown(String Item) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(By.xpath("//select/option[@value='" + Item + "']"));
//				By.xpath("//select/option[contains(text(),'" + Item + "')]"));
				
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }

	}
	
}
