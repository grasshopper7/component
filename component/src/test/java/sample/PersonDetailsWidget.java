package sample;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.pagefactory.Widget;

public class PersonDetailsWidget extends Widget {

	@FindBy(css="td[class='sno']")
	private WebElement sno;
	
	@FindBy(css="td[class='name']")
	private WebElement name;
	
	@FindBy(xpath=".//td[@class='phones']/div")
	private List<WebElement> phones;
	
	protected PersonDetailsWidget(WebElement element) {
		super(element);
	}
	
	public String getPersonSNo() {
		return sno.getText();
	}
	
	public String getPersonName() {
		return name.getText();
	}
	
	public List<String> getPersonPhones() {
		return phones.stream().map(t -> t.getText()).collect(Collectors.toList());
	}
}
