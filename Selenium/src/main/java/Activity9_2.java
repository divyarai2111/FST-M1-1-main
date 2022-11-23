import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_2 {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Title--" + driver.getTitle());
        //Check if the HTML element is a multi-list. Proceed with other actions if it is.
        //Select the 'JavaScript' option by visible text.
        //Select the 'NodeJS' option by value.
        //Select the 4th, 5th, and the 6th options by index.
        //Deselect the 'NodeJS' option by value attribute.
        //Deselect the 7th option by index.
        //Print the first selected option.
        //Print all selected options one by one and deselect all options.

        WebElement chosen = driver.findElement(By.id("multi-value"));
        Select multiList = new Select(driver.findElement(By.id("multi-select")));

        if(multiList.isMultiple()){
            multiList.selectByVisibleText("Javascript");
            multiList.selectByValue("node");
            multiList.selectByIndex(4);
            multiList.selectByIndex(5);
            multiList.selectByIndex(6);
            multiList.deselectByValue("node");
            multiList.deselectByIndex(7);
            System.out.println("Before Deselecting");
            List<WebElement> selectedOp=multiList.getAllSelectedOptions();
            for(WebElement val:selectedOp){
                System.out.print(val.getText()+", ");
            }

            multiList.deselectAll();
            System.out.println("\nAfter Deselecting");

        }

        driver.close();
    }

}
