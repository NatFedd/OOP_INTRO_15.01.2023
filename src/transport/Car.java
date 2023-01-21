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

        this.transmissionType = transmissionType;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seatsCount = seatsCount;

        if ((brand.equals(" ")) || brand == "null") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if ((model == " ") || model == "null") {
            this.model = "default";
        } else {
            this.model = model;
        }

        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5f;
        }
        this.color = color;
        if ((this.color == " ") || this.color == "null") {
            this.color = "white";
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if ((country == " ") || country == "null") {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public String getBrand() {
        return brand;
    }



    public String getModel() {
        return model;
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

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}