package ua.training.model;

/**
 * Created by User on 05.10.2018.
 */


public class Model {

    public boolean validate(String line, String validator){
        line = line.toLowerCase();
        return line.equals(validator);
    }

    public String concetinate(String first, String second){
        return first + ", " + second;
    }

}
