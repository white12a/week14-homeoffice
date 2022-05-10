package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//nextStepButton, yes, no locators and create methods 'void
//        selectImmigrationStatus(String status)'
public class FamilyImmigrationStatusPage extends Utility {
   public FamilyImmigrationStatusPage(){
       PageFactory.initElements(driver,this);
   }

   @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement yes;

    @FindBy(xpath = "//label[normalize-space()='No']")
    WebElement no;


    public void selectImmigrationStatus(String status){
       switch (status){
           case "Yes":
               clickOnElement(yes);
           break;

           case "No":
               clickOnElement(no);
               break;
           default:
               System.out.println("please select one of the option");
       }

    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue5;

   public void clickOnContinue5(){
       clickOnElement(Continue5);
   }
}
