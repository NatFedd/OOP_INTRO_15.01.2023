import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T> implements Competing {
    private final String brand;
    private final String model;
    private float volumeEngine;

    private List<Driver> driverList = new ArrayList<>();
 public Transport(String brand, String model, float volumeEngine) {
     if (brand == null || brand.isEmpty()) {
         brand = "default";
     }
         this.brand = brand;
     if (model == null || model.isEmpty()) {
         model = "default";
     }
     this.model = model;
     if (volumeEngine <= 0) {
         volumeEngine = 1.6f;
     }
     this.volumeEngine = volumeEngine;
 }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

    abstract void startMoving();
    abstract void stopMoving();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volumeEngine=" + volumeEngine +
                '}';
    }
}
