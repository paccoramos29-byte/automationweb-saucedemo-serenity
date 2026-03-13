package org.example.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.ui.SauceDemoScreen;
public class LoginTask implements Task {

    private String user;
    private String pass;

    public LoginTask(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public static LoginTask withCredentials(String user, String pass){
        return new LoginTask(user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Enter.theValue(user).into(SauceDemoScreen.USERNAME_FIELD),
                Enter.theValue(pass).into(SauceDemoScreen.PASSWORD_FIELD),
                Click.on(SauceDemoScreen.LOGIN_BUTTON)
        );
    }
}
