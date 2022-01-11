import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/SDA curs/Selenium/chromedriver.exe"); // set the path of chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        Thread.sleep(3000);
        autocomplete.sendKeys("1555 park Blvd, Palo Alto, CA");
        driver.quit();
    }
}
