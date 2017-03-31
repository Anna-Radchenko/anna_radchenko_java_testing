package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 30.03.2017.
 */

public class AccountsScreen {
    @FindBy(id = "account-chooser-link")
    private WebElement ChooseAccountButton;

    @FindBy(id = "account-chooser-add-account")
    private WebElement AddAccountButton;

    public WebElement ChooseAccountButton() {
        return ChooseAccountButton;
    }

    public WebElement AddAccountButton() {
        return AddAccountButton;
    }

    public AccountsScreen() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.AccountsScreen.class);
    }
}