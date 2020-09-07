package formatsonrasi2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Format {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/SAM/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }
}
