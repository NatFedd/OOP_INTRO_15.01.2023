public class Car2 {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car2(String brand, String model, float engineVolume, String color, int year, String country) {
          this.brand = brand;
          this.model = model;
          this.engineVolume = engineVolume;
          this.color = color;
          this.year = year;
          this.country = country;
      }
          public String toString() {
              return "Car2{" +
                      "brand='" + brand + '\'' +
                      ", model='" + model + '\'' +
                      ", engineVolume=" + engineVolume +
                      ", color='" + color + '\'' +
                      ", year=" + year +
                      ", country='" + country + '\'' +
                      '}';
    }


}