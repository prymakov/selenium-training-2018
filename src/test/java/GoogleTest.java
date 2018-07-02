import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    @Test
    public void googleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        String title = driver.getTitle();
        driver.quit();
        Assert.assertEquals(title, "Google");
    }
}
