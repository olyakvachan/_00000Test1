import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver;

    @Test
    public void test001() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();


        openMainPage();
        typeQuery();
        submitSearch();
        waitForResults();
        assertResultPage();
    }


    private void waitForResults() {
        By resultsStatsElement = By.id("resultStats");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultsStatsElement));
    }

    private void assertResultPage() {
        WebElement resultsStatsElement = driver.findElement(By.id("resultStats"));
        boolean isElementDisplayed = resultsStatsElement.isDisplayed();
        boolean expectedResult = true;
        Assert.assertEquals(isElementDisplayed, expectedResult);
    }

    private void submitSearch() {
        WebElement searchInput = driver.findElement(By.cssSelector(".gLFyf"));
        searchInput.submit();
    }

    private void typeQuery() {
        WebElement searchInput = driver.findElement(By.cssSelector(".gLFyf"));
        searchInput.sendKeys("portnov computer school");
    }

    private void openMainPage() {
        String url = "http://google.com";
        driver.get(url);
    }
}
