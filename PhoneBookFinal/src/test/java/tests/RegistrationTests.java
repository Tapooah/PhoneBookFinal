package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void successLogin() {
        // 3) open form
        app.getHelperUser().openLoginRegistrationForm();

        // 4) fill open
        app.getHelperUser().fillLoginRegistrationForm("noa033@gmail.com", "Nnoa12345$");

        // 5) submit registration
        app.getHelperUser().submitRegistration();
        // 6) Assert(check is login success)

    }
}
