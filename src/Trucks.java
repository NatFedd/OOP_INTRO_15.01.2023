public class Trucks extends Transport {
    private final int pitStop;
    private final int maxSpeed;
    private final int bestLapTime;
    private TypeLoadCapacityTrucks typeLoadCapacityTrucks;
    private Type type;
    public static boolean passDiagnostics;


    public Trucks(String brand, String model, float volumeEngine, int pitStop, int maxSpeed, int bestLapTime, TypeLoadCapacityTrucks typeLoadCapacityTrucks, Type type) {
        super(brand, model, volumeEngine, maxSpeed);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.typeLoadCapacityTrucks = typeLoadCapacityTrucks;
    }

    public TypeLoadCapacityTrucks getTypeLoadCapacityTrucks() {
        return typeLoadCapacityTrucks;
    }

    @Override
    public void getPitStop() {
        System.out.println("Trucks pit stop is" + pitStop);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Trucks best lap time is" + bestLapTime);
    }

    public void setTypeLoadCapacityTrucks(TypeLoadCapacityTrucks typeLoadCapacityTrucks) {
        this.typeLoadCapacityTrucks = typeLoadCapacityTrucks;
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Trucks max speed is" + maxSpeed);
        return 0;
    }

    public void startMoving() {
        System.out.println("Trucks is started");
    }

    public void stopMoving() {
        System.out.println("Trucks is stopped");
    }


    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "typeLoadCapacityTrucks=" + typeLoadCapacityTrucks + "}";
    }

    @Override
    public void printType() {
        if (type != null) {
            System.out.println(type);
        } else {
            System.out.println("Данных по транстпортному средству недостаточно");
        }
    }

    public boolean passDiagnostics() {
        return passDiagnostics;
    }
}
