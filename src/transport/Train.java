package transport;

public class Train extends Transport{
    private double priceTrip;
    private double timeTrip;
    final private String depStationName;
    final private String endStation;
    final private int wagonNum;

    public Train(String brand, String model, int year, String country, String color,int maxSpeed,
                double fuelPercentage,double priceTrip,
                 double timeTrip, String depStationName, String endStation, int wagonNum) {
        super(brand, model, year, country, color,maxSpeed,fuelPercentage);
        setPriceTrip(priceTrip);
        setTimeTrip(timeTrip);
        this.depStationName = depStationName;
        this.endStation = endStation;
        this.wagonNum = wagonNum;
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        if (priceTrip >= 6789) {
            priceTrip= Double.parseDouble("На карте недостаточно средств");
        }  this.priceTrip = priceTrip;
    }

    public double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(double timeTrip) {
        if (timeTrip >= 11) {
            timeTrip= Double.parseDouble("Слишком долго в пути. Поменяй маршрут");
        }  this.timeTrip = timeTrip;
    }

    public String getDepStationName() {
        return depStationName;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getWagonNum() {
        return wagonNum;
    }

    @Override
    public String toString() {
        return this.getBrand()+ " "+this.getModel()+", "+this.getYear()+" года выпуска, сборка - "+this.getCountry()+
                ", макс.скорость - "+getMaxSpeed()+" км/ч, кол-во топлива в % - "+getFuelPercentage()+
                ", цена билета - "+ priceTrip +", время в пути - " + timeTrip
                +", станция отправления - " + depStationName + ", станция назначения - " + endStation +
                ", кол-во вагонов - " + wagonNum;
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }
}
