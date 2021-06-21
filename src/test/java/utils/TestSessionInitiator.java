package utils;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.qait.Actions.detailsPage;
import com.qait.Actions.logInPage;
import com.qait.Actions.loginPROVersion;
import com.qait.Actions.searchPage;

public class TestSessionInitiator {

	protected WebDriver driver;
	WebDriverIntiator wdriver = new WebDriverIntiator();

	public void initialize() throws MalformedURLException {
		driver = wdriver.getWebDriver(DriverType.CHROME);
		driver.get("https://www.imdb.com/");
	}

	/*
	 * public void launchApplication() { driver.get("https://www.imdb.com/"); }
	 */
	// create object of action classes
	public searchPage SearchPages;
	public detailsPage DetailsPages;
	public logInPage LoginPages;
	public loginPROVersion LoginPRO;

	public void initPage() {
		SearchPages = new searchPage(driver);
		DetailsPages = new detailsPage(driver);
		LoginPages = new logInPage(driver);
		LoginPRO = new loginPROVersion(driver);

	}

	public void waitForsync(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public TestSessionInitiator() throws MalformedURLException {

		initialize();
		initPage();
	}

}
