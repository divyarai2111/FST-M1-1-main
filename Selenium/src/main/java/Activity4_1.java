import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {

    //Create a Class and a main() method
    //Create a WebDriver instance, named driver, with the FirefoxDriver().
    //Open a browser with https://www.training-support.net
    //Get the title of the page using driver.getTitle() and print out the title.
    //Use findElement() with xpath() to find and click the "About Us" link on the page.
    //Print the title of the new page that open when the link is clicked.

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.training-support.net");
        System.out.println("Title--"+driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
        System.out.println("Headingg--"+driver.getTitle());

        Thread.sleep(5000);
        driver.close();
    }
}
