public class VehicleFrame implements Chassis {
    //String named vehicleFrameType instance variable
    private String vehicleFrameType;

    //Public default constructor and an overloaded constructor w/ value
    public VehicleFrame() {
        vehicleFrameType = "Unibody";
    }

    //Public method named getChassisType that didnt have a formal parameter
    //returns an instance of the interface Chassis
    public Chassis getChassisType(){
        return this;
    }

    //Public method setChssisType that takes a String parameter vehicleClass
    //returns a void. It should set the instance variable chassisName
    public void setChassisType(String vehicleFrameType){
        this.vehicleFrameType = vehicleFrameType;
    }

    //A public toString method that returns the following:
    //Chassis Name           : Chassis
    //Vehicle Frame          : Unibody
    public String toString() {
        return "Chassis Name: Chassis" + "\nVehicle Frame: Unibody";
    }
}
