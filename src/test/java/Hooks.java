import functionLibrary.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

public class Hooks extends CommonFunctions {
    @Before
    public void beforeTest()
    {
        openHomePage();

    }

    @After
    public void afterTest()
    {
        closeBrowser();
    }
}
