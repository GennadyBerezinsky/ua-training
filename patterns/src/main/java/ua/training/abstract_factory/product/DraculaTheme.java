package ua.training.abstract_factory.product;

import ua.training.abstract_factory.AbstractFactory;
import ua.training.abstract_factory.abstractProducts.AbstractButton;
import ua.training.abstract_factory.abstractProducts.AbstractTheme;
import ua.training.abstract_factory.abstractProducts.AbstractWindow;

/**
 * Created by User on 24.10.2018.
 */


public class DraculaTheme extends AbstractTheme  {


    public AbstractButton newButton() {
        return new DraculaButton("orange", 75, 25);
    }

    public AbstractWindow newWindow() {
        return new DraculaWindow("black", 750, 250);
    }


}
