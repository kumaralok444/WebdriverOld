package tryrc;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class rc extends SeleneseTestNgHelper {
	@Test
	public void rc1() throws Exception {
		selenium.open("http://docs.seleniumhq.org/");
		selenium.click("link=Download");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Documentation");
		selenium.waitForPageToLoad("30000");
	}
}
