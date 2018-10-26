package ua.training.abstractFactory.product;

import ua.training.abstractFactory.abstractProducts.AbstractButton;
import ua.training.abstractFactory.abstractProducts.AbstractTheme;
import ua.training.abstractFactory.abstractProducts.AbstractWindow;

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
