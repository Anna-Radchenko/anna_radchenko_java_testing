package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 30.03.2017.
 */
public class GmailPage {
    @FindBy(id = "Email")
    private WebElement EmailField;

    @FindBy(name = "signIn")
    private WebElement SignInButton;

    @FindBy(id = "Passwd")
    private WebElement PasswordField;

    public WebElement getEmailField() {
        return EmailField;
    }

    public WebElement getSignInButton() {
        return SignInButton;
    }

    public WebElement getPasswordField() {
        return PasswordField;
    }

    public GmailPage() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.GmailPage.class);
    }
}


