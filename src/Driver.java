public class Driver {
    private String nameDriver;
    private Boolean presenceDriversLicense;
    private int experience;

    public Driver(String nameDriver,Boolean presenceDriversLicense, int experience) {
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
    static Driver driverB1 = new Driver("Vladimir", true, 5);
    static Driver driverB2 = new Driver("Aleksander", true, 2);
    static Driver driverB3 = new Driver("Dima", true, 5);
    static Driver driverB4 = new Driver("Alex", true, 2);
    static Driver driverC1 = new Driver("Pavel", true, 12);
    static Driver driverC2 = new Driver("Nikolay", true, 3);
    static Driver driverC3 = new Driver("Konstantin", true, 12);
    static Driver driverC4 = new Driver("Evgeniy", true, 3);
    static Driver driverD1 = new Driver("Vitaliy", true, 4);
    static Driver driverD2 = new Driver("Oleg", true, 7);
    static Driver driverD3 = new Driver("Stanislav", true, 4);
    static Driver driverD4 = new Driver("Andrey", true, 7);

    @Override
    public String toString() {
        return "Driver{" +
                "nameDriver='" + nameDriver + '\'' +
                ", presenceDriversLicense=" + presenceDriversLicense +
                ", experience=" + experience +
                '}';
    }
}