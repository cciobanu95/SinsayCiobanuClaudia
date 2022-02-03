import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebForm extends PageObject{
    private final String EMAIL = "ceva_de_test55@yahoo.com";
    private final String FIRST_NAME ="CINEVA";
    private final String LAST_NAME = "CEVA";
    private final String PASSWORD = "Password12";
    private final String PRODUCT = "geaca";

    @FindBy(id ="email_id")
    private WebElement email;

    @FindBy (id = "firstname_id")
    private WebElement firstname;

    @FindBy (id = "lastname_id")
    private WebElement lastname;

    @FindBy (id = "password_id")
    private WebElement  password;

    @FindBy(xpath = "//button[contains(@class,'primary__PrimaryButtonComponent-sc-1pct4vx-0 fDECVK')]")
    private WebElement CreeazaCont;

    //@FindBy(xpath = "//*[@id='headerWrapper']/action-btn__SearchWrapper-zbpc1m-4 kaRzFR/div[3]/div[1]/div/div/input")

    @FindBy (xpath = "//input[@name='search' or contains(@placeholder,'Caută Produs')]" )
    private WebElement Search;

    @FindBy (xpath = "//input[@name='search' or contains(@placeholder,'Caută Produs')]" )
    private WebElement Produs;



    public WebForm(WebDriver driver){
        super(driver);
    }

    public void enterEmail(){
        this.email.sendKeys(EMAIL);
    }

    public void enterFirstName(){
        this.firstname.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.lastname.sendKeys(LAST_NAME);
    }

    public void pressPassword() {this.password.sendKeys(PASSWORD);}

    public void pressCreeaza() {this.CreeazaCont.click();}

    public void searchProdus () {
        this.Search.click();
        this.Produs.sendKeys(PRODUCT);}


}

