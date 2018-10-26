package ua.training.abstractFactory.product;

import ua.training.abstractFactory.abstractProducts.AbstractButton;
import ua.training.abstractFactory.abstractProducts.AbstractTheme;
import ua.training.abstractFactory.abstractProducts.AbstractWindow;

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
