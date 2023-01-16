//Задание 2.
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Car2 car1 = new Car2("Lada", "Granta",
        1.7f,
        "yellow",
        2015,
        "Russia");
        Car2 car2 = new Car2("Audi", "A8_50_L_TDI_quattro",
        3.0f,
        "black",
        2020,
        "Germany");
        Car2 car3 = new Car2("BMW", "Z8",
        3.0f,
        "black",
        2021,
        "Germany");
        Car2 car4 = new Car2("Kia", "Sportage_4_generation",
        2.4f,
        "red",
        2018,
        "SouthKorea");
        Car2 car5 = new Car2("Hyundai", "Avante",
        1.6f,
        "orange",
        2016,
        "SouthKorea");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
