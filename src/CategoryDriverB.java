public class CategoryDriverB<T extends PassengerCars> extends Driver {

    public CategoryDriverB(String nameDriver, Boolean presenceDriversLicense, int experience) {
        super(nameDriver, presenceDriversLicense, experience);
    }

    @Override
    public void startingMove() {
        System.out.println("Водитель категории В " + getNameDriver() + "начал движение");
    }
    @Override
    public void stopping() {
        System.out.println("Водитель категории В " + getNameDriver() + "прекратил движение");
    }
    @Override
    public void refuel() {
        System.out.println("Водитель категории B " + getNameDriver() + " заправляет авто");
    }
}