package ua.training.abstractFactory.abstractProducts;

/**
 * Created by User on 24.10.2018.
 */


public abstract class AbstractWindow {
    private String color;
    private int height;
    private int width;

    public AbstractWindow(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public final String toString(){
        return "Window\n" +
                "color: " + color +"\n" +
                "height: " + height +"\n" +
                "width: " + width +"\n";
    }
}
