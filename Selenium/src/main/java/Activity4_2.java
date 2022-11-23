import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_2 {

    //Create a Class and a main() method
    //Create a WebDriver instance, named driver, with the FirefoxDriver().
    //Open a browser with https://www.training-support.net/selenium/simple-form
    //Get the title of the page using driver.getTitle() and print out the title.
    //Use findElement() with xpath() to find all the input fields on the page.
    //Fill in the details in the fields using the sendKeys() method.
    //Click the submit button at the end of the form to submit the form.
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        //print the title
        System.out.println("Title---"+driver.getTitle());

        //input field
        WebElement firstname=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[1]/input"));
        firstname.sendKeys("divya");
        WebElement lastname=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[2]/input"));
        lastname.sendKeys("raikar");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("divya.raikar@metlif.com");
        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9898989898");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

        driver.quit();

    }

}
