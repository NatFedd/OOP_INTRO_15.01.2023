package transport;

public class Car {
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
            int seatsCount
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

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}