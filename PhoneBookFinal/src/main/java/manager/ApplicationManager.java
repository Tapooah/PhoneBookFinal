package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;
    HelperUser helperUser;

    public void init() {
        // 1) open browser
        wd = new ChromeDriver();

        // 2) open link
        wd.navigate().to("https://telranedu.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        helperUser = new HelperUser(wd);
    }

    public void stop() {
        // 7) driver quit
        wd.quit();
    }



    ////////////////////////////////////// ˅ getter ˅ //////////////////////////////////////
    public HelperUser getHelperUser() {
        return helperUser;
    }
    ////////////////////////////////////// ˄ getter ˄ //////////////////////////////////////
}
