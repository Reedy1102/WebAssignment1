//implicitlyWait

WebDriver driver = new FirefoxDriver();
driver.get("xxxxx")  //the page link you would like to test 

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement element = driver.findElement(By.cssSelector(".red_box"));
((JavascriptExecutor)driver).executeScript("arguments[0].style.border = \"5px solid yellow\"", element);

public static void testWait(WebDriver driver){
	driver.get("......html") //the page link you would like to test
	
	WebdriverWait wait = new WebdriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".red_box")));
	WebElement element = driver.findElement(By.cssSelector(".red_box"));
	((JavascriptExecutor)driver).executeScript("arguments[0].style.border = \"5px solid yellow\"", element);
	
}