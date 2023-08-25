package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();

		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();

		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(//a[text()='26'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		String bus = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]")).getText();
		System.out.println("first bus -" + bus);

		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();

		String seat = driver.findElement(By.xpath("(//p[@class='noseats AvailSts ng-binding'])[1]")).getText();
		System.out.println("Available seats" + seat);

		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[1]")).click();

		String seatno = driver.findElement(By.id("seatnos")).getText();
		System.out.println("seatsselected -" + seatno);

		String fare = driver.findElement(By.id("ticketfare")).getText();
		System.out.println("Totalfare=" + fare);

		WebElement board = driver.findElement(By.id("boardingpoint_id"));
		Select boarding = new Select(board);
		boarding.selectByVisibleText("Sathyabamba University-20:57");

		WebElement drop = driver.findElement(By.id("droppingpoint_id"));
		Select dropping = new Select(drop);
		dropping.selectByVisibleText("Electronic City Toll Gate-04:48");

		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
