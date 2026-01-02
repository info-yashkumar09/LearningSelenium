package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");
        driver.findElement(By.cssSelector("button.search-box-button")).click();

        String pageTitle = driver.getTitle();
        if(pageTitle.equals("Just a moment...")){
            Thread.sleep(7000);
            driver.findElement(By.tagName("input")).click();
        }


    }
}
