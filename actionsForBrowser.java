 WebDriver driver = new FirefoxDriver();
 
 public static void testBrowser(WebDriver driver) throws Exception{
	 driver.get("www.baidu.com");
	 Thread.sleep(5000);
	 
	 //maximize the browser
	 driver.manage().window().maximize();
	 driver.navigate().to("www.baidu.com");
	 
	 //refresh the browser
	 driver.navigate().refresh();
	 
	 //back
	 driver.navigate().back();
	 
	 //forward
	 driver.navigate().forward();
	 
	 //quit 
	 driver.quit();
	 
	 
 }
 
 //screenshot
 
 public static void testScreenShot(WebDriver driver) throws Exception {
	 driver.get("www.baidu.com");
	 File srcFile = ((TakesScreenShot)driver.getScreenshotAs(outputType.FILE);
	 FileUtils.copyFile(srcFile, new File("c:\\1.png"));
	 
 }
 
 //sumulate the actions of mouse 
 
 public static void rightClickMouse(WebDriver driver){
	 driver.get("www.baidu.com");
	 
	 Actions action = new Actions(driver);
	 
	 action.contextClick(driver.findElement(By.id("kw"))).perform();
	 
 }
 
 //kill the process 
 
 public static void KillProcess(){
	 //fireFox
	 WindowsUtils.tryToKillByName("firefox.exe");
	 
	 //IE
	 WindowsUtils.tryToKillByName("iexplore.exe");
	 
	 //chrome
	 WindowsUtils.tryToKillByName("chrome.exe");
	 
	 
 }