package ua.training.abstract_factory.product;

import ua.training.abstract_factory.AbstractFactory;
import ua.training.abstract_factory.abstractProducts.AbstractButton;
import ua.training.abstract_factory.abstractProducts.AbstractTheme;
import ua.training.abstract_factory.abstractProducts.AbstractWindow;

/**
 * Created by User on 24.10.2018.
 */


public class IntelijiTheme extends AbstractTheme {
    public AbstractButton newButton() {
        return new IntelijiButton("gray", 75, 25);
    }

    public AbstractWindow newWindow() {
        return new IntelijiWindow("white", 750, 250);
    }




}
