package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
   StartPage startPage;
   SelectNationalityPage selectNationalityPage;
   ReasonForTravelPage reasonForTravelPage;
   ResultPage resultPage;
DurationOfStayPage durationOfStayPage;
WorkTypePage workTypePage;
FamilyImmigrationStatusPage familyImmigrationStatusPage;

@BeforeMethod(alwaysRun = true)
public void inIt(){
    startPage = new StartPage();
    selectNationalityPage = new SelectNationalityPage();
    reasonForTravelPage = new ReasonForTravelPage();
    resultPage = new ResultPage();
durationOfStayPage = new DurationOfStayPage();
workTypePage = new WorkTypePage();
familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        }

@Test(groups = {"sanity","smoke","regression"})
public void anAustralianCominToUKForTourism(){
//    Click on start button
    startPage.clickOnStartNow();
//    Select a Nationality 'Australia'
    selectNationalityPage.selectNationality("australia");
//    Click on Continue button
    selectNationalityPage.clickOnContinueBtutton();
//    Select reason 'Tourism'
    reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
//    Click on Continue button
    reasonForTravelPage.clickOnContinue2();
//    verify result 'You will not need a visa to come to the UK
resultPage.confirmResultMessage("You will not need a visa to come to the UK");



}

@Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
//    Click on start button
    startPage.clickOnStartNow();
//    Select a Nationality 'Chile'
    selectNationalityPage.selectNationality("chile");
//    Click on Continue button
    selectNationalityPage.clickOnContinueBtutton();
//    Select reason 'Work, academic visit or business'
reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
//    Click on Continue button
    reasonForTravelPage.clickOnContinue2();
//    Select intendent to stay for 'longer than 6 months'
    durationOfStayPage.selectDurationMoreThan6Month();
//    Click on Continue button
    durationOfStayPage.clickOnContinue3();
//    Select have planning to work for 'Health and care professional'
  workTypePage.selectPlanningToWorkTypes("Health and care professional");
//    Click on Continue button
    Thread.sleep(2000);
    workTypePage.clickOnContinue4();
//    verify result 'You need a visa to work in health and care
resultPage.confirmResultMessage("You need a visa to work in health and care");
}

@Test(groups = "regression")
    public void ColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
//    Click on start button
    startPage.clickOnStartNow();
//    Select a Nationality 'Colombia'
    selectNationalityPage.selectNationality("colombia");
//    Click on Continue button
    selectNationalityPage.clickOnContinueBtutton();
//    Select reason 'Join partner or family for a long stay'
reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
//    Click on Continue button
    reasonForTravelPage.clickOnContinue2();
//    Select state My partner of family member have uk immigration status 'yes'
familyImmigrationStatusPage.selectImmigrationStatus("Yes");
//    Click on Continue button
    familyImmigrationStatusPage.clickOnContinue5();
//    verify result 'You’ll need a visa to join your family or partner in the UK
    resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
    }
        }