package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart_loc;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeLink_loc;

    @FindBy(xpath = "//a[normalize-space()='Sony vaio i5']")
    public WebElement sonyLaptop_loc;

public void addProduct_Method(String category, String product){

    WebElement categoryElement= Driver.get().findElement(By.xpath("//*[.='"+category+"']"));

    BrowserUtils.waitForClickablility(categoryElement,2).click();

    WebElement productElement=Driver.get().findElement(By.xpath("//a[.='"+product+"']"));

//    BrowserUtils.scrollToElement(productElement);

    BrowserUtils.waitForClickablility(productElement,3).click();

    BrowserUtils.waitFor(1);

    addToCart_loc.click();

    BrowserUtils.waitFor(1);

    Alert alert=Driver.get().switchTo().alert(); //locator i olmayan acilan pencereyi ok lemek icin yapiyoruz
    alert.accept();

    homeLink_loc.click();





}
}
