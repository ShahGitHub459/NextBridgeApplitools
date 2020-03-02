package nextbridge.com_VisualValidation_MainCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

import nextbridge.com_VisualValidation_Objects.MainObjects;

public class mainPage {
   WebDriver driver;
   Boolean isPresent=false;
   MainObjects objectsRequired;
   Actions actions;
   EyesRunner runner;
   Eyes eyes;
   JavascriptExecutor js;
	@BeforeClass
  public void parametersInitializing(){
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  driver=new FirefoxDriver();
	  objectsRequired=new MainObjects(driver);
	  actions=new Actions(driver);
	  runner=new ClassicRunner();
	  eyes=new Eyes(runner);
	  eyes.setApiKey("VBdcg7WHCup1wGOJWmSUXx88oUxFdiM6wS4R0ucQBcY110");
	  js=((JavascriptExecutor) driver);
  }
	//Main Page 
	@Test(priority=0)
  public void mainPageOpening() {
	  driver.get("https://nextbridge.com/");
	  while(isPresent==false) {
		  isPresent=driver.findElements(objectsRequired.mainPageCheckingObject).size() > 0;
	  }
	  isPresent=false;
	//Check point Applitools
	  eyes.open(driver,"Next","Main Page", new RectangleSize(626,600));
	  eyes.setForceFullPageScreenshot(true);
	  //eyes.checkWindow("Main Page");
	  	
  }
	@Test(priority=1)
	public void servicesHover() {
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", objectsRequired.servicesObject());
		//actions.moveToElement(objectsRequired.servicesObject()).perform();
		//Check point Applitools
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/a/div/span/i")).click();
		//eyes.setForceFullPageScreenshot(true);
		//eyes.checkWindow("Main Page");
	}
	@Test(priority=2)
	public void technologiesHover() {
		//actions.moveToElement(objectsRequired.technologiesObject()).perform();
		//Check point Applitools	
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[2]/a/div/span/i")).click();
		//eyes.setForceFullPageScreenshot(true);
		//eyes.checkWindow("Main Page");
	}
	@Test(priority=3)
	public void looInsideHover() {
		//actions.moveToElement(objectsRequired.lookInsideObject()).perform();
		//Check point Applitools	
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[3]/a/div/span/i")).click();
		//eyes.setForceFullPageScreenshot(true);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		eyes.checkWindow("Main Page");
	}
	@Test(priority=4)
	public void aboutClick() throws InterruptedException {
		//actions.moveToElement(objectsRequired.aboutObject()).perform();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[4]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("About Page");
	}
/*	@Test(priority=5)
	public void blogClick() {
		actions.moveToElement(objectsRequired.blogObject()).perform();
		//Check point Applitools	
	}
	*/
	@Test(priority=6)
	public void contactClick() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[6]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("Contact Page");
	}
	@Test(priority=7)
	public void servicesSoftwareDevelopment() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/a/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/ul/li[1]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("servicesSoftwareDevelopment Page");
	}
	@Test(priority=8)
	public void specializedVerticals() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/a/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/ul/li[2]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("specializedVerticals Page");
	}
	@Test(priority=9)
	public void roboticsSoftware() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/a/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/ul/li[3]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("roboticsSoftware Page");
	}
	@Test(priority=10)
	public void roboticsMachineDesign() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/a/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[1]/ul/li[4]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("roboticsMachineDesign Page");
	}
	@Test(priority=11)
	public void technologiesLanguageAndFramework() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[2]/ul/li/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("technologiesLanguageAndFramework Page");
	}
	@Test(priority=12)
	public void lookInsideInitiatives() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[3]/a/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[3]/ul/li[1]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("lookInsideInitiatives Page");
	}
	@Test(priority=13)
	public void lookInsideEvents() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/a[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[3]/a/div/span/i")).click();
		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/div/ul/li[3]/ul/li[2]/a/span")).click();
		//Check point Applitools	
		//eyes.setForceFullPageScreenshot(true);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(5000);
		eyes.checkWindow("lookInsideEvents Page");
	}
	@AfterClass
	public void Destroy() {
		eyes.closeAsync();
		driver.quit();
		eyes.abortIfNotClosed();
		TestResultsSummary allResult=runner.getAllTestResults();
		System.out.print(allResult);
	}
}
