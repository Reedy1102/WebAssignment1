/*
FRAME A
<html>
<head>
    <title>FrameTest</title>
</head>
<body>
    <div id="id1">this is Frame A page's div!</div>
    <input type="text" id="frameA" />
    <br/>
    <iframe id="frameB" frameborder="0" scrolling="no" style="left:0;position:absolute;" src="frameB.html"></iframe>
</body>
</html>  

frameB.html
<html>
<head>
    <title>this is a frame!</title>
</head>
<body>
    <div id="div1">this is iframes div，</div>
    <input id="iframeinput"></input>
</body>
</html>  



*/

public static void testIframe(Webdriver driver){
	driver.get("xxxx");  //the frame page you would like to test
	driver.findElement(By.id("frameA")).sendKeys("frameA");
	
	driver.switchTo().frame("frameB");
	driver.findElement(By.id("iframeinput")).sendKeys("iframeinput");
	
	driver.switchTo().defaultContent(); //back to main frame
	driver.findElement(By.id("frameA")).sendKeys("frameA")
	
	
	
}