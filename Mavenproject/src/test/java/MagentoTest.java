

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Main;

public class MagentoTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url ="https://www.magento.com";
		driver.get(url);
		Home h = new Home(driver);
		h.clickOnMyAcct();
		Login l = new Login(driver);
		l.sendEmail("darshilpatel7698@gmail.com");
		l.sendPassword("Ddp7698416244");
		l.clickLogin();
		Main m = new Main(driver);
		m.clickOnLogOut();
		Thread.sleep(5000);
		driver.quit();
	}
}
