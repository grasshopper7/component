package so;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidgetSOTest {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:/Software Testing/Selenium/Jars/chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://stackoverflow.com/");
		
		SOHomePageObject soHome = new SOHomePageObject(driver);
		//PageFactory.initElements(new AppiumFieldDecorator(driver), soHome);
		
		//Below two are from widget - First question in stackoverflow homepage
		System.out.println("Question Title - " + soHome.getFirstQues().getQuesTitle());
		System.out.println("Question Tags - " + soHome.getFirstQues().getQuesTags());
		
		//Below two are from home page
		System.out.println("Logo Text - " + soHome.getLogoText());
		System.out.println("Menu Text - " + soHome.getMenuText());	
		
		System.out.println("Question Count - " + soHome.quesCount());
		driver.quit();
	}
}
