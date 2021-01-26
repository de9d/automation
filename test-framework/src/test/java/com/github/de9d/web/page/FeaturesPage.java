package com.github.de9d.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FeaturesPage {
    @FindBy(how = How.XPATH, using="//input[@id='q']")
    private WebElement searchTestRail;

    @FindBy(how = How.XPATH, using="(//img[@src='https://media.gurock.com/gk-media/graphics/take-the-tour.svg'])[2]")
    private WebElement assignment;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='Test Case Management']]")
    private WebElement testCaseManagement;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='Track Test Results']]")
    private WebElement trackTestResults;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='Reporting & Metrics']]")
    private WebElement reportingMetrics;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='Seamless Integration']]")
    private WebElement seamlessIntegration;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='Team & Productivity']]")
    private WebElement teamProductivity;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='Customizable & Scalable']]")
    private WebElement customizableScalable;

    @FindBy(how = How.XPATH, using="//div[text()[normalize-space()='TestRail Enterprise']]")
    private WebElement testRailEnterprise;

    @FindBy(how = How.TAG_NAME, using="h1")
    private WebElement comprehensiveTestCase;
}
