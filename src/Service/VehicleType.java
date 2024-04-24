package Service;

abstract class VehicleType { // Абстрактный класс Транспортного средства
    protected String modelName; // Категория транспортного средства
    protected int wheelsCount; // Количество колес

    // Конструктор Транспортного средства
    protected VehicleType(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    // Метод для смены покрышки
    void checkTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    // Метод для проверки двигателя
    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    // Метод для проверки прицепа
    void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
