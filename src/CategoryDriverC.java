public class CategoryDriverC<T extends Trucks> extends Driver {

    public CategoryDriverC(String nameDriver, Boolean presenceDriversLicense, int experience) {
        super(nameDriver, presenceDriversLicense, experience);
    }

    @Override
    public void startingMove() {
        System.out.println("Водитель категории C " + getNameDriver() + "начал движение");
    }
    @Override
    public void stopping() {
        System.out.println("Водитель категории C " + getNameDriver() + "прекратил движение");
    }
    @Override
    public void refuel() {
        System.out.println("Водитель категории C " + getNameDriver() + " заправляет авто");
    }
}