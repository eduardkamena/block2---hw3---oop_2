package Service;

class Service { // Класс для общих методов

    // Метод сообщения об обслуживании
    static void printServiceMessage(VehicleType vehicleType) {
        System.out.println("Обслуживаем " + vehicleType.getModelName());
    }

    // Метод для проверки покрышек
    static void checkTyres(VehicleType vehicleType) {
        for (int i = 0; i < vehicleType.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    // Метод для проверки двигателя
    static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    // Метод для проверки прицепа
    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
