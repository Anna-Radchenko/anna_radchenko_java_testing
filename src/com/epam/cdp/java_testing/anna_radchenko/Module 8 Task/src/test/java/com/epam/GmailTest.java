package com.epam;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by 1 on 12.03.2017.
 */
public class GmailTest {
    String account1 = "anyatest08@gmail.com";
    String password = "17111994a";
    String account2 = "anyatest09@gmail.com";
    String subject = "Test";
    String body = "This is my test email.";

    @Test
    public void testSignIn() throws Exception {
        GmailPage gmailPage = new GmailPage();
        gmailPage.getEmailField().sendKeys(account1);
        gmailPage.getSignInButton().click();
        gmailPage.getPasswordField().sendKeys(password);
        gmailPage.getSignInButton().click();
        HomePage homePage = new HomePage();
        homePage.getGmailButton().click();
    }

    @Test
    public void sendEmail() throws Exception {
        MailPage mailPage = new MailPage();
        mailPage.getWriteButton().click();
        WriteEmail writeEmail = new WriteEmail();
        writeEmail.getNameField().sendKeys(account2);
        writeEmail.getSubjectField().sendKeys(subject);
        writeEmail.getBodyField.sendKeys(body);
        writeEmail.getSendButton.click();
    }

    @Test
    public void signOut() throws Exception {
        MailPage mailPage = new HomePage();
        mailPage.getAccountButton.click();
        AccountPopUp accountPopUp = new AccountPopUp();
        accountPopUp.getLogOutButton.click();
    }

    @Test
    public void testSignIn2() throws Exception {
        AccountsScreen accountsScreen = new AccountsScreen();
        accountsScreen.getChooseAccountButton.click();
        accountsScreen.getAddAccountButton.click();
        GmailPage gmailPage = new GmailPage();
        gmailPage.getEmailField().sendKeys(account2);
        gmailPage.getSignInButton().click();
        gmailPage.getPasswordField().sendKeys(password);
        gmailPage.getSignInButton().click();
    }

    @Test
    public void addSpam() throws Exception {
        MailPage mailPage = new MailPage();
        mailPage.getLetter().click();
        Letter letter = new Letter ();
        letter.getSpamButton().click();
        letter.getConfirmButton().click();
    }

    @Test
    public void signOut2() throws Exception {
        MailPage mailPage = new HomePage();
        mailPage.getAccountButton.click();
        AccountPopUp accountPopUp = new AccountPopUp();
        accountPopUp.getLogOutButton.click();
    }

    @Test
    public void testSignIn3() throws Exception {
        AccountsScreen accountsScreen = new AccountsScreen();
        accountsScreen.getChooseAccountButton.click();
        accountsScreen.getAddAccountButton.click();
        GmailPage gmailPage = new GmailPage();
        gmailPage.getEmailField().sendKeys(account1);
        gmailPage.getSignInButton().click();
        gmailPage.getPasswordField().sendKeys(password);
        gmailPage.getSignInButton().click();
    }

    @Test
    public void sendEmail2() throws Exception {
        MailPage mailPage = new MailPage();
        mailPage.getWriteButton().click();
        WriteEmail writeEmail = new WriteEmail();
        writeEmail.getNameField().sendKeys(account2);
        writeEmail.getSubjectField().sendKeys(subject);
        writeEmail.getBodyField.sendKeys(body);
        writeEmail.getSendButton.click();
    }

    @Test
    public void signOut3() throws Exception {
        MailPage mailPage = new HomePage();
        mailPage.getAccountButton.click();
        AccountPopUp accountPopUp = new AccountPopUp();
        accountPopUp.getLogOutButton.click();
    }

    @Test
    public void testSignIn4() throws Exception {
        AccountsScreen accountsScreen = new AccountsScreen();
        accountsScreen.getChooseAccountButton.click();
        accountsScreen.getAddAccountButton.click();
        GmailPage gmailPage = new GmailPage();
        gmailPage.getEmailField().sendKeys(account1);
        gmailPage.getSignInButton().click();
        gmailPage.getPasswordField().sendKeys(password);
        gmailPage.getSignInButton().click();
    }

    @Test
    public void testVerifySpam() throws Exception {
        MailPage mailPage = new MailPage();
        mailPage.getMoreButoon().click();
        More more = new More();
        more.getSpamFolder().click();
        String text = driver.findElement(By.xpath("//div[@class='yP']")).getText();
        Assert.assertEquals("Test", text.contains("Test"));
    }

    @Test
    public void signOut4() throws Exception {
        MailPage mailPage = new HomePage();
        mailPage.getAccountButton.click();
        AccountPopUp accountPopUp = new AccountPopUp();
        accountPopUp.getLogOutButton.click();
    }

    @AfterMethod
        public void Quit() throws Exception {
        driver.quit();
    }
}


