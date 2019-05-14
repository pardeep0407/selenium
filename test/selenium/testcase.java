package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testcase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}System.setProperty("webdriver.chrome.driver", "/Users/parrot/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	// go to the webpage
	
	driver.get("https://www.webdirectory.com/Animals/");
	
	// get all links for that section
	List<WebElement> list = driver.findElements(By.xpath("/html/body/ul/li"));
	
	// test that the number of links matches
	assertEquals(10, list.size());
	
	for (int i = 0; i < list.size(); i++) {
		WebElement e = list.get(i);
		// get the link
		WebElement link = e.findElement(By.xpath("a"));
		String url = link.getAttribute("href");
		
		System.out.println("Link #" + i + ": " + ur

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
