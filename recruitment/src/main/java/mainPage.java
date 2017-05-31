import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// a class describing the main page from where you can navigate to all possible sports
public class mainPage {
    public WebDriver Driver;

    public mainPage (WebDriver Driver){
        this.Driver = Driver;
    }

    public mainPage goToMainPage(){
        Driver.get("http://sports.williamhill.com/betting/en-gb");
        return this;
    }

    public footballPage navigateToFootballPage(){
        Driver.findElement(By.id("nav-football")).click();
        return new footballPage(Driver);
    }
}
