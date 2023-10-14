package myproject;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TC_1 {
@Test
      	
public void testLogin(){
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
driver.get("https://google.com");
Assert.assertEquals(driver.getTitle(), "Google");
driver.close();

} }

