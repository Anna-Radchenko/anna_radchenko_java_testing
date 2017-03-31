package com.epam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by 1 on 31.03.2017.
 */
public class MailPage {
    @FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
    private WebElement WriteButton;

    @FindBy(xpath = "//span[@class='gb_9a gbii']")
    private WebElement AccountButton;

    @FindBy(xpath = "//div[@class='ae4 aDM']")
    private WebElement Letter;

    @FindBy(xpath = "//span[@class='CJ']")
    private WebElement MoreButton;

    public WebElement WriteButton() {
        return WriteButton;
    }

    public WebElement AccountButton() {
        return AccountButton;
    }

    public WebElement Letter() {
        return Letter;
    }

    public WebElement MoreButton() {
        return MoreButton;
    }

    public MailPage() {
        PageFactory.initElements(WebDriverSigletone.getWebDriverInstance(), PageFactory.MailPage.class);
    }
}
