public class CategoryDriverD<T extends Bus> extends Driver {

    public CategoryDriverD(String nameDriver, Boolean presenceDriversLicense, int experience) {
        super(nameDriver, presenceDriversLicense, experience);
    }

//    @Override
//    public void startingMove() {
//        System.out.println("Водитель категории D " + getNameDriver() + "начал движение");
//    }
//    @Override
//    public void stopping() {
//        System.out.println("Водитель категории D " + getNameDriver() + "прекратил движение");
//    }
//    @Override
//    public void refuel() {
//        System.out.println("Водитель категории D " + getNameDriver() + " заправляет авто");
//    }
    public String getCarMessage(T bus) {
        return "NameDriver " + getNameDriver() + "is driving car " + bus.getBrand() + "will participate in race";
    }
}