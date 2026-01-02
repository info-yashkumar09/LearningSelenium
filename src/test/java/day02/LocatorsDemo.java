package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
//        driver.get("https://www.flipkart.com/");

        driver.findElement(By.id("user-name")).sendKeys("error_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

//        driver.findElement(By.linkText("Sauce Labs Backpack")).click();

//        WebElement a = driver.findElement(By.tagName("k"));
//        List<WebElement> imgLinks = driver.findElements(By.tagName("g"));
//        System.out.println(imgLinks);

//        for(WebElement image : imgLinks){
//            String imgSource = image.getAttribute("a");
//            if(imgSource != null && !imgSource.isEmpty()){
//                System.out.println("Image src: " + imgSource);
//            }
//        }


//        List<WebElement> headerLinks = driver.findElements(By.className("dFnvU1"));
//        System.out.println("Total Links in header: " + headerLinks.size());

//        driver.quit();


    }
}
