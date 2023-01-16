//Задание 1.
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Car1 car1 = new Car1();

        car1.setBrand("Lada");
        car1.setModel("Granta");
        car1.setEngineVolume(1.7f);
        car1.setColor("yellow");
        car1.setYear(2015);
        car1.setCountry("Russia");

        Car1 car2 = new Car1();
        car2.setBrand("Audi");
        car2.setModel("A8_50_L_TDI_quattro");
        car2.setEngineVolume(3.0f);
        car2.setColor("black");
        car2.setYear(2020);
        car2.setCountry("Germany");

        Car1 car3 = new Car1();
        car3.setBrand("BMW");
        car3.setModel("Z8");
        car3.setEngineVolume(3.0f);
        car3.setColor("black");
        car3.setYear(2021);
        car3.setCountry("Germany");

        Car1 car4 = new Car1();
        car4.setBrand("Kia");
        car4.setModel("Sportage_4_generation");
        car4.setEngineVolume(2.4f);
        car4.setColor("red");
        car4.setYear(2018);
        car4.setCountry("SouthKorea");

        Car1 car5 = new Car1();
        car5.setBrand("Hyundai");
        car5.setModel("Avante");
        car5.setEngineVolume(1.6f);
        car5.setColor("orange");
        car5.setYear(2016);
        car5.setCountry("SouthKorea");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
