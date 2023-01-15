package Lab08.ISPVio2;

public class Drone implements Engine, CameraSwitch{
    public boolean startEngine(){
        return true;
    }
    public boolean turnCameraOn(){
        return true;
    }
    public boolean turnCameraOff(){
        return false;
    }
}
