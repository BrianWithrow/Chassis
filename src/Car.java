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
                exteriorFeatures += s + "\n";
            }
        }
        return exteriorFeatures;
    }

    public String getInteriorFeatures() {
        String interiorFeatures = "";
        for(Feature s : feature){
            if (s instanceof InteriorFeature){
                interiorFeatures += s + "\n";
            }
        }
        return interiorFeatures;
    }

    @Override
    public String toString() {
        return "Manufacturer Name: " +
                "feature=" + Arrays.toString(feature) +
                ", carAxle=" + carAxle +
                '}';
    }
}

