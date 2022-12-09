package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }

    @Override
    public String toString() {
        return this.getBrand() + " " + this.getModel() + ", " + this.getYear() + " года выпуска, сборка - " + this.getCountry() +
                ", макс.скорость - " + getMaxSpeed() + " км/ч; кол-во топлива в % - "+getFuelPercentage();
    }
}
