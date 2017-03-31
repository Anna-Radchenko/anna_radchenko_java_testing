package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 31.03.2017.
 */
public class HomePage {
    @FindBy(xpath = "//a[@class='WaidBe']")
    private WebElement GmailButton;

    public WebElement getGmailButton(){
        return GmailButton;
    }

    public HomePage() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.HomePage.class);
    }
}