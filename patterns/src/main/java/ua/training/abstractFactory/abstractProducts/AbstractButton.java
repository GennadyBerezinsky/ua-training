package ua.training.abstractFactory.abstractProducts;

/**
 * Created by User on 24.10.2018.
 */


public abstract class AbstractButton  {
    private String color;
    private int height;
    private int width;

    public AbstractButton(String color, int height, int width){
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public final String toString(){
        return "Button\n" +
                "color: " + color +"\n" +
                "height: " + height +"\n" +
                "width: " + width +"\n";
    }

}
