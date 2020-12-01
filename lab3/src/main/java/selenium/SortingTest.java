package selenium;// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SortingTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/nbiryulin/Downloads/geckodriver");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        sorting();
        driver.quit();
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        sorting();
    }

    private void sorting() throws InterruptedException {
        driver.get("https://market.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1200, 743));
        driver.findElement(By.xpath("//a/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div/div/div/a/span")).click();
        Thread.sleep(1000);
        help(2, "Сначала подешевле");
        help(3, "Сначала подороже");
        help(4, "Сначала с лучшей оценкой");
        help(5, "Сначала с отзывами");
        help(6, "Сначала со скидками");
    }

    private void help(int n, String name) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/button/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[" + n + "]/span")).click();
        assertEquals(driver.findElement(By.xpath("//div/button/span/span")).getText(), name);
    }
}
