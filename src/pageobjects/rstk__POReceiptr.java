package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ PO Receiptr"                                
               , summary=""
               , page="Poreceiptr"
               , namespacePrefix="rstk"
               , object="rstk__porcpt_ui__c"
               , connection="QARSFAdmin"
     )             
public class rstk__POReceiptr {

	public WebDriver driver;

	public rstk__POReceiptr(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@TextType()
	@FindBy(xpath = "//input[@id='porcptr_hdrordno__c_autocomplete']")
	public WebElement porcptrponum;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement ponumlist;
	
			public void selectdropdown(String Item) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//select/option[contains(@value,'" + Item + "')]"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }

	}

			@BooleanType()
			@FindBy(xpath = "//label[normalize-space(.)='RTV']/parent::span/parent::th/following-sibling::td//input")
			public WebElement rTV;

			@PageRow()
			public static class Table {

				@BooleanType()
				@FindBy(xpath = "//td[1]/input")
				public WebElement selected;
				@TextType()
				@FindBy(xpath = "//td[5]/input")
				public WebElement reverseQty;
			}

			@FindBy(xpath = "//table[contains(@id,'pg:fm:pb_locs:pbs_locs')]")
			@PageTable(firstRowContainsHeaders = false, row = Table.class)
			public List<Table> table;
			@ButtonType()
			@FindBy(xpath = "//div/span/span/span/input")
			public WebElement performReceiptReversal;
	
	
}
