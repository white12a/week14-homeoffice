package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//nationalityDropDownList, nextStepButton locators and create
//        methods 'void selectNationality(String nationality)'
public class SelectNationalityPage extends Utility {
    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy (xpath = "//button[contains(text(),'Continue')]")
    WebElement contine;




    public void selectNationality(String nationality){
        selectByValueFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickOnContinueBtutton(){
        clickOnElement(contine);
    }
}
