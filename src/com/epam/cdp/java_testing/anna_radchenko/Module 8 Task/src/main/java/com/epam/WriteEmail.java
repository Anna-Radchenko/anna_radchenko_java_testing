package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 31.03.2017.
 */
public class WriteEmail {
    @FindBy(name = "to")
    private WebElement NameField;

    @FindBy(name = "subjectbox")
    private WebElement SubjectField;

    @FindBy(xpath = "//div[@class='Am Al editable LW-avf']")
    private WebElement BodyField;

    @FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
    private WebElement SendButton;

    public WebElement NameField() {
        return NameField;
    }

    public WebElement SubjectField() {
        return SubjectField;
    }

    public WebElement BodyField() {
        return BodyField;
    }

    public WebElement SendButton() {
        return SendButton;
    }

    public WriteEmail() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.WriteEmail.class);
    }
}
