package nextbridge.com_VisualValidation_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainObjects {
	WebDriver driver;
	WebElement element;
	public By mainPageCheckingObject=By.xpath("/html/body/div/div/footer/div/div[3]/div/h4");
	By servicesDropdownObject=By.xpath("/html/body/div/div/header/div/div/div/div/nav/ul/li[1]/a/span");
	By technologiesDropdownObject=By.xpath("/html/body/div/div/header/div/div/div/div/nav/ul/li[2]/a/span");
	By lookInsideDropdownObject=By.xpath("/html/body/div/div/header/div/div/div/div/nav/ul/li[3]/a/span");
	By aboutDropdownObject=By.xpath("/html/body/div/div/header/div/div/div/div/nav/ul/li[4]/a/span");
	By blogDropdownObject=By.xpath("/html/body/div/div/header/div/div/div/div/nav/ul/li[4]/a/span");
	By contactDropdownObject=By.xpath("/html/body/div/div/header/div/div/div/div/nav/ul/li[6]/a/span");
	
	public MainObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement servicesObject() {
		element=driver.findElement(servicesDropdownObject);
		return element;
	}
	public WebElement technologiesObject() {
		element=driver.findElement(technologiesDropdownObject);
		return element;
	}
	public WebElement lookInsideObject() {
		element=driver.findElement(lookInsideDropdownObject);
		return element;
	}
	public WebElement aboutObject() {
		element=driver.findElement(aboutDropdownObject);
		return element;
	}
	public WebElement blogObject() {
		element=driver.findElement(blogDropdownObject);
		return element;
	}
	public WebElement contactObject() {
		element=driver.findElement(contactDropdownObject);
		return element;
	}
	
}
