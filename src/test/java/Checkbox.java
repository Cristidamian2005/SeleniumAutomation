import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:/SDA curs/Selenium/chromedriver.exe"); // set the path of chromedriver
    WebDriver driverChrome = new ChromeDriver(); //am creat un nou obiect din clasa ChromeDriver
    driverChrome.get ("https://formy-project.herokuapp.com/checkbox"); // deschidem siteul accesand metoda driverChrome.get
    Thread.sleep(3000);
    driverChrome.findElement(By.id( "checkbox-1")).click(); //am cautat in site cu inspect si am aflat id-ul checkboxului 1 pe care l-am gasit; cu metoda click am selectat checkboxul 1
    Thread.sleep(3000);
    WebElement checkbox2 = driverChrome.findElement(By.id( "checkbox-2")); //am identificat elementul si l-am salvat in variabila checkbox2
    checkbox2.click();
    Thread.sleep(3000);
    driverChrome.findElement(By.id("checkbox-3")).click();
    Thread.sleep(3000);
    driverChrome.quit();






    }
}
