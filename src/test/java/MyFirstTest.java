import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    @Test
    public void DeleteCard() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://test-m.sd.nau.run/");

            WebElement userInput = driver.findElement(By.id("username"));
            userInput.sendKeys("mrbbyface");
            WebElement passInput = driver.findElement(By.id("password"));
            passInput.sendKeys("123");
            WebElement submitButton = driver.findElement(By.id("submit-button"));
            submitButton.click();
            Thread.sleep(5500);

            WebElement openMenu = driver.findElement(By.id("gwt-debug-fcd6e34b-17fa-082b-0000-000026daef8c"));
            openMenu.click();
            WebElement deleteButton = driver.findElement(By.cssSelector(".del2"));
            deleteButton.click();
            Thread.sleep(3500);

            WebElement yesButton = driver.findElement(By.id("gwt-debug-YES"));
            yesButton.click();
            Thread.sleep(4000);

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            driver.quit();
        }
    }

    @Test
    public void CreateCard() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://test-m.sd.nau.run/");

            WebElement userInput = driver.findElement(By.id("username"));
            userInput.sendKeys("mrbbyface");
            WebElement passInput = driver.findElement(By.id("password"));
            passInput.sendKeys("123");
            WebElement submitButton = driver.findElement(By.id("submit-button"));
            submitButton.click();
            Thread.sleep(5500);

            WebElement favoriteButton = driver.findElement(By.id("favorite"));
            favoriteButton.click();
            Thread.sleep(3500);

            WebElement inputField = driver.findElement(By.id("gwt-debug-itemTitle-value"));
            inputField.clear();
            inputField.sendKeys("Тестовая карточка профиля");

            WebElement createCard = driver.findElement(By.id("gwt-debug-apply"));
            createCard.click();
            Thread.sleep(4500);


        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            driver.quit();
        }
    }
}
