import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_1 {

    public static void main(String args[]) throws InterruptedException {

        //Create a Package with a Class and a main() method
        //Create a WebDriver instance, named driver, with the FirefoxDriver().
        //Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
        //Get the page title and print it to the console.
        //Use findElement() to find the checkbox input element.
        //Use the isDisplayed() method to check if it is visible on the page.
        //Click the "Remove Checkbox".
        //Print the result of the isDisplayed() method again.

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        System.out.println(driver.getTitle());
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Chekbox???---"+checkbox.isDisplayed());


        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        Thread.sleep(3000);
        System.out.println("Chekbox???---"+checkbox.isDisplayed());

        driver.close();

    }
}
