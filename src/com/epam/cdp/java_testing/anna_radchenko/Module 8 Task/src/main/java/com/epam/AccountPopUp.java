package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 30.03.2017.
 */
    public class AccountPopUp {
        @FindBy(xpath = "//a[@class='gb_Ha gb_6e gb_df gb_yb']")
        private WebElement LogOutButton;

        public WebElement LogOutButton() {
            return LogOutButton;
        }
    public AccountPopUp() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.AccountPopUp.class);
    }
}

