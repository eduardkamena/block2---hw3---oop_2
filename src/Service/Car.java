package Service;

public class Car extends VehicleType { // Класс Машина - наследник класса Транспортного средства

    // Конструктор класса - родителя
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
