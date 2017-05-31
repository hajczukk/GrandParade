import org.openqa.selenium.WebDriver;

//I created a class for football page only, but I guess many elements would be reusable so, for example, for the betting window, it is worth to have a separate pageObject
public class footballPage {
    WebDriver Driver;

    public footballPage (WebDriver Driver){
        this.Driver = Driver;
    }

}
