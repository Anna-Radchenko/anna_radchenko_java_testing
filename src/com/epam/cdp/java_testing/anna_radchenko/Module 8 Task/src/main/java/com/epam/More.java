package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 31.03.2017.
 */

public class More {
    @FindBy(xpath = "//span[@class='nU n1']")
    private WebElement SpamFolder;

    public WebElement SpamFolder() {
        return SpamFolder;
    }

    public More() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.More.class);
    }
}