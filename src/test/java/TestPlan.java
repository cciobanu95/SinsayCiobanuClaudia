import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class TestPlan extends BaseTest {

    @Test
    public void CreeazaCont(){
        WebForm webForm = new WebForm(driver);
        webForm.enterEmail();
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.pressPassword();
        webForm.pressCreeaza();

    }

    @Test
    public void SearchProduse (){
        WebForm webForm = new WebForm(driver);
        webForm.searchProdus();
    }




}


