package ua.training.abstract_factory;

import ua.training.abstract_factory.abstractProducts.AbstractButton;
import ua.training.abstract_factory.abstractProducts.AbstractTheme;
import ua.training.abstract_factory.abstractProducts.AbstractWindow;

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
