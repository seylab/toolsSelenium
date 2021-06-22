public class OpenBrowser {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
}

public class CallWebDriverFactory {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.get("https:\/\/www.google.com");
        String title = driver.getTitle();
        //System.out.println("title = " + title);
        
        //close current tab
    	driver.close(); 
    	//closes all tabs
    	driver.quit();
}
public class CheatTableForAllWebElements{
	//
		WebDriver driver = WebDriverFactory.getDriver("chrome");

		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();

		//navigate to another website with different selenium method
		driver.navigate().to("https:\/\/www.facebook.com");
		//goes back to previous page
		driver.navigate().back();
		//goes forward after goes back
		driver.navigate().forward();
		//refresh to webpage
		driver.navigate().refresh();

		WebElement emailInputBox = driver.findElement(By.name("email"));
        String expectedEmail = "mike@smith.com";
        //String actualEmail = emailInputBox.getAttribute("value");
        	//two main ways to get txt from web elements
        	//1.getText()--> it will work %99 and it will return string
	        //2.getAttribute("value") --> second way of getting text especially input boxes

        emailInputBox.sendKeys(expectedEmail);
        .click();

    //Basic Locators

        //className
        WebElement homeLink = driver.findElement(By.className("nav-link"));

        //IDLocator
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

        //linkTextandPartialLinkText
        WebElement link1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
		WebElement link4 = driver.findElement(By.partialLinkText("Example 4 "));

		//nameLocator

        driver.manage().window().maximize();

        //lazy way
        driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        //lazy way
        driver.findElement(By.name("wooden_spoon")).click();

        //tagNameLocator
        WebElement fullNameInput = driver.findElement(By.tagName("input"));

        //Xpath Locator *********

        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        	// "//button[@name='button2']"
        	// "//input[@id='twotabsearchtextbox']"
        	// "//input[@value='Go']"
        	// "//span[contains(text(),'results for')]"
        	// "//*[contains(@type,'sub')]
        	// "//*[contains(@name,'btn')]
        	// "//span[text()='results for']"
        	// "//*[text()='results for']"
        	// "//*[@id="fox"]/a"
        	// "(//*[@id="fox"])[2]"
        	// "//input[@type='text']				
			// "//label[@id='message23']
			// "//input[@value='RESET']
			// "//*[@class='barone']
			// "//a[@href='http://demo.google.com/']
			// "//img[@src='//cdn.google.com/images/home/java.png']
        	// "//*[@type='submit' or @name='btnReset']
        	// "//input[@type='submit' and @name='btnLogin']
        	// "//*[@id='java_technologies']//child::li

        // cssLocator   
        	WebElement dontClick = driver.findElement(By.id("disappearing_buttonasdasd"));

    //BeforeAfterMethod
        	@BeforeClass
        		//"executed one time before the class"
        		//    public void setUpClass(){
        					//System.out.println("--BEFORE CLASS--");
        					//System.out.println("executed one time before the class");
    					//}
        	@BeforeMethod
        		//WebDriver,Opening Browser
        		//	public void setUp(){
				//        System.out.println("BEFORE METHOD");
				//        System.out.println("WebDriver,Opening Browser");
				//    }
        	@Test 
        		//public void test1(){
        			//System.out.println("First Test Case");
        		//}
        	@Ignore
    		@Test
    			//public void test2(){
    			    //System.out.println("Second Test Case");
    			//}
		    @AfterMethod
 		   		//public void tearDown(){
 		   		//    System.out.println("AFTER METHOD");
 		   		//    System.out.println("Closing Browser,Quit");
 		   		//}
 		    @AfterClass
 		   		//public void tearDownClass(){
 		   		//    System.out.println("--AFTER CLASS--");
 		   		//    System.out.println("Some Reporting Code Here");
 		   		//}   			

}
public class FirstTestNGTest {

    @Test
    public void test1(){
        System.out.println("My First Test Case");
    }
    @Test
    public void test2(){
        System.out.println("My Second Test Case");
    }

}
public class TestNGAssertionsDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");

    }
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title","tiTle");

        System.out.println("Second Assertion");
        Assert.assertEquals("url","url");
    }

    @Test
    public void test2(){
        Assert.assertEquals("test2","test22","verify test2");
    }

    @Test
    public void test3(){
        String expectedTitle ="Cyb";
        String actualTitle = "CyberSecurity";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");
    }

    @Test
    public void test4(){
        //verify email contains @ sign
        String email = "mikesmith.com";

        Assert.assertTrue(email.contains("@"),"verify email contains @");
    }

    @Test
    public void test5(){
        Assert.assertFalse(0>1,"verify that 0 is not greater than 1");

    }

    @Test
    public void test6(){
        Assert.assertNotEquals("one","two");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Close browser");
    }
}
public class CheckboxDemo {
	Assert.assertFalse(checkbox1.isSelected(),"verify checkbox 1 is NOT selected");
	Assert.assertTrue(checkbox2.isSelected(),"verify checkbox 2 is selected");
}
public class DisabledElements {
	//
	Assert.assertFalse(greenRadioBtn.isEnabled(),"verify green radio button NOT enabled (disabled)");
}
public class DisplayedDemo {
	//verify username inputbox is not displayed on the screen
	Assert.assertFalse(usernameInput.isDisplayed(),"verify inputbox is NOT displayed");
	//verify username displayed on the screen
	Assert.assertTrue(usernameInput.isDisplayed(),"verify username inputbox is displayed");
}
public class RadioButtonTest {

	//verify blue is selected red is not selected
	Assert.assertTrue(blueRadioBtn.isSelected(),"verify that blue is selected");
	Assert.assertFalse(redRadioBtn.isSelected(),"verify that red is NOT selected");
	redRadioBtn.click();
	Assert.assertFalse(blueRadioBtn.isSelected(),"verify that blue is NOT selected");
	Assert.assertTrue(redRadioBtn.isSelected(),"verify that red is selected");
}
public class ListOfElements {
	List<WebElement> buttons = driver.findElements(By.tagName("button"));
	Assert.assertEquals(buttons.size(),6,"verify buttons size");

	    for (WebElement button : buttons) {
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verify buttons are displayed");
        }

}

public class NoSelectDropdown {
	//
	List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));
	        for (WebElement option : dropdownOptions) {
            System.out.println(option.getText());
        	}
}
public class SelectDropdownTest {
		//
		WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateDropdown = new Select(dropdownElement);

        List<WebElement> options = stateDropdown.getOptions();

        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        
        //--------------------------------
        WebElement dropdownElement = driver.findElement(By.id("state"));
		Select stateDropdown = new Select(dropdownElement);
		
		//HOW TO SELECT OPTIONS FROM DROPDOWN ?
        //1.SELECT USING VISIBLE TEXT
        stateDropdown.selectByVisibleText("Virginia");

        expectedOption = "Virginia";
        
        //2.SELECT USING INDEX
        stateDropdown.selectByIndex(51);

        expectedOption = "Wyoming";
        
        //3.SELECT BY VALUE
        stateDropdown.selectByValue("TX");

        expectedOption = "Texas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");
}

public class iframeTest {
		@Test
		public void test1(){
	        //How to switch frames
	        //1.Switch using by name or ID attribute of iframe
	        driver.switchTo().frame("mce_0_ifr");
	
	        //clear before sendkeys
	        driver.findElement(By.cssSelector("#tinymce")).clear();
	        
	        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith");
	
	        //goes back to first frame(main html)
	        //goes back to first frame, useful when we have switched multiple frames
	        driver.switchTo().defaultContent();
	
	        //2.Switching with INDEX
	        driver.switchTo().frame(0);
	        	
	        //clear before sendkeys
	        driver.findElement(By.cssSelector("#tinymce")).clear();
	        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH INDEX");
	
	        //second way to switch parent
	        driver.switchTo().parentFrame();
	
	        //3.USING WEBELEMENT
	        //locating iframe with any valid locator
	        WebElement iframeElement = driver.findElement(By.tagName("iframe"));
	
	        driver.switchTo().frame(iframeElement);
	
	        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH WEBELEMENT");
	
	        //html
	            //top
	                //left
	                //middle
	                     //firstframe
	                            //secondframe
	                //right
	            //bottom
	        /*
	        We can switch one at a time, cannot switch to grandchild directly.
	        We cannot switch to siblings.
	        We can only switch from parent to child, or from child to parent.
	         */
			}
		@Test
    	public void test2(){
        	driver.get("http://practice.cybertekschool.com/nested_frames");
	
        	//switching to frame top
        	driver.switchTo().frame("frame-top");
        	//top has 3 frame under left middle and right
        	//switch to frame middle
        	driver.switchTo().frame("frame-middle");

        	System.out.println(driver.findElement(By.id("content")).getText());

        	//goes back to top frame
        	driver.switchTo().parentFrame();

        	//switching right with index
        	driver.switchTo().frame(2);

        	System.out.println(driver.findElement(By.tagName("body")).getText());

        	//go to main html to switch bottom
        	driver.switchTo().defaultContent();

        	driver.switchTo().frame(1);

        	System.out.println(driver.findElement(By.tagName("body")).getText());

    		}

}

public class MultipleWindows  {
	@Test
    public void SwitchWindowsTest(){

        
        //get title
        System.out.println("Title before new window:"+driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Title after new window:"+driver.getTitle());

       // System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switch new window:"+driver.getTitle());

    	}

    @Test
    public void moreThan2Window(){
       
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Before Switch:"+driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();


        //loop through each window
        for (String handle : windowHandles) {
            //one by one change it
            driver.switchTo().window(handle);

            //whenever your title equals to your expected window title
            if(driver.getTitle().equals("New Window")){
                //stop on that window
                break;
            }

        }

        System.out.println("After Switch: "+driver.getTitle());

    	}

}
public class PopupsAndAlerts {
	@Test
    public void test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //click the Destroy the World button
        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();

        //Click NO button
        driver.findElement(By.xpath("//button[.='No']")).click();

    }

    @Test
    public void test2() {
       
       //click Click For JS Alert Button
       // driver.findElement(By.xpath("//button[1]")).click();

        //switch to JS alert pop up
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //click for JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
        alert.dismiss();

        //click for JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        //send keys to JS Prompt
        alert.sendKeys("MikeSmith");
        //click OK
        alert.accept();
    }

}
public class ExplicitWaitExample {

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.tagName("button")).click();

        WebElement usernameInput = driver.findElement(By.id("username"));

        //HOW TO WAIT EXPLICITLY ?
        //create Explicit wait object
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOf(usernameInput));

        usernameInput.sendKeys("MikeSmith");

    	}

    @Test
    public void test2(){        
        //click enable
        driver.findElement(By.xpath("//*[.='Enable']")).click();

        //finding inputbox
        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        WebDriverWait wait = new WebDriverWait(driver,2);

        wait.until(ExpectedConditions.elementToBeClickable(inputBox));

        inputBox.sendKeys("MikeSmith");

    	}


}
public class ImplicitWaitExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws InterruptedException {
        
        WebElement element = driver.findElement(By.cssSelector("#finish"));

        System.out.println(element.getText());

    }
}
public class ActionsTest {

    WebDriver driver;

    @Test
    public void hoverTest() {
       
        WebElement img1 = driver.findElement(By.tagName("img"));
        //Actions --> class that contains all the user interactions
        //how to create actions object --> passing driver as a constructor
        Actions actions = new Actions(driver);
        //perform() --> perform the action, complete the action
        //moveToElement --> move you mouse to webelement(hover over)
        actions.moveToElement(img1).perform();

        WebElement viewLink = driver.findElement(By.linkText("View profile"));

        Assert.assertTrue(viewLink.isDisplayed(),"verify view link is displayed");

    }

    @Test
    public void dragAndDrop(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        List<WebElement> acceptAndClose = driver.findElements(By.xpath("//*[.='Accept and Close']"));
        List<WebElement> acceptCookies = driver.findElements(By.xpath("//*[.='Accept Cookies']"));
        
        if(acceptAndClose.size()>0){
            acceptAndClose.get(0).click();
        }else if(acceptCookies.size()>0){
            acceptCookies.get(0).click();
        }

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void dragAndDropChaining() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        List<WebElement> acceptAndClose = driver.findElements(By.xpath("//*[.='Accept and Close']"));
        List<WebElement> acceptCookies = driver.findElements(By.xpath("//*[.='Accept Cookies']"));
        if(acceptAndClose.size()>0){
            acceptAndClose.get(0).click();
        }else if(acceptCookies.size()>0){
            acceptCookies.get(0).click();
        }

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));

        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().perform();

    }

}
public class HoverTest {

    WebDriver driver;
    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */

    @Test
    public void oneImage(){
        
        WebElement img1 = driver.findElement(By.tagName("img"));

        Actions actions = new Actions(driver);

        actions.moveToElement(img1).perform();

        WebElement text1 = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text1.isDisplayed(),"verify text 1 is displayed");

    }

    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */
    @Test
    public void test2() {
       
        for (int i = 1; i <= 3; i++) {

            String xpathImg = "(//img)["+i+"]";
            WebElement img = driver.findElement(By.xpath(xpathImg));
            System.out.println(xpathImg);

            Actions actions = new Actions(driver);
            actions.moveToElement(img).perform();

            String textXpath = "//h5[.='name: user"+i+"']";
            WebElement text1 = driver.findElement(By.xpath(textXpath));
            System.out.println(textXpath);
            Assert.assertTrue(text1.isDisplayed(),"verify user "+i+" is displayed");

        }
    }
}
public class JavaScriptExecutorDemo {

    WebDriver driver;

    @Test
    public void clickWithJS(){

        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click();", dropdownLink);

    }

    @Test
    public void typeWithJS(){

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String text = "Hello Disabled Input";

        jse.executeScript("arguments[0].setAttribute('value', '" + text +"')", inputBox);

    }

    @Test
    public void ScrollDownAndUp() {

        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,250)");

        }

        for (int i = 0; i < 10; i++) {         
            jse.executeScript("window.scrollBy(0,-250)");

        }


    }

    @Test
    public void scrollToElement() {

        driver.get("https://www.amazon.com/");
        WebElement eng = driver.findElement(By.id("icp-touch-link-language"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true);",eng);
    }
}