package adactin_Project_Aug;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass_august.BaseClass;
import com.helperfile.ConfigurationReader;
import com.helperfile.FileReadManager;
import com.pojoclass.LoginPage;
import com.pojoclass.SearchPage;
import com.pom.PageObjectManager;

public class AdactinHotelBooking extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver=browserName("EDGE");
		
		getUrl("https://adactinhotelapp.com/");
		PageObjectManager pom=new PageObjectManager(driver);
		
		inputText(pom.getLp().getUsername(), FileReadManager.getInstanceFRM().getInstanceCR().getUsername());
		inputText(pom.getLp().getPassword(), FileReadManager.getInstanceFRM().getInstanceCR().getPassword());
		clickButton(pom.getLp().getLogin());
		
		
		dropDown(pom.getSearch().getLocation(), "visibletext", "London");
		
		
		
		Thread.sleep(2000);
		
		//driver.close();
		close();
		
	}

}
