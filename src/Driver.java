public abstract class Driver {
    private String nameDriver;
    private Boolean presenceDriversLicense;
    private int experience;

    public Driver(String nameDriver, Boolean presenceDriversLicense, int experience) {
        this.nameDriver = nameDriver;
        this.presenceDriversLicense = presenceDriversLicense;
        this.experience = experience;
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

}
