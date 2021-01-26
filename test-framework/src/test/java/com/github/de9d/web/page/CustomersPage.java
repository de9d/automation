package com.github.de9d.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomersPage {
    @FindBy(how = How.TAG_NAME, using="h1")
    private WebElement youAreIn;

    @FindBy(how = How.CLASS_NAME, using="gk-footer-copyright-text")
    private WebElement gurockCopyright;

    @FindBy(how = How.XPATH, using="//img[@class='gk-footer-fine-print-logo']")
    private WebElement gurockLogoImage;

    @FindBy(how = How.XPATH, using="(//div[@class='col-sm-12 col-md-2'])[2]")
    private WebElement gurockLogo;

    @FindBy(how = How.XPATH, using="//div[@class='row gk-footer-fine-print-wrapper']")
    private WebElement gurock;

    @FindBy(how = How.XPATH, using="//img[@src='https://media.gurock.com/gk-media/logos/TR-customer-logos-ver2.png']")
    private WebElement empty;

    @FindBy(how = How.LINK_TEXT, using="Blog")
    private WebElement blog;

    @FindBy(how = How.LINK_TEXT, using="Community")
    private WebElement community;

    @FindBy(how = How.XPATH, using="//input[@id='q']")
    private WebElement searchTestRail;

    @FindBy(how = How.LINK_TEXT, using="My Account")
    private WebElement myAccount;

    @FindBy(how = How.XPATH, using="//i[@class='material-icons']")
    private WebElement search;

    @FindBy(how = How.XPATH, using="(//i[@class='material-icons'])[2]")
    private WebElement accountcircle;
}
