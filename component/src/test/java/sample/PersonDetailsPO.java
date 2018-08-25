package sample;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PersonDetailsPO {


	@FindBy(css="span[class='tabtitle']")
	private WebElement tableTitle;
	
	@FindBy(css="tr[class='header'] > th")
	private List<WebElement> tableColumns;
	
	@FindBy(css="tr[class='rows']")
	private PersonDetailsWidget firstPerson;
	
	@FindBy(css="tr[class='rows']")
	private List<PersonDetailsWidget> persons;
	
	private WebDriver driver;
	
	public PersonDetailsPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public String getTableTitle() {
		return tableTitle.getText();
	}
	
	public List<String> getTableColumns() {
		return tableColumns.stream().map(t -> t.getText()).collect(Collectors.toList());
	}
	
	public PersonDetailsWidget getFirstPerson() {
		return firstPerson;
	}
	
	public PersonDetailsWidget getPerson(int index) {
		return persons.get(index - 1);
	}
	
	public int personCounts() {
		return persons.size();
	}
}
