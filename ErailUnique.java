package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("pondicherry", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Chennai", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> findElements = driver
				.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));

		List<String> tn = new ArrayList<String>();
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			tn.add(text);
		}
		int size = tn.size();
		System.out.print("size of list:" + size);
		Set<String> s = new HashSet<String>();
		for(String a : tn) {
			s.add(a);
		}
			System.out.println(s);
			System.out.println("Size of Set : " + s.size());
	}

}
