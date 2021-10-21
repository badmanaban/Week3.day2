package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	ChromeDriver driver = new ChromeDriver();

	public void brand() {
		
	}

	public void bags() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"))
				.click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("No.of items found:");
		System.out.println(text);
		System.out.println("List of Brands:");
		Thread.sleep(5000);
		List<WebElement> brandname = driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < brandname.size(); i++) {
			String text2 = brandname.get(i).getText();
			System.out.println(text2);
		}
		Thread.sleep(5000);

		System.out.println("List of names of bags :");
		System.out.println("************************");
		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='name']"));
		for (int j = 0; j < findElements2.size(); j++) {
			String text3 = findElements2.get(j).getText();
			System.out.println(text3);
		}

	}

}
