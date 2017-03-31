package com.epam;

/**
 * Created by 1 on 25.03.2017.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSigletone {

    private static WebDriver driver;

    private WebDriverSigletone() {
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("https://accounts.google.com");
        }
        return driver;
    }
}