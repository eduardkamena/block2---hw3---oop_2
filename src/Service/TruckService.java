package Service;

public class TruckService extends VehicleType { // Класс Грузовик - наследник класса Транспортного средства

    // Конструктор класса - родителя
    public TruckService(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    // Переопределение абстрактного метода (собственная реализация) из класса VehicleType
    @Override
    public void check(VehicleType vehicleType) {
        Service.printServiceMessage(vehicleType);
        Service.checkTyres(vehicleType);
        Service.checkEngine();
        Service.checkTrailer();
    }

}
