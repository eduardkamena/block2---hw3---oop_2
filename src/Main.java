import Service.ServiceStation;
import Service.Bicycle;
import Service.Car;
import Service.Truck;

public class Main {
    public static void main(String[] args) {

        // Инициализация объектов "Машина"
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        // Инициализация объектов "Грузовик"
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        // Инициализация объектов "Велосипед"
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        // Создание экземпляра класса
        ServiceStation station = new ServiceStation();

        // Вызов методов из класса Обслуживания созданных объектов
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }

}
