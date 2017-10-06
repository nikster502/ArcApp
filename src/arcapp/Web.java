/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author nik
 */
public class Web {
     private WebDriver webDriver;
    private WebDriverWait webDriverWait;


    public void start(){
        webDriver = new OperaDriver();
        webDriverWait = new WebDriverWait(webDriver, 10);
    }
   
    public void testWeb(){
        webDriver.get("http:/google.com");
        webDriver.findElement(By.name("q")).sendKeys("webdriver");
        webDriver.findElement(By.name("bthG")).click();
        webDriverWait.until(titleIs("webdriver - Поиск в Google"));

    }

    public void stop(){
        webDriver.quit();
        webDriver = null;
    }
public static void main(String[]args){
    Web web = new Web();
    web.start();
    web.testWeb();
    web.stop();
}
}
