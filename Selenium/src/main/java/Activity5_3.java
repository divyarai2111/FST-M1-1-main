import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_3 {

    public static void main(String args[]) throws InterruptedException {

        //Create a Package with a Class and a main() method
        //Create a WebDriver instance, named driver, with the FirefoxDriver().
        //Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
        //Get the page title and print it to the console.
        //Use findElement() to find the text field.
        //Use the isEnabled() method to check if the text field is enabled.
        //Click the "Enable Input" button to enable the input field.
        //Use the isEnabled() method again and print the result.

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        System.out.println("Text field is enabled?--"+driver.findElement(By.xpath("//*[@id=\"input-text\"]")).isEnabled());
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"toggleInput\"]")).click();
        Thread.sleep(5000);
        System.out.println("Text field is enabled?--"+driver.findElement(By.xpath("//*[@id=\"dynamicText\"]")).isEnabled());


        driver.close();

    }
}
