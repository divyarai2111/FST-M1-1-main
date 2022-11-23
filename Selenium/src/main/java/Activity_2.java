import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_2{

    //Get the title of the page using driver.getTitle() and print out the title
    //Use findElement() with the following locators to find the "About Us" link:
    //id()
    //className()
    //linkText()
    //cssSelector()
    //Print the text in the WebElement using the getText() method.
    //Close the browser with driver.close()

    public static void main(String args[]) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.training-support.net");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        WebElement idlocator=driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idlocator.getText());

        WebElement classlocator=driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classlocator.getText());

        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());

        //Find the About Us link using linkText()
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());


        driver.quit();
    }
}
