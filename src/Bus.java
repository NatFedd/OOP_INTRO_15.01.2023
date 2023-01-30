public class Bus extends Transport {
    private final int pitStop;
    private final int maxSpeed;
    private final int bestLapTime;
    public Bus(String brand, String model, float volumeEngine, int pitStop, int maxSpeed, int bestLapTime) {
        super(brand, model, volumeEngine);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
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
    public void getMaxSpeed() {
        System.out.println("Bus max speed is" + maxSpeed);
    }
    void startMoving() {
        System.out.println("Bus is started");
    }
    void stopMoving() {
        System.out.println("Bus is stopped");
    }
}