package so;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SOHomePageObject {


	@FindBy(css="span[class='-img _glyph']")
	private WebElement logo;
	
	@FindBy(css="div[class='grid--cell']>div>a")
	private List<WebElement> menuOpt;
	
	@FindBy(css="div[class='summary']")
	private SOQuesWidget firstQues;
	
	@FindBy(css="div[class='summary']")
	private List<SOQuesWidget> questions;
	
	
	private WebDriver driver;
	
	
	public SOHomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public String getLogoText() {
		return logo.getText();
	}
	
	public List<String> getMenuText() {
		return menuOpt.stream().map(t -> t.getText()).collect(Collectors.toList());
	}
	
	public SOQuesWidget getFirstQues() {
		return firstQues;
	}
	
	public int quesCount() {
		return questions.size();
	}
}
