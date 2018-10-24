package ua.training.abstract_factory;

import ua.training.abstract_factory.abstractProducts.AbstractButton;
import ua.training.abstract_factory.abstractProducts.AbstractWindow;

public interface AbstractFactory {
    AbstractButton newButton();
    AbstractWindow newWindow();

}
