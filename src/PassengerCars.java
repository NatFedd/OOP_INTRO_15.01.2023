public class PassengerCars extends Transport {
    public static boolean passDiagnostics;
    private int pitStop;
    private int maxSpeed;
    private int bestLapTime;
    private BodyTypePC bodyTypePC;
    private final Type type;


    public PassengerCars(String brand, String model, double volumeEngine, int pitStop, int maxSpeed, int bestLapTime, BodyTypePC bodyTypePC, Type type) {
        super(brand, model, volumeEngine, maxSpeed);
        this.type = type;

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
        if (type != null) {
            System.out.println(type);
        } else {
            System.out.println("Данных по транстпортному средству недостаточно");
        }
    }

    @Override
    protected boolean diagnostics() throws Exception {
        return true;
    }
}

