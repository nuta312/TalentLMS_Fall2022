package com.talentLMS.UI.driverFactory;


import com.talentLMS.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

/**
 * @author Nursultan Musakunov
 */
public class Driver {

    private Driver() {
        // Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;

                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }


}
