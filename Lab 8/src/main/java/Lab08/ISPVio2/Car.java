package Lab08.ISPVio2;

public class Car implements RadioSwitch, Engine{
    public boolean startEngine(){
        return true;
    }

    public boolean turnRadioOn(){
        return true;
    }
    public boolean turnRadioOff(){
        return false;
    }

}
