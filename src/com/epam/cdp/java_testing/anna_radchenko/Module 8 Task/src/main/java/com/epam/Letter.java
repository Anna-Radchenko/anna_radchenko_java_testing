package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 30.03.2017.
 */
public class Letter {
    @FindBy(xpath = "//*[@id=':5']/div[2]/div[1]/div/div[2]/div[2]")
    private WebElement SpamButton;

    @FindBy(name = "rs")
    private WebElement ConfirmButton;

    public WebElement SpamButton() {
        return SpamButton;
    }

    public WebElement ConfirmButton() {
        return ConfirmButton;
    }

    public Letter() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.Letter.class);
    }
}
