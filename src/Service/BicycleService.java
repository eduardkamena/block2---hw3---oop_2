package Service;

public class BicycleService extends VehicleType { // Класс Велосипед - наследник класса Транспортного средства

    // Конструктор класса - родителя
    public BicycleService(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    // Переопределение абстрактного метода (собственная реализация) из класса VehicleType
    @Override
    public void check(VehicleType vehicleType) {
        Service.printServiceMessage(vehicleType);
        Service.checkTyres(vehicleType);
    }

}
