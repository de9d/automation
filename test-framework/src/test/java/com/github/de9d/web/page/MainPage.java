package com.github.de9d.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    @FindBy(how = How.LINK_TEXT, using="Community")
    private WebElement community;

    @FindBy(how = How.XPATH, using="//input[@id='q']")
    private WebElement searchTestRail;

    @FindBy(how = How.XPATH, using="//i[@class='material-icons']")
    private WebElement search;

    @FindBy(how = How.LINK_TEXT, using="My Account")
    private WebElement myAccount;

    @FindBy(how = How.XPATH, using="(//i[@class='material-icons'])[2]")
    private WebElement accountcircle;

    @FindBy(how = How.XPATH, using="//a[@class='gk-header-sticky-main-menu-link dropdown-toggle']")
    private WebElement product;

    @FindBy(how = How.XPATH, using="(//i[@class='material-icons'])[3]")
    private WebElement expandmore;

    @FindBy(how = How.LINK_TEXT, using="Pricing")
    private WebElement pricing;

    @FindBy(how = How.ID, using="Solutions-Menu-Button")
    private WebElement solutions;

    @FindBy(how = How.LINK_TEXT, using="Webinars")
    private WebElement webinars;

    @FindBy(how = How.LINK_TEXT, using="Support")
    private WebElement support;

    @FindBy(how = How.LINK_TEXT, using="Try TestRail")
    private WebElement tryTestRail;

    @FindBy(how = How.CLASS_NAME, using="gk-header-sticky-logo-wrapper")
    private WebElement testrailLogo;

    @FindBy(how = How.XPATH, using="//div[contains(@class,'et_pb_with_border et_pb_section')]")
    private WebElement testRailCo;
}
