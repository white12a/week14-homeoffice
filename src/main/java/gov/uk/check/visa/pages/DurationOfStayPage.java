package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//- nextStepButton, lessThanSixMonths, moreThanSixMonths locators
//        and create method
public class DurationOfStayPage extends Utility {
    public DurationOfStayPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement moreThanSixMonth;
@FindBy(xpath = "//label[normalize-space()='6 months or less']")
WebElement lessThanSixMonth;
@FindBy(xpath = "//button[normalize-space()='Continue']")
WebElement Continue3;
@FindBy(xpath = "//div[@class='govuk-radios']")
    List<WebElement> common;

    public void selectDurationMoreThan6Month(){
        clickOnElement(moreThanSixMonth);
    }
    public void selectDurationLessThan6Month(){
        clickOnElement(lessThanSixMonth);
    }
    public void clickOnContinue3(){
        clickOnElement(Continue3);
    }

}
