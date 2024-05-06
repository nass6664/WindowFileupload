import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class windowUpLoad {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/nasabousaleh/java/Github/Grid/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.adobe.com/acrobat/online/pdf-to-word.html");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".CTAButtons")).click();
        Thread.sleep(3000);

        //runTime.getRunTime().exec(.exe file you recorded the scripts in autoit)
    }
}

/*

Reference Material for AutoIT
Automating window Controls with Selenium:



· Handling Window Authentication Pop Up
http://Username:Password@SiteURL

· Driver.get();

· Handling File Upload from Windows using AutoIT


What is AutoIT
Install AutoIT
AutoIT Scripting
Integrating AutoIT with Selenium



//Shift focus to the file upload windows

//set text/path into file name edit box

//click open to upload file



Au3info- record window component objects

Build Script -scite.exe

Save it- .au3 extenstion

Convert file into .exe by compiling .au3 file

Call .exe file with Runtime class in java into your selenium tests





ControlFocus("Open","","Edit1")

ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")

ControlClick("Open","","Button1")


 */
