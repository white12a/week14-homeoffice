package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
//nextStepButton, selectJobtypeList locators and create methods

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue4;

    public void clickOnContinue4() {
        clickOnElement(Continue4);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']/div/label")
    List<WebElement> planningToWorkTypes;
    public void selectPlanningToWorkTypes(String workType){
        for(WebElement work:planningToWorkTypes){
            if(work.getText().equalsIgnoreCase(workType)){
                clickOnElement(work);
            }
        }
    }
}
