package ua.training.bridge;

/**
 * Created by User on 26.10.2018.
 */


public abstract class Window {
    Implementator implementator;
    public Window(Implementator imp){
        implementator = imp;
    }
    public void theme(){
        implementator.implement();
    }
}
