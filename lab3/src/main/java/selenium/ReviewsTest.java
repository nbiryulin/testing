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
public class ReviewsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    System.setProperty("webdriver.gecko.driver","/Users/nbiryulin/Downloads/geckodriver");
  }

  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }

@Test
  public void test() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    reviewsChrome();
    driver.quit();
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    reviewsChrome();
    driver.quit();
  }


  private void reviewsChrome() {
    driver.get("https://market.yandex.ru/");
    driver.manage().window().setSize(new Dimension(1200, 743));
    driver.findElement(By.xpath("//input[@id=\'header-search\']")).sendKeys("xiaomi mi band 4");
    driver.findElement(By.xpath("//form/div/div[2]/button")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.xpath("//span[6]")).click();
    vars.put("win5980", waitForWindow(2000));
    driver.switchTo().window(vars.get("win5980").toString());
    assertTrue(driver.getTitle().contains("Xiaomi Mi Band 4"));
    assertTrue(driver.getTitle().contains("купить"));
    driver.findElement(By.xpath("//li[5]/div/a/span")).click();
    assertTrue(driver.getTitle().contains("Отзывы"));
  }
}
