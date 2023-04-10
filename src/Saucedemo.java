import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the Url into Browser
        driver.get(baseUrl);
        // Maximize the Browser
        driver.manage().window().maximize();
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Give Implicit wait to driver
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        // Enter the email in email field
        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("standard_user");
        //Enter the password in password field
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("secret_sauce");


    }
}
