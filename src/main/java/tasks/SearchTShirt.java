package tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SearchTShirtPage;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTShirt implements Task {


      private String   id= "fancybox-iframe";

    public static SearchTShirt ThePage() {

        return instrumented(SearchTShirt.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        ChromeDriver driver = (ChromeDriver) BrowseTheWeb.as(actor).getDriver();

        actor.attemptsTo(Click.on(SearchTShirtPage.LINK_T_SHIRT),
                 Click.on(SearchTShirtPage.IMG_T_SHIRT));
        driver.switchTo().defaultContent();
        //driver.switchTo().frame(driver.findElement(By.className(id)));
        actor.attemptsTo( Click.on(SearchTShirtPage.CART));
        driver.switchTo().defaultContent();

    }
}
