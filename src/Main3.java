//Задание 3.
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        Car3 car1 = new Car3("Lada", "Granta",
                1.7f,
                "yellow",
                2015,
                "Russia");
        Car3 car2 = new Car3("Audi", "A8_50_L_TDI_quattro",
                3.0f,
                "black",
                2020,
                "Germany");
        Car3 car3 = new Car3("BMW", "Z8",
                3.0f,
                "black",
                2021,
                "Germany");
        Car3 car4 = new Car3("Kia", "Sportage_4_generation",
                2.4f,
                "red",
                2018,
                "SouthKorea");
        Car3 car5 = new Car3("Hyundai", "Avante",
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
