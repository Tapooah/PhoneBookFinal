package tests;

import org.testng.annotations.Test;


public class LoginTests extends TestBase {

    // ///////////////////////////////////////////////////////////////////////////////////////// //
    // script for success login:
    // 1) open browser
    // 2) open link
    // 3) open form
    // 4) fill open
    // 5) submit login
    // 6) Assert(check is login success)
    // 7) driver quit
    // ///////////////////////////////////////////////////////////////////////////////////////// //

    // ///////////////////////////////////////////////////////////////////////////////////////// //
    // script for negative login:
    // 1) open browser
    // 2) open link
    // 3) open form
    // 4) fill open + invalid data
    // 5) submit login
    // 6) Assert(check is login unsuccessful), logout present? NOT
    // 7) driver quit
    // ///////////////////////////////////////////////////////////////////////////////////////// //


    //success(positive) login test:
    @Test
    public void successLogin() {
        // 3) open form
        openLoginRegistrationForm();

        // 4) fill open
        fillLoginRegistrationForm("noa033@gmail.com", "Nnoa12345$");

        // 5) submit login
        submitLogin();
        // 6) Assert(check is login success)

    }

    //unsuccessful(negative) login test:
    @Test
    public void loginNegativeTestWrongEmail() {
        // 3) open form
        openLoginRegistrationForm();
        // 4) fill open + invalid data
        fillLoginRegistrationForm("noagmail.com", "Nnoa12345$");
        // 5) submit login
        submitLogin();
        // 6) Assert(check is login unsuccessful), logout present? NOT

    }
}
