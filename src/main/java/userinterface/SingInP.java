package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SingInP {

    public static final Target SING_IN = Target.the("SING IN")
            .located(org.openqa.selenium.By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
}
