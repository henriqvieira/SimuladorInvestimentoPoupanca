package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import java.util.concurrent.*;

public class DriverWeb {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public DriverWeb(){
    }

    public static void timeS(int time) throws InterruptedException { Thread.sleep(time); }

    public static void SetupDriver() {
        new DriverWeb();
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        setDriver(new ChromeDriver());
        setWait(new WebDriverWait(driver, 40));
        getDriver().manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(13L, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
    }
    public static void Quit(){ driver.quit(); }

    public static WebDriver getDriver(){ return driver; }

    public static void setDriver(WebDriver webD){ driver = webD; }

    public static void setWait(WebDriverWait webD){ wait = webD; }
}
