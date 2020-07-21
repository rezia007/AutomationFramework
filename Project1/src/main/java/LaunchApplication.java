import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Maven_Downloads\\Chrome83\\chromedriver.exe");
        WebDriver Driver=new ChromeDriver();
        System.out.println("Chrome Drive has been Initiated");
        Driver.get("http:\\www.google.com");
        System.out.println(Driver.getCurrentUrl());
        System.out.println(Driver.getTitle());
        System.out.println(Driver.getPageSource());
        Driver.close();
    }
}
