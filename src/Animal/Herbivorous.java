package Animal;

public class Herbivorous extends Mammal{
    private String food;

    public Herbivorous(String name, int year, String livingEnvironment, double speed, String food) {
        super(name, year, livingEnvironment, speed);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (food == null || food.isEmpty()) {
            food="трава";
        }  this.food = food;
    }

    public void graze() {
        System.out.println("дотянулась до травы и откусила ее");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        super.go();
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
        return "Класс - "+getClass()+", животное - " + getName() + ", кол-во лет - " + getYear()+", среда обитания - "+getLivingEnvironment()+
                ", скорость передвижения - "+getSpeed()+", пища - "+getFood();
    }
}
