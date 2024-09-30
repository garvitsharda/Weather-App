package MyPack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass {
    @Test
    public static void MyWeather1() {
    	// Set ChromeDriver path
        System.getProperty("webdriver.chrome.driver", "E:\\UPES Course\\6th Semester\\Test Automation LAB\\Softwares\\chrome.exe");
        WebDriver obj = new ChromeDriver();
        
        obj.get("file:///E:/UPES%20Course/6th%20Semester/Test%20Automation%20LAB/Lab%20Experiment/Weather-App%20test%20automation/index.html");
        obj.manage().window().maximize();
        
        obj.findElement(By.xpath("/html/body/div/div/div[2]/form/input")).sendKeys("Kota",Keys.ENTER);
    }	
    
    @Test
    public static void MyWeather2() {
    	// Set ChromeDriver path
        System.getProperty("webdriver.chrome.driver", "E:\\UPES Course\\6th Semester\\Test Automation LAB\\Softwares\\chromedriver-win64\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        
        obj.get("file:///E:/UPES%20Course/6th%20Semester/Test%20Automation%20LAB/Lab%20Experiment/Weather-App%20test%20automation/index.html");
        obj.manage().window().maximize();
        
        obj.findElement(By.xpath("/html/body/div/div/div[2]/form/input")).sendKeys("Manchester",Keys.ENTER);
    }	
}
    
