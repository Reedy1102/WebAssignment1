WebDriver driver = new FireFoxDriver();
driver.get("www.baidu.com");

//Text
webElement element = driver.findElement(By.id("userNameId"));

element.sendKeys("test usernameID");

element.clear();

element.getAttribute("value");

//Button

String xpath="//input[@value='Add']";

webElement addButton=driver.findElement(By.xpath(xpath));

addButton.click();

addButton.isEnable();


//Select 
Select select = new Select(driver.findElement(By.id("proAddItem_kind")));

select.selectByIndex(2);
select.selectByValue("18");
select.selectByVisibleText("TypeAA");

List<webElement> options = select.getOptions();
for (webElement webElement : options){
 System.out.println(webElement.getText());
}

//Radio Button
String xpath="//input[@type='radio'][@value='Apple']";
WebElement apple = driver.findElement(By.xpath(xpath));

apple.click();

boolean isAppleSelect = apple.isSelected();

apple.getAttribute("value");


