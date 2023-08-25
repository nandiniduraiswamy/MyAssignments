package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Pvr {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();

		WebElement city1 = driver.findElement(By.name("city"));
		Select city = new Select(city1);
		city.selectByVisibleText("Chennai");

		WebElement genre1 = driver.findElement(By.name("genre"));
		Select genre = new Select(genre1);
		genre.selectByVisibleText("ANIMATION");

		WebElement lang1 = driver.findElement(By.name("lang"));
		Select lang = new Select(lang1);
		lang.selectByVisibleText("ENGLISH");

		driver.findElement(By.xpath("//div[@class='modal-content']//button[@class='btn btn-submit btn-primary']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img")).click();

		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cinema = driver.findElement(By.name("cinemaName"));
		Select cinema1 = new Select(cinema);
		cinema1.selectByVisibleText("PVR Heritage RSL ECR Chennai");

		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();

		WebElement time = driver.findElement(By.name("timings"));
		Select time1 = new Select(time);
		time1.selectByVisibleText("12:00 PM - 03:00 PM");

		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.name("name")).sendKeys("Nandini");
		driver.findElement(By.name("mobile")).sendKeys("9043540456");
		driver.findElement(By.name("email")).sendKeys("nandudurai94@gmail.com");

		WebElement food = driver.findElement(By.name("food"));
		Select food1 = new Select(food);
		food1.selectByVisibleText("No");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");

		driver.findElement(By.xpath("//div[@class='form-group col-sm-6']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.className("swal2-close")).click();

		String title = driver.getTitle();
		System.out.println(title);

	}

}
