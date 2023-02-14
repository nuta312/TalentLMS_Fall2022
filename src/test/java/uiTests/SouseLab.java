package uiTests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SouseLab {
    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<Digital Nomad Tests");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-turgen1-90f55:6a032d72-2ecb-43a0-b8d4-1c03b834e2d6@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.get("https://nambafood.kg/");

    }
}
