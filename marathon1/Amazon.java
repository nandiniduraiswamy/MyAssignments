package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		String text1 = driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']")).getText();
		System.out.println("results="+ text1 );
		driver.findElement(By.xpath("//li[@id='p_89/Skybags']//a")).click();
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']//a")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String name = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-secondary'])[1]")).getText();
		System.out.println("bag name="+ name);
		
		String price = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style'])[1]")).getText();
		System.out.println("bag price="+ price);
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
