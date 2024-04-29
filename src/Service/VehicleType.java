package Service;

public abstract class VehicleType { // Абстрактный класс Транспортного средства
    private final String modelName; // Категория транспортного средства
    private final int wheelsCount; // Количество колес

    // Конструктор Транспортного средства
    VehicleType(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    // Геттеры
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // Абстрактный метод по обслуживанию для реализации в классах-потомках
    public abstract void check(VehicleType vehicleType);

}
