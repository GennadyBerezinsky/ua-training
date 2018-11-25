package model.entity;

/**
 * Created by User on 03.11.2018.
 */


public class EntertainmentElectronic extends Electronic {
    private int volume;

    public EntertainmentElectronic(String name, int power, boolean state, int volume){
        super(name, power, state);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public EntertainmentElectronic(){

    }

    public EntertainmentElectronic(int volume) {
        this.volume = volume;
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
