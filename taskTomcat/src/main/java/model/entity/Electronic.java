package model.entity;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by User on 03.11.2018.
 */

/***
 * Abstraction for technic
 */
public class Electronic {
    private String name = "";
    private int power = 0;
    private boolean state = false;

    public Electronic(){

    }

    public Electronic(String name, int power, boolean state) {
        this.name = name;
        this.power = power;
        this.state = state;
    }

    public void switchOn(){
        setState(true);
    }
    public void switchOff(){
        setState(false);
    }

    public void setState(boolean state){
        this.state = state;
    }

    public boolean getState(){
        return this.state;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isState() {
        return state;
    }


    public boolean equals(Electronic electronic) {
        return this.power > electronic.power;
    }

    public void sort(List<Electronic> electronics){

    }
}
