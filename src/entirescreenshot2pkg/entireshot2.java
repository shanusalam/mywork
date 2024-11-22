package entirescreenshot2pkg;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class entireshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Screenshot screen=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
ImageIO.write(screen.getImage(),"png",new File("C:\\Users\\Shanu\\OneDrive\\Pictures\\pc3.png"));
	}

}
