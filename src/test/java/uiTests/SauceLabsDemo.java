package uiTests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsDemo {

    //2068d1ad-b614-45b5-b69a-3f4ab5ed6fbb
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("macOS 13");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "Digital Nomads Tests");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-amanzadr-ff2ca:2068d1ad-b614-45b5-b69a-3f4ab5ed6fbb@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.get("https://www.apple.com/");

        Thread.sleep(7000);

    }
}
