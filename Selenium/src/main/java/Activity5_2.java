import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_2 {

    public static void main(String args[]){
        //Create a Package with a Class and a main() method
        //Create a WebDriver instance, named driver, with the FirefoxDriver().
        //Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method.
        //Get the page title and print it to the console.
        //Use findElement() to find the checkbox input element.
        //Use the isSelected() method to check if the checkbox is selected.
        //Click the checkbox to select it.
        //Use the isSelected() method again and print the result.

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        System.out.println(driver.getTitle());
        System.out.println("Checkbox is selected?--"+driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).isSelected());
        driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
        System.out.println("Checkbox is selected?--"+driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).isSelected());

        driver.close();


    }
}
