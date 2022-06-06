package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__ AP Batch Transfer"                                
               , summary=""
               , page="APBatchTransfer"
               , namespacePrefix="rstkf"
               , object="rstkf__apinvh__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__APBatchTransfer {

	public WebDriver driver;
	
		public rstkf__APBatchTransfer(WebDriver driver) {

		this.driver = driver;
		}

	@ButtonType()
	@FindBy(xpath = "//td/span/input")
	public WebElement search;
	@PageTable(row = Transferbatches.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_results']")
	public List<Transferbatches> transferbatches;

	@PageRow(byColumn = true)
	public static class Transferbatches {

		@BooleanType()
		@FindBy(xpath = "//tr[30]//input")
		public WebElement select;
	}
	
		public void selectpayses(String sessno) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(By.xpath("//a[contains(text(),'"+sessno+"')]/parent::td/parent::tr/td/input"));
//				By.xpath("//select/option[contains(text(),'" + Item + "')]"));
				
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }

	}

		@ButtonType()
		@FindBy(xpath = "//span//td/span/input")
		public WebElement postsession;
}
