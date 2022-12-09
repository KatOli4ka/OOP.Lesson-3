package Animal;

public class Flight extends Bird{
    private String movementType;

    public Flight(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty()) {
            movementType="летующий";
        }  this.movementType = movementType;
    }

    public void fly() {
        System.out.println("взмахиваю крыльями и взлетаю");
    }
    @Override
    public void hunt() {
        super.hunt();
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
        System.out.println("на крыльях");
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
                ", тип передвижения - "+getMovementType();
    }
}
