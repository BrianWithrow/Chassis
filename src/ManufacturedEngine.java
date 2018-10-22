import java.util.Date;

public class ManufacturedEngine implements Engine {

    private String engineManufacterer;
    private Date engineManufacteredDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    public ManufacturedEngine() {
        engineManufacterer = "generic";
        engineManufacteredDate = new Date();
        engineMake = "Generic";
        engineModel = "Generic";
        engineType = "85 AKI";
        engineCylinders = 0;
        driveTrain = "2WD: Two-Wheel Drive";
    }

    public ManufacturedEngine(String engineManufacterer, Date engineManufacteredDate, String engineMake,
                              String engineMode, String engineType, int engineCylinders,  String driveTrain) {
        this.engineManufacterer = engineManufacterer;
        this.engineManufacteredDate = engineManufacteredDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineType = engineType;
        this.engineCylinders = engineCylinders;
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacteredDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacterer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    @Override
    public String toString() {
        return
                "\nEngine Manufacterer : " + engineManufacterer +
                "\nEngine Manufactered Date : " + engineManufacteredDate +
                "\nEngine Make : " + engineMake +
                "\nEngine Model : " + engineModel  +
                "\nEngine Cylinders : " + engineCylinders +
                "\nEngine Type : " + engineType +
                "\nDrive Train : " + driveTrain ;
    }
}
