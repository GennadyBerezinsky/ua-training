package ua.training.abstractFactory;

import ua.training.abstractFactory.abstractProducts.AbstractButton;
import ua.training.abstractFactory.abstractProducts.AbstractWindow;

public interface AbstractFactory {
    AbstractButton newButton();
    AbstractWindow newWindow();

}
