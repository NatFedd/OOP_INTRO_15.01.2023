package transport;

public class Car {
    private class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        Key(boolean remoteEngineStart,  boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean getRemoteEngineStart() {
            return this.remoteEngineStart;
        }

        public boolean getKeylessAccess() {
            return this.keylessAccess;
        }

    }

    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmissionType;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsCount;
    private boolean summerTypeTyres;

    private Key key;


    public Car(
            String brand,
            String model,
            float engineVolume,
            String color,
            int year,
            String country,
            String transmissionType,
            String bodyType,
            String registrationNumber,
            int seatsCount,
            boolean remoteEngineStart,
            boolean keylessAccess
    ) {
        if ((brand.equals(" ")) || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if ((model.equals(" ")) || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.6f;
        } else {
            this.engineVolume = engineVolume;
        }

        if ((color.equals(" ")) || color == null) {
            this.color = "default";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if ((country.equals(" ")) || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if ((transmissionType.equals(" ")) || transmissionType == null) {
            this.transmissionType = "default";
        } else {
            this.transmissionType = transmissionType;
        }

        if ((bodyType.equals(" ")) || bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if ((registrationNumber.equals(" ")) || registrationNumber == null) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seatsCount == 0) {
            this.seatsCount = 5;
        } else {
            this.seatsCount = seatsCount;
        }

        this.key = new Key(remoteEngineStart, keylessAccess);
    }
    public void setTyreType(int month) {
        switch (month) {
            case 10:
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                this.summerTypeTyres = true;
                break;
            default:
                this.summerTypeTyres = false;
      }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType(){
        return bodyType;
    }

    public int getSeatsCount(){
        return seatsCount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTypeTyres(boolean summerTypeTyres) {
        this.summerTypeTyres = summerTypeTyres;
    }

    public boolean getRemoteEngineStart() {
        return this.key.getRemoteEngineStart();
    }

    public boolean getKeylessAccess() {
        return this.key.getKeylessAccess();
    }

    @Override
    public String toString() {
        return "Car{" +
                "key=" + key +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatsCount=" + seatsCount +
                ", summerTypeTyres=" + summerTypeTyres +
                ", remoteEngineStart=" + getRemoteEngineStart() +
                ", keylessAccess=" + getKeylessAccess() +
                '}';
    }
}