public class PassengerCars extends Transport {
    private int pitStop;
    private int maxSpeed;
    private int bestLapTime;
    private BodyTypePC bodyTypePC;


    public PassengerCars(String brand, String model, double volumeEngine, int pitStop, int maxSpeed, int bestLapTime, BodyTypePC bodyTypePC, Type type) {
        super(brand, model, volumeEngine, maxSpeed, type);
        this.BodyTypePC = bodyTypePC;

    }
    public void setBodyTypePC(BodyTypePC bodyTypePC) {
        this.bodyTypePC = bodyTypePC;
    }

    public String getBodyTypePC() {
        return String.valueOf(bodyTypePC.ordinal());
    }
    @Override
    public void getPitStop() {

    }
    @Override
    public void getBestLapTime() {

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

