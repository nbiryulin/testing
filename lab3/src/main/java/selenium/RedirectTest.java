package selenium;// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class RedirectTest {
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
    public void chromeGoogle() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        googleplay();
    }

    @Test
    public void firefoxGoogle() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        googleplay();
    }


    @Test
    public void chromeApple() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        appStore();
    }

    @Test
    public void firefoxApple() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        appStore();
    }


    @Test
    public void chromeHuawei() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        huawei();
    }

    @Test
    public void firefoxHuawei() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        huawei();
    }

    private void googleplay() {
        driver.get("https://market.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1200, 743));
        driver.findElement(By.xpath("//a[contains(@href, \'https://redirect.appmetrica.yandex.com/serve/603305616877870954\')]")).click();
        assertTrue(driver.getCurrentUrl().contains("play.google.com"));
    }


    private void appStore() {
        driver.get("https://market.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1200, 743));
        driver.findElement(By.xpath("//a[contains(@href, 'https://1389598.redirect.appmetrica.yandex.com?appmetrica_tracking_id=747420790659565125')]")).click();
        assertTrue(driver.getCurrentUrl().contains("apps.apple.com"));
    }

    private void huawei() {
        driver.get("https://market.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1200, 743));
        driver.findElement(By.xpath("//a[contains(@href, 'https://redirect.appmetrica.yandex.com/serve/531248050589405457')]")).click();
        assertTrue(driver.getCurrentUrl().contains("appgallery.huawei.com"));
    }
}