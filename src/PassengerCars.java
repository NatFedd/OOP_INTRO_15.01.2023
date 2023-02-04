public class PassengerCars extends Transport {
    private int pitStop;
    private int maxSpeed;
    private int bestLapTime;
    public PassengerCars(String brand, String model, float volumeEngine, int pitStop, int maxSpeed, int bestLapTime) {
        super(brand, model, volumeEngine);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    public void getPitStop() {
        System.out.println("pit stop is" + pitStop);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("best lap time is" + bestLapTime);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("max speed is" + maxSpeed);
    }
    @Override
    void startMoving() {
        System.out.println("Car started");
    }
    @Override
    void stopMoving() {
        System.out.println("Car stopped");
    }
}

