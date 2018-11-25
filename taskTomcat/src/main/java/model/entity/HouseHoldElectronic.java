package model.entity;

import model.service.HouseHoldService;

/**
 * Created by User on 03.11.2018.
 */


public class HouseHoldElectronic extends Electronic {
    private int speed;

    public HouseHoldElectronic(String name, int power, boolean state, int speed){
        super(name, power, state);
        this.speed = speed;
    }

    public String getName(){
        return super.getName();
    }

    public int getPower(){
        return super.getPower();
    }

    public boolean getState(){
        return super.getState();
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void switchOn() {
        super.switchOn();
    }

    @Override
    public void switchOff() {
        super.switchOff();
    }

    @Override
    public String toString() {
        return "state= " + super.getState();
    }
}
