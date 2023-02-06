public class Bus extends Transport {
    private final int pitStop;
    private final int maxSpeed;
    private final int bestLapTime;
    private CapacityBus capacityBus;

    public Bus(String brand, String model, double volumeEngine, int pitStop, int maxSpeed, int bestLapTime, CapacityBus capacityBus, Type type) {
        super(brand, model, volumeEngine, maxSpeed, type);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.capacityBus = capacityBus;

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
        if (this.getType() != null) {
            System.out.println(this.getType());
        } else {
            System.out.println("Данных по транстпортному средству недостаточно");
        }

    }
}