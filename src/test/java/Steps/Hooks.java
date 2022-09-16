package Steps;

import Runner.BrowserManager.DriverManager;
import Runner.BrowserManager.DriverManagerFactory;
import Runner.BrowserManager.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;
   // private static int nroEscenario = 0;

    @Before
    public void setup(){
    //    nroEscenario++;
    //    System.out.println("SE ESTA EJECUTANDO EL SCENARIO NRO. "+nroEscenario);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver =driverManager.getDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
    //    System.out.println("EL SCENARIO NRO. "+nroEscenario+" SE EJECUTO CORRECTAMENTE");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
