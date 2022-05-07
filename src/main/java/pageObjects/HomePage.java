package pageObjects;

import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonFunctions {
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="search_query")
    public WebElement searchtxtfield;

    @FindBy(name = "submit_search")
    public WebElement searchBtn;

    @FindBy(xpath = "//img[@title=\"Printed Dress\"]")
    public WebElement printedDress;


    public void enterSearchTerm(String searchTerm)
    {
        searchtxtfield.sendKeys(searchTerm);
    }

    public void clickSearchButton()
    {
        searchBtn.click();
    }

    public void clickOnImg()
    {
        printedDress.click();
    }
}
