public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    protected BodyTypePC BodyTypePC;
    private String betterTime;
    private double volumeEngine;
    private int maxSpeed;
    private final Type type;


    public Transport(String brand, String model, double engineVolume, int maxSpeed, Type type) {
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

        this.setEngineVolume(engineVolume);
        this.setMaxSpeed(maxSpeed);
        this.type = type;

    }
    public Type getType() {
        return type;
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

    public void setEngineVolume(double engineVolume) {
        if(engineVolume <= 0) {
            this.volumeEngine = 1.5;
        } else {
            this.volumeEngine = engineVolume;
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
                ", engineVolume=" + volumeEngine +
                '}';
    }

}