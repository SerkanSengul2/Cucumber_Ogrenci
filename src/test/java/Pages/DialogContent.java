package Pages;

import Utilities.GWD;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement usuername;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement LoginButton;

    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;


    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement Addbutton;
    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'name')]//input")
    public WebElement NameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement CodeInput;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement SaveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement SuccessMessage;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname,'shortName')]//input")
    public WebElement ShortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement Already_Exists;

    @FindBy(xpath = "//div[contains(text(),'Citizenship successfully deleted')]")
    public WebElement SuccesfullyDeleted;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement Delete;

    @FindBy(css = "[data-placeholder='Name']")
    public WebElement SearchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement DeleteButton;
    @FindBy(xpath = "(//*[@fxlayoutalign='center center'])[3]/*")
    public WebElement SearchButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement IntegrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement PriorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement ToggleBar;

    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    public WebElement AcademicPeriod;
    @FindBy(xpath = "(//*[@aria-autocomplete='none'])[2]")
    public WebElement GradeLevel;

    @FindBy(xpath = "(//*[@role='option'])[4]")
    public WebElement GradeLevelSelect;

    @FindBy(css = "[caption='GENERAL.BUTTON.SAVE']")
    public WebElement SaveBuTTon;

    @FindBy(xpath = "(//*[@aria-autocomplete='none'])[1]")
    public WebElement gradeLevel2;

    @FindBy(xpath = "//mat-select//span[text()='Test 2024']")
    public WebElement searchAcademicPeriod;


    @FindBy(xpath = "//mat-option/span")
    public WebElement academicPeriod1;
    @FindBy(xpath ="//tbody[@role='rowgroup']//tr//td[2]")
    public List<WebElement> nameList;

    public void DeleteItem(String searchText) {
        MysendKeys(SearchBox, searchText);
        Myclick(SearchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        Myclick(Delete);
        Myclick(DeleteButton);

    }

    public WebElement ElementGet(String element) {
        switch (element) {
            case "Addbutton": return Addbutton;
            case "SaveButton": return SaveButton;
            case "NameInput": return NameInput;
            case "CodeInput": return CodeInput;
            case "IntegrationCode": return IntegrationCode;
            case "PriorityCode": return PriorityCode;
            case "ToggleBar": return ToggleBar;
            case "AcademicPeriod": return AcademicPeriod;
            case "GradeLevel": return GradeLevel;
            case "GradeLevelSelect": return GradeLevelSelect;
            case "SaveBuTTon": return SaveBuTTon;
            case "gradeLevel2": return gradeLevel2;
            case "searchAcademicPeriod": return searchAcademicPeriod;
            case "academicPeriod1": return academicPeriod1;


        }

        return null;
    }


}


