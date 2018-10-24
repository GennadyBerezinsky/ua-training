package ua.training.abstract_factory.product;

import ua.training.abstract_factory.abstractProducts.AbstractButton;

/**
 * Created by User on 24.10.2018.
 */


public class IntelijiButton extends AbstractButton {
    public IntelijiButton(String color, int height, int width) {
        super(color, height, width);
        System.out.println("Intellij button created");
    }
}
