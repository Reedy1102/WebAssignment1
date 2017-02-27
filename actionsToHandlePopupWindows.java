WebDriver driver = new FirefoxDriver();

//alert

public static void testAlert(WebDriver driver) {
	
	String url = "http://xxxxxxxxx";  //link that with the Alert windows 
	driver.get(url);
	
	WebElement alerButton = driver.findElement(By.xpath("//input[@value='alert']"));
	alerButton.click();
	
	Alert javascriptAlert = driver.switchTo().alert(); 
	System.out.println(javascriptAlert.getText());
	javascriptAlert.accept();
 	
	
}

//prompt

public static void testPrompt(WebDriver driver) throws Exception{
	String url = "http://xxxxxxxxx";  //link that with the Prompt windows 
	driver.get(url);
	
	WebElement promptButton = driver.findElement(By.xpath("//input[@value='prompt']")); //based on your src path
	promptButton.click();
	Thread.sleep(2000);
	Alert javascriptPrompt = driver.switchTo().alert();
	javascriptPrompt.sendKeys("This is testing");
	javascriptPrompt.accept();
	
	System.out.println(javascriptPrompt.getText());
	
	javascriptPrompt = driver.switchTo().alert();
	javascriptPrompt.accept();
	
	Thread.sleep(2000);
	promptButton.click();
	javascriptPrompt = driver.switchTo().alert();
	javascriptPrompt.dismiss();
	
	Thread.sleep(2000);
	javascriptPrompt = driver.switchTo().alert();
	javascriptPrompt.accept();
	
}

//Confirm

public static void testConfirm(WebDriver driver) throws Exception{
	String url = "http://xxxxxxxxx";  //link that with the Confirm buttons
    driver.get(url);

    WebElement confirmButton = driver.findElement(By.xpath("//input[@value='confirm']");
    confirmButton.click();
    Thread.sleep(2000);

    Alert javascriptConfirm = driver.switchTo().alert();
    javascriptConfirm.accept();

    Thread.sleep(2000);
    javascriptConfirm = driver.switchTo().alert();
    javascriptConfirm.accept();	
	
	
}


