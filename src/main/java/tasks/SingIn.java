package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.chrome.ChromeDriver;
import userinterface.SingInP;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SingIn implements Task {


      private String   id= "fancybox-iframe";

    public static SingIn ThePage() {

        return instrumented(SingIn.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        ChromeDriver driver = (ChromeDriver) BrowseTheWeb.as(actor).getDriver();

        actor.attemptsTo(Click.on(SingInP.SING_IN));
        driver.switchTo().defaultContent();

    }
}
