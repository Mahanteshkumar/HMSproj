package com.crm.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	public static long Page_Load_Timeout = 20;
	public static long Implicit_Wait = 10;
	public static void getphoto(WebDriver driver) {
		Date d=new Date();
		String ds=d.toString();
		String date = ds.replaceAll(":", "_");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dst= new File("./photos/"+date+".jpeg");
		try {
			FileUtils.copyFile(scr, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
