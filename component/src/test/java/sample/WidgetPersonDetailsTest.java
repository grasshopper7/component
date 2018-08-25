package sample;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidgetPersonDetailsTest {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:/Software Testing/Selenium/Jars/chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mounish/eclipse-workspace/component/src/test/resources/pages/tables.html");
		
		PersonDetailsPO persDetPO = new PersonDetailsPO(driver);
		
		System.out.println("Table Title - " + persDetPO.getTableTitle());
		System.out.println("Table Columns - " + persDetPO.getTableColumns());
		
		System.out.println("First Person Serial Number - " + persDetPO.getFirstPerson().getPersonSNo());
		System.out.println("First Person Name - " + persDetPO.getFirstPerson().getPersonName());
		System.out.println("First Person Phones - " + persDetPO.getFirstPerson().getPersonPhones());
		
		System.out.println("First Person Serial Number - " + persDetPO.getPerson(3).getPersonSNo());
		System.out.println("First Person Name - " + persDetPO.getPerson(3).getPersonName());
		System.out.println("First Person Phones - " + persDetPO.getPerson(3).getPersonPhones());
		
		System.out.println("Person Counts - " + persDetPO.personCounts());
		
		driver.quit();
	}
}
