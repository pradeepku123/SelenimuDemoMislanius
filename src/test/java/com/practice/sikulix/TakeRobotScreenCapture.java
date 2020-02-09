package com.practice.sikulix;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeRobotScreenCapture {
    public static void TakeARobotScreenCapture() throws AWTException, IOException{
    	Robot robot=new Robot();
    	// Rectangle area=new Rectangle(10,10,1000,1000);
    	Rectangle area=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    	BufferedImage BfImage=robot.createScreenCapture(area);
    	File ImageStore=new File("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\TakeselfiwithRobot.png");
        ImageIO.write(BfImage, "png", ImageStore);
    }
    public static void ScreenwithDefault(WebDriver driver) throws IOException {
    	File result=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(result, new File("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\TakeselfiwitDefault.png"));
    }
}
