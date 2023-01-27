//Задание 1.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Car car1 = new Car("Lada", "Granta",
                2015,
                "Russia",
                "yellow",
                180);
        Car car2 = new Car("Audi", "A8_50_L_TDI_quattro",
                2020,
                "Germany",
                "black",
                100);
        Car car3 = new Car("BMW", "Z8",
                2021,
                "Germany",
                "black",
                100);
        Car car4 = new Car("Kia", "Sportage_4_generation",
                2018,
                "SouthKorea",
                "red",
                190);
        Car car5 = new Car("Hyundai", "Avante",
                2016,
                "SouthKorea",
                "orange",
                185);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Bus bus1 = new Bus("Liaz", "S54",
                2005,
                "Russia",
                "yellow",
                80);
        Bus bus2 = new Bus("LAZ", "N8",
                1980,
                "Russia",
                "yellow",
                75);
        Bus bus3 = new Bus("PAZ", "96",
                1995,
                "Russia",
                "red",
                70.0f);

            System.out.println("Задание 2");
            System.out.println(bus1);
            System.out.println(bus2);
            System.out.println(bus3);
    }
}

