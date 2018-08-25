package so;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.pagefactory.Widget;

public class SOQuesWidget extends Widget {

	@FindBy(css="a[class='question-hyperlink']")
	private WebElement quesTitle;
	
	@FindBy(xpath=".//div[starts-with(@class,'tags')]/a")
	private List<WebElement> quesTags;
	
	protected SOQuesWidget(WebElement element) {
		super(element);
	}
	
	public String getQuesTitle() {
		return quesTitle.getText();
	}
	
	public List<String> getQuesTags() {
		return quesTags.stream().map(t -> t.getText()).collect(Collectors.toList());
	}
}
