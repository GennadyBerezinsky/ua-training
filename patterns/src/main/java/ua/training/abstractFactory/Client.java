package ua.training.abstractFactory;

import ua.training.abstractFactory.abstractProducts.AbstractButton;
import ua.training.abstractFactory.abstractProducts.AbstractTheme;
import ua.training.abstractFactory.abstractProducts.AbstractWindow;

/**
 * Created by User on 24.10.2018.
 */

public class Client {
    AbstractButton button;
    AbstractWindow window;

    public void getForm(AbstractTheme theme){
        button = theme.newButton();
        window = theme.newWindow();
    }

    public String printForm(){
        return button.toString() + window.toString();
    }

}
