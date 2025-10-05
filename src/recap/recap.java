package recap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class recap {

WebDriver driver = new ChromeDriver();

@BeforeTest
public void setup () {
	
	driver.get("https://www.google.co.uk/");
	}


	
}
