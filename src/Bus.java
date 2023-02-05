public class Bus extends Transport {
    private final int pitStop;
    private final int maxSpeed;
    private final int bestLapTime;
    private CapacityBus capacityBus;
    private Type type;

    public Bus(String brand, String model, double volumeEngine, int pitStop, int maxSpeed, int bestLapTime, CapacityBus capacityBus, Type type) {
        super(brand, model, volumeEngine, maxSpeed);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.capacityBus = capacityBus;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    @Override
    public void getPitStop() {
        System.out.println("Bus pit stop is" + pitStop);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Bus best lap time is" + bestLapTime);
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Bus max speed is" + maxSpeed);
        return 0;
    }

    public void startMoving() {
        System.out.println("Bus is started");
    }

    public void stopMoving() {
        System.out.println("Bus is stopped");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "pitStop=" + pitStop +
                ", maxSpeed=" + maxSpeed +
                ", bestLapTime=" + bestLapTime +
                ", capacityBus=" + capacityBus +
                '}';
    }

    @Override
    public void printType() {
        if (this.type != null) {
            System.out.println(this.type);
        } else {
            System.out.println("Данных по транстпортному средству недостаточно");
        }

    }
}