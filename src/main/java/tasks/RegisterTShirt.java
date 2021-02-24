package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.Summary;

public class RegisterTShirt implements Task {


    public static RegisterTShirt The() {

        return Tasks.instrumented(RegisterTShirt.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Summary.PROCEED_TO_CHECKOUT),
                Click.on(Summary.CONFIRM_CHECKOUT)
        );
    }
}
