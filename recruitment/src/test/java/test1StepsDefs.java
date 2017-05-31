import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class test1StepsDefs {
    private WebDriver Driver;

    @Given("I am on the main page")
    public  mainPage navigateToFirstPage() {
        mainPage page1 = new mainPage(Driver);
        return page1.goToMainPage();
    }

    @Given("I am on the football page")
    public footballPage navigateToFootballPage(){
        mainPage page2 = new mainPage(Driver);
        return page2.navigateToFootballPage();
    }
}
