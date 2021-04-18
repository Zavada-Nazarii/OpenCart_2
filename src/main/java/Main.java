import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\Папка Ведмедика\\Програми\\cromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/opencart/upload/");

        WebElement input = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        input.click();

        input = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        input.click();

        input = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        input.click();

    }
}
