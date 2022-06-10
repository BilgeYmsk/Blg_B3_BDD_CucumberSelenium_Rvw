package com.demoblaze.step_definitions;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase_StepDefs {

    String laptopName;

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @When("the user adds {string} from {string}")
    public void the_user_adds_from(String product, String category) {

        productPage.addProduct_Method(category, product);

    }

    @When("the user remove {string} from cart")
    public void the_user_remove_from_cart(String removeProduct) {

        cartPage.removeProduct_Method(removeProduct);

    }

    @When("the user places order captures and log amount")
    public void the_user_places_order_captures_and_log_amount() {

        cartPage.finishPurchase_Method();

    }


    @Then("the user verifies puchase amount equals {int}")
    public void theUserVerifiesPuchaseAmountEquals(int expectedAmount) {

        cartPage.verifyAmount_Method(expectedAmount);
    }

    @Then("verify the menu")
    public void verifyTheMenu() {

        cartPage.menu_Method("Laptops");
        cartPage.menu_Method("Phones");
        cartPage.menu_Method("Monitors");
    }

    @When("the user get sony laptops name")
    public void the_user_get_sony_laptops_name() {

        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(productPage.sonyLaptop_loc); //elemente in demek oluyor
        // üzerinde calisacagimiz elementi bulup islem yapmasi adina güzel bir yöntem 56 57 59 satiri ekstra dan yazdik. asagi indirmeyi görmek adina
        BrowserUtils.waitFor(1);
        laptopName=productPage.sonyLaptop_loc.getText();

    }

    @Then("the compiler adds laptops name to the Configuration Properties")
    public void the_compiler_adds_laptops_name_to_the_Configuration_Properties() {
        ConfigurationReader.set("LaptopName",laptopName);

    }


}
