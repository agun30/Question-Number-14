package training.selenium;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAUtomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\SeleniumDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gist.github.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/a[1]")).click();
		
		driver.findElement(By.id("login_field")).sendKeys("tatang190");
		
		driver.findElement(By.id("password")).sendKeys("tatangsuratang190");
		
		driver.findElement(By.xpath("/html/body/div[3]/main/div/div[3]/form/input[14]")).click();
		
		driver.findElement(By.className("Header-link")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[1]/input")).sendKeys("AutomationTest");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[1]/div[2]/div/div[1]/div[1]/input[2]")).sendKeys("FirstTest");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[1]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]/div/pre")).sendKeys("Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[2]/div/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[1]/div/div[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[1]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]/div/pre")).clear();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[1]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]/div/pre")).sendKeys("Tidak ada yang menyukai kepedihan, yang mencarinya dan ingin merasakannya, semata karena pedih rasanya.");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/form/div/div[2]/button")).click();
		
		
		//(Stuck on delete gists confirmation)
		//driver.findElement(By.xpath("/html/body/div[4]/div/main/div[1]/div/div[1]/ul/li[2]/form/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/details/summary")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/details/details-menu/form/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/main/div/form/input[2]")).click();

	}

}
