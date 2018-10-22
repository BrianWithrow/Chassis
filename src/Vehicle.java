import java.util.Calendar;
import java.util.Date;

public class Vehicle implements Engine, Chassis {

    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

    //Public constructor
    public Vehicle(){
        vehicleManufacturer = "Generic";
        vehicleManufacturedDate = Calendar.getInstance().getTime();
        vehicleMake = "Generic";
        vehicleModel = "Generic";
        vehicleType = "Generic";
        vehicleEngine = new ManufacturedEngine();
        driveTrain = "2WD: Two-Wheel Drive";
    }

    //Overloaded constructor
    public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
                   String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
                   Engine vehicleEngine) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.driveTrain = driveTrain;
        this.vehicleEngine = vehicleEngine;
    }

    //Setters and getters non-implemented
    public Date getVehicleManufacturedDate() {
        return vehicleManufacturedDate;
    }

    public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
        this.vehicleManufacturedDate = vehicleManufacturedDate;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    //implemented setters and getters
    @Override
    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        vehicleEngine.setEngineManufacturer(manufacturer);
    }

    @Override
    public void setEngineMake(String engineMake) {
        vehicleEngine.setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        vehicleEngine.setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        vehicleEngine.setDriveTrain(driveTrain);
    }

    @Override
    public void setEngineType(String fuel) {
        vehicleEngine.setEngineType(fuel);
    }

    @Override
    public Chassis getChassisType() {
        return vehicleFrame;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        vehicleFrame.setChassisType(vehicleChassis);
    }

    public Engine getVehicleEngine() {
        return vehicleEngine;
    }

    @Override
    public String toString() {
        return  "Vehicle Manufacturer: " + vehicleManufacturer +
                "\nVehicle Manufactured Date: " + vehicleManufacturedDate +
                "\nVehicle Make: " + vehicleMake +
                "\nVehicle Model: " + vehicleModel +
                "\nVehicle Type: " + vehicleType +
                "\nVehicle Engine:" + vehicleEngine + "\n";
    }
}
