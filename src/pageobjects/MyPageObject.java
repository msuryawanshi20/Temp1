package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="My Page Object"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSFAdmin"
     )             
public class MyPageObject {
	
	
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Search apps and items...']")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales Order Header']")
	public WebElement SalesOrderHeader;

public WebDriver driver;

	public MyPageObject(WebDriver driver) {

		this.driver = driver;
	}

		public void dropdown(String Item) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//select/option[contains(text(),'" + Item + "')]"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }

	}

		@LinkType()
		@FindBy(xpath = "//th[text()='Line']/following::tr//td/following::th//a")
		public WebElement LineNAME;
		@LinkType()
		@FindBy(xpath = "//th[text()='SOORDDMD Name']/following::tr//td/following::th//a")
		public WebElement SOORDDMDNAME;
		
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Rootstock Site Map']")
		public WebElement rootstockSiteMap;
		@ButtonType()
		@FindBy(xpath = "//input[@name='new']")
		public WebElement New;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='SYDEFAULT']")
		public WebElement Name;
		
			
}
