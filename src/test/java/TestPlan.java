import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class TestPlan extends BaseTest {

    @Test
    public void CreeazaCont() {
        WebForm webForm = new WebForm(driver);
        webForm.enterEmail();
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.pressPassword();
        webForm.pressCreeaza();
        webForm.scrollByPixel(5, 5);

    }

    @Test
    public void SearchProduse() {
        WebForm webForm = new WebForm(driver);
        webForm.searchProdus();
        //webForm.scrollByPixel(100,100);


    }


    @Test
    public void ClickProdus() {
        WebForm webForm = new WebForm(driver);
        webForm.searchProdus();
        webForm.clickProdus();

    }


}



