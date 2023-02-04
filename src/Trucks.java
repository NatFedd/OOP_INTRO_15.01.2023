public class Trucks extends Transport {
    private final int pitStop;
    private final int maxSpeed;
    private final int bestLapTime;

    public Trucks(String brand, String model, float volumeEngine, int pitStop, int maxSpeed, int bestLapTime) {
        super(brand, model, volumeEngine);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    public void getPitStop() {
        System.out.println("Trucks pit stop is" + pitStop);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Trucks best lap time is" + bestLapTime);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Trucks max speed is" + maxSpeed);
    }
    void startMoving() {
        System.out.println("Trucks is started");
    }
    void stopMoving() {
        System.out.println("Trucks is stopped");
    }
}