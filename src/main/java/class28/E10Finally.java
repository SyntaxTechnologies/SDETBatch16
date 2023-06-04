package class28;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E10Finally {

    public static void main(String[] args) {


        WebDriver webDriver = new ChromeDriver();
        try {
            webDriver.get("https://google.com");
            webDriver.findElement(By.xpath("dsfkjsdf"));
        } finally {
            webDriver.close();
        }


    }

}
