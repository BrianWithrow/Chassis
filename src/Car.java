import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {

    private Feature[] feature = new Feature[10];
    private int carAxle;

    //Car constructor generic, no values passed
    public Car() {
        super();
        feature[0] = new ExteriorFeature("Wood Panels");
        feature[1] = new ExteriorFeature("Moonroof");
        feature[2] = new InteriorFeature("AM/FM Radio");
        feature[3] = new InteriorFeature("Air Conditioning");
        carAxle = 2;
    }

    //Car constructor with all values passed
    public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
               String vehicleMake, String vehicleModel, Chassis vehicleFrame,
               String vehicleType, String driveTrain, Engine vehicleEngine,
               Feature[] feature, int carAxle) {
        super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel,
                vehicleFrame, vehicleType, driveTrain, vehicleEngine);
        this.feature = feature;
        this.carAxle = carAxle;
    }

    //Displays ExteriorFeatures, only sets it up if default
    public String getExteriorFeatures(){
        String exteriorFeatures = "";
        for(Feature s : feature){
            if (s instanceof ExteriorFeature){
                exteriorFeatures +=  "\n\t"+ s;
            }
        }
        return exteriorFeatures;
    }

    public String getInteriorFeatures() {
        String interiorFeatures = "";
        for(Feature s : feature){
            if (s instanceof InteriorFeature){
                interiorFeatures += "\n\t"+ s;
            }
        }
        return interiorFeatures;
    }


    @Override
    public String toString() {
        return  "Manufacturer Name: " + this.getVehicleManufacturer() +
                "\nManufactured Date: " + this.getVehicleManufacturedDate() +
                "\nVehicle Make: " + this.getVehicleMake() +
                "\nVehicle Model: " + this.getVehicleModel() +
                "\nVehicle Type: " + this.getVehicleType() +
                this.getVehicleEngine() +
                "\nFeatures: " + this.getExteriorFeatures() + this.getInteriorFeatures() +
                "\nCar Axle: " + carAxle;
    }
}

