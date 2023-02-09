public class Main {
    public static void main(String[] args) {
        List<Transport> racers = new ArrayList<>();
        racers.add(PassengerCars1);
        racers.add(PassengerCars2);
        racers.add(PassengerCars3);
        racers.add(PassengerCars4);
        racers.add(bus1);
        racers.add(bus2);
        racers.add(bus3);
        racers.add(bus4);
        racers.add(trucks1);
        racers.add(trucks2);
        racers.add(trucks3);
        racers.add(trucks4);

        Driver driverB1 = new transport.DriverWithLicenseB("Vova", 5, true);
        Driver driverB2 = new transport.DriverWithLicenseB("Sasha", 2, true);
        Driver driverB3 = new transport.DriverWithLicenseB("Dima", 5, true);
        Driver driverB4 = new transport.DriverWithLicenseB("Alex", 2, true);
        Driver driverC1 = new transport.DriverWithLicenseB("Pavel", 12, true);
        Driver driverC2 = new transport.DriverWithLicenseB("Nikolay", 3, true);
        Driver driverC3 = new transport.DriverWithLicenseB("Kostya", 12, true);
        Driver driverC4 = new transport.DriverWithLicenseB("Evgeniy", 3, true);
        Driver driverD1 = new transport.DriverWithLicenseB("Vitaliy", 4, true);
        Driver driverD2 = new transport.DriverWithLicenseB("Oleg", 7, true);
        Driver driverD3 = new transport.DriverWithLicenseB("Stas", 4, true);
        Driver driverD4 = new transport.DriverWithLicenseB("Andrey", 7, true);

        Mechanic mechanic1 = new Mechanic("Max", "Soloviev", "CarBox", "PassengerCars");
        Mechanic mechanic2 = new Mechanic("Sergey", "Ivanov", "Mashinery", "Bus");
        Mechanic mechanic3 = new Mechanic("Sasha", "Pavlov", "Machinery", "Truck");

        PassengerCars PassengerCars1 = new PassengerCars("Lada", "Granta",
                1.5f, 15, 150, 15, BodyTypePC.SEDAN, Type.CAR);
        PassengerCars PassengerCars2 = new PassengerCars("Audi", "A8_50_L_TDI_quattro",
                3.5f, 18, 180, 12, BodyTypePC.SEDAN, Type.CAR);
        PassengerCars PassengerCars3 = new PassengerCars("BMW", "Z8",
                4.0f, 22, 190, 11, BodyTypePC.COUPE, Type.CAR);
        PassengerCars PassengerCars4 = new PassengerCars("Kia", "Sportage_4_generation",
                3.0f, 25, 210, 8, BodyTypePC.SUV, Type.CAR);

        System.out.println(PassengerCars1);
        System.out.println(PassengerCars2);
        System.out.println(PassengerCars3);
        System.out.println(PassengerCars4);

        Bus bus1 = new Bus("Liaz", "S54",
                5.2, 22, 95, 3, CapacityBus.Big, Type.BUS) {
        };
        Bus bus2 = new Bus("LAZ", "N8",
                7.0, 20, 89, 4, CapacityBus.Average, Type.BUS) {

        };
        Bus bus3 = new Bus("PAZ", "96",
                7.5, 18, 96, 5, CapacityBus.EspeciallySmall, Type.BUS) {
        };
        Bus bus4 = new Bus("Nefaz", "196",
                10.5, 15, 105, 3, CapacityBus.EspeciallyBig, Type.BUS) {
        };
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Trucks trucks1 = new Trucks("Gaz", "66",
                    7.0f,18, 110, 4, TypeLoadCapacityTrucks.N1, Type.TRUCK);
            Trucks trucks2 = new Trucks("Kamaz", "T45",
                    12.0f, 20, 100, 5, TypeLoadCapacityTrucks.N2, Type.TRUCK);
            Trucks trucks3 = new Trucks("Volvo", "Z60",
                8.5f, 15, 115, 6, TypeLoadCapacityTrucks.N2, Type.TRUCK);
            Trucks trucks4 = new Trucks("Ural", "66",
                        13.5f, 16, 108, 5, TypeLoadCapacityTrucks.N3, Type.TRUCK);

        System.out.println(trucks1);
        System.out.println(trucks2);
        System.out.println(trucks3);
        System.out.println(trucks4);

        System.out.println(Trucks.passDiagnostics);
        System.out.println(PassengerCars.passDiagnostics);
        System.out.println(bus1.passDiagnostics());
        System.out.println(bus2.passDiagnostics());
        System.out.println(bus3.passDiagnostics());
        System.out.println(bus4.passDiagnostics());

        try {
            checkTransport(bus1, bus2, bus3, bus4);
        }catch (TransportTypeException e ) {
            System.out.println("неверный тип транспорта" + e.getMessage());
        }
}


    public static void checkTransport(Transport...transports){
        int count = 0;
                for(Transport transport : transports) {
                    if (!transport.passDiagnostics()){
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



