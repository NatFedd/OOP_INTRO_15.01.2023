public class Car3 {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;
    public Car3(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = brand;
        if ((this.brand == " ") || this.brand == "null") {
            this.brand = "default";
        }
        this.model = model;
        if ((this.model == " ") || this.model == "null") {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (this.engineVolume <=0) {
            this.engineVolume = 1.5f;
        }
        this.color = color;
        if ((this.color == " ") || this.color == "null") {
            this.color = "white";
        }
        this.year = year;
        if (this.year <=0) {
            this.year = 2000;
        }
        this.country = country;
        if ((this.country == " ") || this.country == "null") {
            this.country = "default";
        }

    }
    public String toString() {
        return "Car3{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
