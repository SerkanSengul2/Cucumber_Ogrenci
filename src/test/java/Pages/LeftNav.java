package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement Setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement Parameters;
    @FindBy(css = "[href='/countries/list']")
    public WebElement Countries;

    @FindBy(css = "[href='/citizenships/list']")
    public WebElement Citizenship;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement Nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement Fees;

    @FindBy(xpath = ("(//span[text()='Entrance Exams'])[1]"))
    public WebElement EntaranceExam;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public  WebElement ExamSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement ExamButton;
    @FindBy(xpath="(//*[text()='States'])[1]")
    private WebElement states;

    public WebElement GetWebelement(String element) {
        switch (element) {
            case "Setup": return Setup;
            case "Parameters": return Parameters;
            case "Countries": return Countries;
            case "Citizenship": return Citizenship;
            case "Nationalities": return Nationalities;
            case "Fees": return Fees;
            case "EntaranceExam": return EntaranceExam;
            case "ExamSetup": return ExamSetup;
            case "ExamButton": return ExamButton;
            case "states":return states;
        }
        return null;
    }

}
