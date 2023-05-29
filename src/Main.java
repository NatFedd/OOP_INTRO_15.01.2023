import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Max", "Soloviev", "CarBox", "PassengerCars");
        Mechanic mechanic2 = new Mechanic("Sergey", "Ivanov", "Mashinery", "Bus");
        Mechanic mechanic3 = new Mechanic("Sasha", "Pavlov", "Machinery", "Truck");
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);

        PassengerCars PassengerCars1 = new PassengerCars("Lada", "Granta",
                1.5f, 15, 150, 15, BodyTypePC.SEDAN, Type.CAR, mechanic1, Driver.driverB1);
        PassengerCars PassengerCars2 = new PassengerCars("Audi", "A8_50_L_TDI_quattro",
                3.5f, 18, 180, 12, BodyTypePC.SEDAN, Type.CAR, mechanic2, Driver.driverB2);
        PassengerCars PassengerCars3 = new PassengerCars("BMW", "Z8",
                4.0f, 22, 190, 11, BodyTypePC.COUPE, Type.CAR, mechanic3, Driver.driverB3);
        PassengerCars PassengerCars4 = new PassengerCars("Kia", "Sportage_4_generation",
                3.0f, 25, 210, 8, BodyTypePC.SUV, Type.CAR, mechanic1, Driver.driverB4);

        System.out.println(PassengerCars1);
        System.out.println(PassengerCars2);
        System.out.println(PassengerCars3);
        System.out.println(PassengerCars4);

        Bus bus1 = new Bus("Liaz", "S54",
                5.2, 22, 95, 3, CapacityBus.Big, Type.BUS, mechanic1, Driver.driverD1);
        Bus bus2 = new Bus("LAZ", "N8",
                7.0, 20, 89, 4, CapacityBus.Average, Type.BUS, mechanic2, Driver.driverD2);
        Bus bus3 = new Bus("PAZ", "96",
                7.5, 18, 96, 5, CapacityBus.EspeciallySmall, Type.BUS, mechanic3, Driver.driverD3);
        Bus bus4 = new Bus("Nefaz", "196",
                10.5, 15, 105, 3, CapacityBus.EspeciallyBig, Type.BUS, mechanic1, Driver.driverD4);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Trucks trucks1 = new Trucks("Gaz", "66",
                7.0f, 18, 110, 4, TypeLoadCapacityTrucks.N1, Type.TRUCK, mechanic1, Driver.driverC1);
        Trucks trucks2 = new Trucks("Kamaz", "T45",
                12.0f, 20, 100, 5, TypeLoadCapacityTrucks.N2, Type.TRUCK, mechanic2, Driver.driverC2);
        Trucks trucks3 = new Trucks("Volvo", "Z60",
                8.5f, 15, 115, 6, TypeLoadCapacityTrucks.N2, Type.TRUCK, mechanic3, Driver.driverC3);
        Trucks trucks4 = new Trucks("Ural", "66",
                13.5f, 16, 108, 5, TypeLoadCapacityTrucks.N3, Type.TRUCK, mechanic1, Driver.driverC4);

        System.out.println(trucks1);
        System.out.println(trucks2);
        System.out.println(trucks3);
        System.out.println(trucks4);

        System.out.println(Trucks.passDiagnostics);
        System.out.println(PassengerCars.passDiagnostics);


        try {
            checkTransport(bus1, bus2, bus3, bus4);
        } catch (TransportTypeException e) {
            System.out.println("неверный тип транспорта" + e.getMessage());
        }
        Map<PassengerCars, List<Mechanic>> map = new HashMap<>();
        map.put(PassengerCars1, mechanics);
        map.put(PassengerCars2, mechanics);
        map.put(PassengerCars3, mechanics);
        map.put(PassengerCars4, mechanics);
        for (Map.Entry<PassengerCars, List<Mechanic>> car : map.entrySet()) {
            System.out.println(car.getKey());

            for (Mechanic mechanicsItem : car.getValue()) {
                System.out.println(mechanicsItem);
            }

        }

        Set<Driver> numbers = new HashSet<>();
        numbers.add(Driver.driverB1);
        numbers.add(Driver.driverB2);
        numbers.add(Driver.driverB3);
        numbers.add(Driver.driverB4);
        numbers.add(Driver.driverC1);
        numbers.add(Driver.driverC2);
        numbers.add(Driver.driverC3);
        numbers.add(Driver.driverC4);
        numbers.add(Driver.driverD1);
        numbers.add(Driver.driverD2);
        numbers.add(Driver.driverD3);
        numbers.add(Driver.driverD4);
        System.out.println(numbers);
        if (numbers.contains(Driver.driverD4)) {
            System.out.println("Такой водитель уже есть");
        }

        Iterator<Driver> iterName = numbers.iterator();
        while (iterName.hasNext()) {
            System.out.println(iterName.next());
        }

    }

    public static void checkTransport(Transport... transports) {
        int count = 0;
        for (Transport transport : transports) {
            if (!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + "не прошел диагностику!");
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
            } else {
                count++;
            }
        }
        System.out.println("Диагностику прошли" + count + " из " + transports.length + "автомобилей");
    }


}
