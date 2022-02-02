import org.junit.Test;

public class TestPlan extends BaseTest {

    @Test
    public void CreeazaCont(){
        WebForm webForm = new WebForm(driver);
        webForm.enterEmail();
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.pressPassword();
       // webForm.pressCreeazaCont();

    }
}


