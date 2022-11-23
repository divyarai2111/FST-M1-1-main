import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_1 {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Title--"+driver.getTitle());

        //Use findElement() to find the dropdown WebElement on the page.
        //Create a new Select class object with the WebElement.
        //On the dropdown,
        //Select the second option using selectByVisibleText()
        //Select the third option using selectByIndex()
        //Select the fourth option using selectByValue()
        //Finally, get all the options in the dropdown and print them one by one.

        WebElement option=driver.findElement(By.id("single-select"));
        Select option2= new Select(driver.findElement(By.id("single-select")));
        option2.selectByVisibleText("Option 2");
        option2.selectByIndex(3);
        option2.selectByValue("4");

        List<WebElement> options=option2.getOptions();
        for(WebElement val:options){
            System.out.print(val.getText()+"---");
        }


        driver.close();
    }
}
