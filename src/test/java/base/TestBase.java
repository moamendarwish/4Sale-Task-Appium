package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {


        private AppiumDriver driver;
        protected HomePage homePage;

        //We Can Also Add IOS Setup Function To Handle Configurations And Capabilities For IOS Environment
        @BeforeClass
        public void androidSetup() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName","Android");
            caps.setCapability("automationName","UiAutomator2");
            caps.setCapability("platformVersion","14.0");
            caps.setCapability("deviceName","Android Emulator");
            caps.setCapability("app",System.getProperty("user.dir")
                    +"/apps/4Sale - Buy & Sell Everything.apk");
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
            homePage = new HomePage(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        }

        @AfterClass
        public void tearDown(){
            if(null != driver)
                driver.quit();
        }
}


