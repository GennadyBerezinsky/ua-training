package ua.training.abstractFactory.product;

import ua.training.abstractFactory.abstractProducts.AbstractWindow;

/**
 * Created by User on 24.10.2018.
 */


public class IntelijiWindow extends AbstractWindow {


    public IntelijiWindow(String color, int height, int width){
        super(color, height, width);
        System.out.println("Intellij theme window created");
    }
}
