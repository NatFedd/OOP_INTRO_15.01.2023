import java.util.List;

//Задание 1.
public class Main {
    public static void main(String[] args) {
        PassengerCars PassengerCars1 = new PassengerCars("Lada", "Granta",
                1.5f, 15, 150, 15);
        PassengerCars PassengerCars2 = new PassengerCars("Audi", "A8_50_L_TDI_quattro",
                3.5f, 18, 180, 12);
        PassengerCars PassengerCars3 = new PassengerCars("BMW", "Z8",
                4.0f, 22, 190, 11);
        PassengerCars PassengerCars4 = new PassengerCars("Kia", "Sportage_4_generation",
                3.0f, 25, 210, 8);

        System.out.println(PassengerCars1);
        System.out.println(PassengerCars2);
        System.out.println(PassengerCars3);
        System.out.println(PassengerCars4);

        Bus bus1 = new Bus("Liaz", "S54",
                5.2f, 22, 95, 3);
        Bus bus2 = new Bus("LAZ", "N8",
                7.0f,20, 89, 4);
        Bus bus3 = new Bus("PAZ", "96",
                7.5f, 18, 96, 5);
        Bus bus4 = new Bus("Nefaz", "196",
                10.5f, 15, 105, 3);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

            Trucks trucks1 = new Trucks("Gaz", "66",
                    7.2f,18, 110, 4);
            Trucks trucks2 = new Trucks("Kamaz", "T45",
                    12.0f, 20, 100, 5);
            Trucks trucks3 = new Trucks("Volvo", "Z60",
                8.5f, 15, 115, 6);
            Trucks trucks4 = new Trucks("Ural", "66",
                        13.5f, 16, 108, 5);

        System.out.println(trucks1);
        System.out.println(trucks2);
        System.out.println(trucks3);
        System.out.println(trucks4);
        System.out.println("Задание 4");
        System.out.println("водитель А управляет автомобилем Б и будет участвовать в заезде");
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель с правами " + transport.getNameDriver() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");

    }
}



