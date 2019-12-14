public class Car implements Printable {
    String brand;
    String model;
    String configuration;
    int price;
    int year;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getConfiguration() {
        return this.configuration;
    }

    public int getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    Car(String brand, String model, String configuration, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.configuration = configuration;
        this.price = price;
        this.year = year;
    }

    public void println() {
        System.out.println("Автомобиль марки: " + this.brand + " Модель: " + this.model + " Конфигурация: " + this.configuration + " Цена " + this.price + " Год выпуска:" + this.year);
    }
}