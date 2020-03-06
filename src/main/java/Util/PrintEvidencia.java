package Util;

import Driver.DriverWeb;
import cucumber.api.*;
import cucumber.api.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class PrintEvidencia {

    private static Scenario print;

    public static Scenario getPrint(){ return print; }
    @Before
    public static void setPrint(Scenario scenario){ print = scenario; }

    public static void Print(String resultado) {
        getPrint().write((resultado));
    }

    public static void PrintTela(){
        //getPrint().write(DriverWeb.getDriver().getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot) DriverWeb.getDriver()).getScreenshotAs(OutputType.BYTES);
        getPrint().embed(screenshot, "image/png");
    }

}