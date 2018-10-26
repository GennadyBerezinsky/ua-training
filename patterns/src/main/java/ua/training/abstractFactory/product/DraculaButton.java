package ua.training.abstractFactory.product;

import ua.training.abstractFactory.abstractProducts.AbstractButton;

/**
 * Created by User on 24.10.2018.
 */


public class DraculaButton extends AbstractButton {

    public DraculaButton(String color, int height, int width) {
        super(color, height, width);
        System.out.println("dracula button created");
    }
}
