import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{
    private final String EMAIL = "ceva_de_test90@yahoo.com";
    private final String FIRST_NAME ="CINEVA";
    private final String LAST_NAME = "CEVA";
    private final String PASSWORD = "Password12";


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




}

