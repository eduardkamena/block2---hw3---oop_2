package Service;

public class ServiceStation { // Класс Обслуживания (без конструктора)

    // Метод для обслуживания Велосипеда
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.modelName);
        bicycle.checkTyres();

    }

    // Метод для обслуживания Машины
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.modelName);
        car.checkTyres();
        car.checkEngine();
    }

    // Метод для обслуживания Грузовика
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.modelName);
        truck.checkTyres();
        truck.checkEngine();
        truck.checkTrailer();
    }

}
