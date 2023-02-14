import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private String betterTime;
    private double volumeEngine;
    private int maxSpeed;
    private boolean diagnosticPassed;
    private String Mechanic;

    public void setMechanic(String mechanic) {
        Mechanic = mechanic;
    }

    public String getMechanic() {
        return Mechanic;
    }
    private List<Mechanic> mechanics = new ArrayList<>();
    public Transport(String brand, String model, double volumeEngine, int maxSpeed, List Mechanic) {
        if(brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if(model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }

        this.setVolumeEngine(volumeEngine);
        this.setMaxSpeed(maxSpeed);

    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        if(volumeEngine <= 0) {
            this.volumeEngine = 1.5;
        } else {
            this.volumeEngine = volumeEngine;
        }
    }


    public abstract void printType();


    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " make pit-stop");
    }

    @Override
    public String betterTime() {
        return getBetterTime();
    }

    @Override
    public int maxSpeed() {
        return getMaxSpeed();
    }

    public String getBetterTime() {
        if(betterTime == null) {
            return "Еще не участвовал в заездах";
        }
        return betterTime;
    }

    public void setBetterTime(String betterTime) {
        this.betterTime = betterTime;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0){
            this.maxSpeed = 180;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public void startMoving() {
        System.out.println("Начинаю движение");
    }

    public void stopMoving() {
        System.out.println("Останавливаюсь");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volumeEngine=" + volumeEngine +
                '}';
    }

    abstract boolean passDiagnostics() throws TransportTypeException;
    public boolean isDiagnosticPassed(){
        return diagnosticPassed;
    }
}
