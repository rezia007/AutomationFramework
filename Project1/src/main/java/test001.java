import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test001 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Maven_Downloads\\Chrome83\\chromedriver.exe");
        WebDriver obj= new ChromeDriver();
        obj.get("https://www.google.com");
    }
}
