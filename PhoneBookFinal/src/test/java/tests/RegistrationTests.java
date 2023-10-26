package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void successLogin() {
        // 3) open form
        openLoginRegistrationForm();

        // 4) fill open
        fillLoginRegistrationForm("noa033@gmail.com", "Nnoa12345$");

        // 5) submit registration
        submitRegistration();
        // 6) Assert(check is login success)

    }
}
