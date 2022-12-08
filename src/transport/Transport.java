package transport;

public class Transport {
    private String brand;
    private String model;
    final private int year;
    final private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color) {
        this(brand,model,year,country,color,0);
    }
    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            brand = "Lada";
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            model = "2109";
        }
        this.model = model;
    }
    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }  this.color = color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 150) {
            maxSpeed=150;
        }  this.maxSpeed = maxSpeed;
    }
}