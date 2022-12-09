package Animal;

public class Flightless extends Bird{
    private String movementType;

    public Flightless(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty()) {
            movementType="нелетующий";
        }  this.movementType = movementType;
    }

    public void walking() {

    }

    @Override
    public void hunt() {
        System.out.println("Ищут добыч и хватаю ее");
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
                ", тип передвижения - "+getMovementType();
    }
}
