package com.github.de9d.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.ID, using="email")
    private WebElement email;

    @FindBy(how = How.ID, using="password")
    private WebElement password;

    @FindBy(how = How.XPATH, using="//button[@class='btn btn-primary']")
    private WebElement login;

    @FindBy(how = How.XPATH, using="//a[@class='btn btn-default']")
    private WebElement iForgotMy;

    @FindBy(how = How.XPATH, using="//label[text()[normalize-space()='Keep me logged in on this computer']]")
    private WebElement keepMeLogged;

    @FindBy(how = How.XPATH, using="//p[text()[normalize-space()='Please enter your email address " +
            "and password below to login to your Gurock Software account. " +
            "After logging in you are able to access your licensed software or view your subscriptions.']]")
    private WebElement pleaseEnterYour;

    @FindBy(how = How.TAG_NAME, using="h1") private WebElement loginHeader;
}
