public class VehicleChassis implements Chassis {

    //Create a String named chassisName instance variable
    private String chassisName;

    // A public default constructor
    //set the chassisName instance variable
    //Use the interface constant as the default string value
    public VehicleChassis() {
        chassisName = chassis;
    }

    //and an overloaded constructor with the following value;
    // A string with a parameter value of chassisName
    //Set the chassisName instance variable
    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    //A public method named getChassisType that doesnt have a formal parameter
    //and that returns an instance
    //of the interface Chassis (hint that would be a copy of this class)
    public Chassis getChassisType(){
        return this;
    }

    //Public method setChssisType that takes a String parameter vehicleClass
    //returns a void. It should set the instance variable chassisName
    public void setChassisType(String vehicleChassis){
        chassisName = vehicleChassis;
    }

    //A public toString method that returns the following:
    //Chassis Name           : Chassis
    public String toString() {
        return "Chassis Name: Chassis" + chassisName;
    }


}
