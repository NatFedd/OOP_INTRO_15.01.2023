public abstract class Driver {
    private String nameDriver;
    private Boolean presenceDriversLicense;
    private int experience;

    public Driver(String nameDriver, int experience,Boolean presenceDriversLicense) {
        this.nameDriver = nameDriver; //имя водителя
        this.experience = experience; //опыт
        this.presenceDriversLicense = presenceDriversLicense; //наличие прав

    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public Boolean getPresenceDriversLicense() {
        return presenceDriversLicense;
    }

    public void setPresenceDriversLicense(Boolean presenceDriversLicense) {
        this.presenceDriversLicense = presenceDriversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public abstract void startingMove();
    public abstract void stopping();
    public abstract void refuel();
    static Driver driverB1 = new Driver("Vladimir", 5, true);
    static Driver driverB2 = new Driver("Aleksander", 2, true);
    static Driver driverB3 = new Driver("Dima", 5, true);
    static Driver driverB4 = new Driver("Alex", 2, true);
    static Driver driverC1 = new Driver("Pavel", 12, true);
    static Driver driverC2 = new Driver("Nikolay", 3, true);
    static Driver driverC3 = new Driver("Konstantin", 12, true);
    static Driver driverC4 = new Driver("Evgeniy", 3, true);
    static Driver driverD1 = new Driver("Vitaliy", 4, true);
    static Driver driverD2 = new Driver("Oleg", 7, true);
    static Driver driverD3 = new Driver("Stanislav", 4, true);
    static Driver driverD4 = new Driver("Andrey", 7, true);

    @Override
    public String toString() {
        return "Driver{" +
                "nameDriver='" + nameDriver + '\'' +
                ", presenceDriversLicense=" + presenceDriversLicense +
                ", experience=" + experience +
                '}';
    }
}