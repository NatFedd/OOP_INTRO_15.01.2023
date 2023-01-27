public class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private float maximumMovementSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if((this.color ==" ")||this.color =="null") {
            this.color = "default";
        } else {
            this.color = color;
        }
    }

    public float getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(float maximumMovementSpeed) {
        if (this.maximumMovementSpeed != 0) {
            this.maximumMovementSpeed = maximumMovementSpeed;
        } else {
            this.maximumMovementSpeed = 202;
        }
    }



    public Transport(String brand, String model, int year, String country, String color, float maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maximumMovementSpeed = maximumMovementSpeed;

    }
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", MaximumMovementSpeed=" + maximumMovementSpeed +
                '}';
    }

}
