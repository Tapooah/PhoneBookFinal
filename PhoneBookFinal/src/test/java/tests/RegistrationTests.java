package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @BeforeMethod
public void preCondition(){
    if (app.getHelperUser().isLogged()){
        app.getHelperUser().logout();
    }
}
    @Test
    public void successRegistration() {
        int i =(int)(System.currentTimeMillis()/1000)%3600;
        // 3) open form
        app.getHelperUser().openLoginRegistrationForm();

        // 4) fill open
        app.getHelperUser().fillLoginRegistrationForm("noa"+i+"@gmail.com", "Nnoa12345$");

        // 5) submit registration
        app.getHelperUser().submitRegistration();
        // 6) Assert(check is login success)

    }


}
