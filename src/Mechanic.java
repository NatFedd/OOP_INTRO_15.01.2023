public class Mechanic {
    private String nameMechanic;
    private String surnameMechanic;
    private String companyMechanic;
    private String transportType;

    public Mechanic(String nameMechanic, String surnameMechanic, String companyMechanic, String transportType) {
        this.nameMechanic = nameMechanic;
        this.surnameMechanic = surnameMechanic;
        this.companyMechanic = companyMechanic;
        this.transportType = transportType;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getSurnameMechanic() {
        return surnameMechanic;
    }

    public void setSurnameMechanic(String surnameMechanic) {
        this.surnameMechanic = surnameMechanic;
    }

    public String getCompanyMechanic() {
        return companyMechanic;
    }

    public void setCompanyMechanic(String companyMechanic) {
        this.companyMechanic = companyMechanic;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public void performMaintenance() //провести техобслуживание
    {
        System.out.println(getNameMechanic() + getSurnameMechanic() +" из компании " + getCompanyMechanic() + " проводит техобслуживание");;
    }

    public void fixMachine() //метод починить машину
    {
        System.out.println(getNameMechanic() + getSurnameMechanic() +" из компании " + getCompanyMechanic() + " чинит автомобиль");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + nameMechanic + '\'' +
                "surname='" + surnameMechanic + '\'' +
                ", company='" + companyMechanic + '\'' +
                ", transportType='" + transportType + '\'' +
                '}';
    }
    static Mechanic mechanic1 = new Mechanic("Max", "Soloviev", "CarBox", "PassengerCars");
    static Mechanic mechanic2 = new Mechanic("Sergey", "Ivanov", "Mashinery", "Bus");
    static Mechanic mechanic3 = new Mechanic("Sasha", "Pavlov", "Machinery", "Truck");


}