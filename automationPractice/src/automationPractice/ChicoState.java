package automationPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.assertj.core.api.Assertions.assertThat;
public class ChicoState {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		
		//Open the CSU Chico Home Page
		driver.get("http://www.csuchico.edu");
		Thread.sleep(2000);
		String sPage1 = driver.getPageSource();
		String sText1 = "Class Schedule";
		asserThatrightPage(sPage1, sText1);
		
		// Navigate to the About page
		driver.navigate().to("http://www.csuchico.edu/about/index.shtml");
		Thread.sleep(2000);
		String sPage2 = driver.getPageSource();
		String sText2 = "2014 Green Honor Roll";
		asserThatrightPage(sPage2, sText2);
		
		// Navigate to the facts page
		driver.navigate().to("http://www.csuchico.edu/pa/chico-facts.shtml");
		Thread.sleep(2000);
		String sPage3 = driver.getPageSource();
		String sText3 = "Public Affairs and Publications";
		asserThatrightPage(sPage3, sText3);
		
		// Close Browser
		driver.quit();
	}
	
	// Verify that we successfully navigated
	public static void asserThatrightPage(String sPage, String sText) {
		assertThat(sPage.contains(sText));
		System.out.println("Text: "+sText+" found.");
  }
}
