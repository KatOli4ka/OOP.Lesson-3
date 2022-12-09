package Animal;

public abstract class Mammal extends Animal{
    public String livingEnvironment;
    public double speed;

    public Mammal(String name, int year, String livingEnvironment, double speed) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment==null||livingEnvironment.isEmpty()) {
            livingEnvironment = " на суше";
        }this.livingEnvironment = livingEnvironment;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed>=0){
            this.speed = speed;
        } speed=Math.abs(speed);
    }
    public void walk() {
        System.out.println("прогуливаюсь не спеша");
    }
    @Override
    public void eat() {
        System.out.println("жую силос");
    }

    @Override
    public void sleep() {
        System.out.println("ложусь спать");

    }

    @Override
    public void go() {
        System.out.println("хожу на 4 копытах");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", кол-во лет - " + getYear()+", среда обитания - "+getLivingEnvironment()+
                ", скорость передвижения - "+getSpeed();
    }
}
