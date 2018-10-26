package ua.training.abstractFactory.product;

import ua.training.abstractFactory.abstractProducts.AbstractButton;

/**
 * Created by User on 24.10.2018.
 */


public class IntelijiButton extends AbstractButton {
    public IntelijiButton(String color, int height, int width) {
        super(color, height, width);
        System.out.println("Intellij button created");
    }
}
