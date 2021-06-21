package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverIntiator {

	WebDriver webDriver = null;

	public WebDriver getWebDriver(DriverType type) throws MalformedURLException {
		switch (type) {
		case CHROME:
			ChromeOptions options = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ranjeet singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			options.addArguments("start-maximized");
			webDriver = new ChromeDriver(options);

			break;

		case FIREFOX:
			FirefoxOptions option = new FirefoxOptions();
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Ranjeet singh\\Downloads\\geckodriver-v0.29.0-win64(3)\\geckodriver.exe");
			option.addArguments("start-maximized");
			webDriver = new FirefoxDriver(option);

			break;

		default:
			ChromeOptions options1 = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ranjeet singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			options1.addArguments("start-maximized");
			webDriver = new ChromeDriver(options1);
			break;

		}

		return webDriver;

	}

}
