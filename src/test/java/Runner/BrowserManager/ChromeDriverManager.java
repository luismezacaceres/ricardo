package Runner.BrowserManager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/Navegadores/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
