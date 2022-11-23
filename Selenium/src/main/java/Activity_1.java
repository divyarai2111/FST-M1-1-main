import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {

    //Create a Class with a main() method
    //Create a WebDriver instance, named driver, with the FirefoxDriver().
    //Open a browser with https://www.training-support.net
    //Close the browser with driver.close()
    public static void main(String args[]) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.training-support.net");
        driver.quit();
    }
}
