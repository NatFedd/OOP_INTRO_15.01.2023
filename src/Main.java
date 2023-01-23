import transport.Car;

//Задание 1.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Car car1;
        car1 = new Car(
                "Lada",
                "Granta",
                1.7f,
                "yellow",
                2015,
                "Russia",
                "manual",
                "van",
                "g339ffru",
                7,
                true,
                false
        );
        Car car2 = new Car(
                "Audi",
                "A8_50_L_TDI_quattro",
                3.0f,
                "black",
                2020,
                "Germany",
                "auto",
                "sedan",
                "g222eru",
                5,
                true,
                false
        );
        Car car3 = new Car(
                "BMW",
                "Z8",
                3.0f,
                "black",
                2021,
                "Germany",
                "auto",
                "coupe",
                "g555ddru",
                4,
                false,
                false
        );
        Car car4 = new Car(
                "Kia",
                "Sportage_4_generation",
                2.4f,
                "red",
                2018,
                "SouthKorea",
                "auto",
                "suv",
                "l339ffru",
                7,
                true,
                false
        );
        Car car5 = new Car(
                "Hyundai",
                "Avante",
                1.6f,
                "orange",
                2016,
                "SouthKorea",
                "auto",
                "sedan",
                "s339ffru",
                5,
                true,
                true
        );

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        car5.setTyreType(11);
        System.out.println(car5);
    }
}
