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
        input.sendKeys("Go");

        input = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        input.click();
        input.sendKeys("Go2");

        input = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        input.click();
        input.sendKeys("Go3@gmail.com");

        input = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
        input.click();
        input.sendKeys("3809677777777");

        input = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        input.click();
        input.sendKeys("38123");

        input = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        input.click();
        input.sendKeys("38123");

        input = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        input.click();
        input.submit();


    }
}
