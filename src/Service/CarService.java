package Service;

public class CarService extends VehicleType { // Класс Машина - наследник класса Транспортного средства

    // Конструктор класса - родителя
    public CarService(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    // Переопределение абстрактного метода (собственная реализация) из класса VehicleType
    @Override
    public void check(VehicleType vehicleType) {
        Service.printServiceMessage(vehicleType);
        Service.checkTyres(vehicleType);
        Service.checkEngine();
    }

}
