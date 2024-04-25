import Service.*;

public class Main {
    public static void main(String[] args) {

        // Инициализация объектов "Машина"
        CarService car = new CarService("car1", 4);
        CarService car2 = new CarService("car2", 4);

        // Инициализация объектов "Грузовик"
        TruckService truck = new TruckService("truck1", 6);
        TruckService truck2 = new TruckService("truck2", 8);

        // Инициализация объектов "Велосипед"
        BicycleService bicycle = new BicycleService("bicycle1", 2);
        BicycleService bicycle2 = new BicycleService("bicycle2", 2);

        // Вызов методов для
        car.check(car);
        car2.check(car2);
        bicycle.check(bicycle);
        bicycle2.check(bicycle2);
        truck.check(truck);
        truck2.check(truck2);
    }

}
