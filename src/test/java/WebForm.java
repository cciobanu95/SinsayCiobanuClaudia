import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebForm extends PageObject{
    private String EMAIL = "@yahoo.com";
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

    @FindBy (xpath= "//button[text()='OK']" )
    private WebElement AcceptCookies;

    @FindBy (xpath= "//span[text()='Caracteristici']" )
    private WebElement caracteristici;

    @FindBy (xpath = "//div[@data-testid='products-results']/div[1]/div[1]/ul/li[1]")
   //*[@id="algoliaContainer"]/div/div/div[6]/div/div[1]/ul/li[1]/div
    private WebElement image;

    public WebForm(WebDriver driver){
        super(driver);
    }

    public void enterEmail(){
        AcceptCookies.click();
        EMAIL = ""+System.currentTimeMillis()+EMAIL;
        this.email.sendKeys(EMAIL);
    }

    public void enterFirstName(){
        this.firstname.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.lastname.sendKeys(LAST_NAME);
    }

    public void pressPassword() {this.password.sendKeys(PASSWORD);}

    public void scrollByPixel(Integer x, Integer y) {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(" + x + " , " + y + ")");
   }
    public void pressCreeaza() {this.CreeazaCont.click();
        }

    public void searchProdus () {
        AcceptCookies.click();
        this.Search.click();
        this.Produs.sendKeys(PRODUCT);
        this.caracteristici.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        //this.image.click();
    }


    public void clickProdus(){
      //this.Search.click();
      //this.Produs.sendKeys(PRODUCT);
       this.caracteristici.click();
       this.image.click();
    }


}

