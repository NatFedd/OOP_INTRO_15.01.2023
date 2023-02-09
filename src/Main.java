import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> racers = new ArrayList<>();
//        racers.add(PassengerCars1);
//        racers.add(PassengerCars2);
//        racers.add(PassengerCars3);
//        racers.add(PassengerCars4);
//        racers.add(bus1);
//        racers.add(bus2);
//        racers.add(bus3);
//        racers.add(bus4);
//        racers.add(trucks1);
//        racers.add(trucks2);
//        racers.add(trucks3);
//        racers.add(trucks4);

        PassengerCars PassengerCars1 = new PassengerCars("Lada", "Granta",
                1.5f, 15, 150, 15, BodyTypePC.SEDAN, Type.CAR, Mechanic.mechanic1, Driver.driverB1);
        PassengerCars PassengerCars2 = new PassengerCars("Audi", "A8_50_L_TDI_quattro",
                3.5f, 18, 180, 12, BodyTypePC.SEDAN, Type.CAR, Mechanic.mechanic1, Driver.driverB2);
        PassengerCars PassengerCars3 = new PassengerCars("BMW", "Z8",
                4.0f, 22, 190, 11, BodyTypePC.COUPE, Type.CAR, Mechanic.mechanic1, Driver.driverB3);
        PassengerCars PassengerCars4 = new PassengerCars("Kia", "Sportage_4_generation",
                3.0f, 25, 210, 8, BodyTypePC.SUV, Type.CAR, Mechanic.mechanic1, Driver.driverB4);

        System.out.println(PassengerCars1);
        System.out.println(PassengerCars2);
        System.out.println(PassengerCars3);
        System.out.println(PassengerCars4);

        Bus bus1 = new Bus("Liaz", "S54",
                5.2, 22, 95, 3, CapacityBus.Big, Type.BUS, Mechanic.mechanic2, Driver.driverD1);
        Bus bus2 = new Bus("LAZ", "N8",
                7.0, 20, 89, 4, CapacityBus.Average, Type.BUS, Mechanic.mechanic2, Driver.driverD2);
        Bus bus3 = new Bus("PAZ", "96",
                7.5, 18, 96, 5, CapacityBus.EspeciallySmall, Type.BUS, Mechanic.mechanic2, Driver.driverD3);
        Bus bus4 = new Bus("Nefaz", "196",
                10.5, 15, 105, 3, CapacityBus.EspeciallyBig, Type.BUS, Mechanic.mechanic2, Driver.driverD4);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Trucks trucks1 = new Trucks("Gaz", "66",
                    7.0f,18, 110, 4, TypeLoadCapacityTrucks.N1, Type.TRUCK, Mechanic.mechanic3, Driver.driverC1);
            Trucks trucks2 = new Trucks("Kamaz", "T45",
                    12.0f, 20, 100, 5, TypeLoadCapacityTrucks.N2, Type.TRUCK, Mechanic.mechanic3, Driver.driverC2);
            Trucks trucks3 = new Trucks("Volvo", "Z60",
                8.5f, 15, 115, 6, TypeLoadCapacityTrucks.N2, Type.TRUCK, Mechanic.mechanic3, Driver.driverC3);
            Trucks trucks4 = new Trucks("Ural", "66",
                        13.5f, 16, 108, 5, TypeLoadCapacityTrucks.N3, Type.TRUCK, Mechanic.mechanic3, Driver.driverC4);

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



