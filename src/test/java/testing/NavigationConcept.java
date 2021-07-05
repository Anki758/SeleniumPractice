package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {


			public static void main(String[] args) {
					WebDriverManager.chromedriver().setup();

					WebDriver driver = new ChromeDriver(); 
					driver.get("http://www.google.com");
					
					driver.navigate().to("https://www.rediff.com/");
					
					driver.navigate().back();
					
					driver.navigate().forward();
					
					driver.navigate().back();
					
					driver.navigate().refresh();
					
					
					
					
					
					

				}

			
	

				
				
				
				
				
			}	
				

	
