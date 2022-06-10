package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void menu(){


    }


}
