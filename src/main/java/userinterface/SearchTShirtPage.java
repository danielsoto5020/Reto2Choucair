package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchTShirtPage {

    public static final Target LINK_T_SHIRT = Target.the("Link T-Shirt")
            .located(org.openqa.selenium.By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
    public static final Target IMG_T_SHIRT = Target.the("Img of T-Shirt")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    /*public static final Target CART = Target.the("Add Cart")
            .located(org.openqa.selenium.By.xpath("//*[@id='add_to_cart']/button"));*/
    public static final Target CART = Target.the("Add Cart")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
}
