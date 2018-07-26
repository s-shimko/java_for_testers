package selenoid;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class SelenoidTest {

  public static void main(String[] args) throws MalformedURLException, InterruptedException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setBrowserName("chrome");
    capabilities.setVersion("");
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("screenResolution", "1440x1024x24");

    RemoteWebDriver driver = new RemoteWebDriver(
            URI.create("http://localhost:4444/wd/hub").toURL(),
            capabilities
    );

    driver.get("http://www.google.com");
    Thread.sleep(5000);
    System.out.println("done");
  }
}
