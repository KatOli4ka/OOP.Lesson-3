package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }
    @Override
    public String toString() {
        return this.getBrand() + " " + this.getModel() + ", " + this.getYear() + " года выпуска, сборка - " + this.getCountry() +
                ", макс.скорость - " + getMaxSpeed() + " км/ч,";
    }
}
