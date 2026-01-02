package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//https://demoblaze.com/
//Total no. of links
//Total no. of images
//Click on Any product link using linktext/partiallinktext

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total no. of links on the page are: "+ links.size());

        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total no. of images on the page are: "+ images.size());

        Thread.sleep(3000);
        driver.findElement(By.linkText("Samsung galaxy s6")).click();


    }
}
