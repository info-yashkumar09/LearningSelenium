package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
//        driver.get("https://www.amazon.in/");
        //XPath with single attribute
        //driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Apple");

        //XPath with multiple attribute
        //driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Laptop");

        //XPath with 'and' 'or' operators
        //driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("Tablet");

        //driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']")).sendKeys("Tablet");

        //XPath with inner text
        //driver.findElement(By.xpath("//*[text()=' Electronics ']")).click();

        //boolean test =  driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
        //System.out.println(test);

        //XPath with contains()
        //driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("apple");

        //XPath with starts-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("apple");

        //---------------------------------------------------------------------------------------------------

        //Handling Dynamic Attributes---------------------------------
        //Example of Start-Stop condition of StopWatch----------------

        //Approach 1 - By using 'OR' operator
        //---->    //*[@id='start' or @id='stop']

        //Approach 2 - By using contains()
        //---->   //*[contains(@id='st')]

        //Approach 3 - By using starts-with()
        //---->  //*[starts-with(@id='st')]


    }
}
