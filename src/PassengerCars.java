public class PassengerCars extends Transport {
    private int pitStop;
    private int maxSpeed;
    private int bestLapTime;
    private final BodyTypePC setBodyTypePC;
    private BodyTypePC bodyTypePC;
    private Type type;

    public PassengerCars(String brand, String model, double volumeEngine, int pitStop, int maxSpeed, int bestLapTime, BodyTypePC bodyTypePC, Type type) {
        super(brand, model, volumeEngine, maxSpeed);
        this.setBodyTypePC = bodyTypePC;
        this.type = type;
    }
    public Type getType() {
        return type;
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
        if (this.type != null) {
            System.out.println(this.type);
        } else {
            System.out.println("Данных по транстпортному средству недостаточно");
        }
    }
}

