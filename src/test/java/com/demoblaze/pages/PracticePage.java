package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage extends BasePage{

    @FindBy(xpath = "//input[@id='sliderValue']")
    public WebElement sliderValue_loc;

    @FindBy(xpath = "//input[@type='range']")
    public WebElement slider_loc;








}
