import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByPartialLinkText {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","D:\\Maven_Downloads\\Chrome83\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.airbnb.co.in/s/Goa/all");
            driver.findElement(By.partialLinkText("Pool & Jacuzzi")).click();
            driver.quit();   }
}


