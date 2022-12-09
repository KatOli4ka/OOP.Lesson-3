package Animal;

public abstract class Bird extends Animal{
    public String livingEnvironment;

    public Bird(String name, int year, String livingEnvironment) {
        super(name, year);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment==null||livingEnvironment.isEmpty()) {
            livingEnvironment = " везде";
        }this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {
        System.out.println("Высматриваю добычу и пикирую к ней");
    }

    @Override
    public void eat() {
        System.out.println("клюю");
    }

    @Override
    public void sleep() {
        System.out.println("закрываю глаза и засыпаю");
    }

    @Override
    public void go() {
        System.out.println("на лапах");
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
        return "Животное - " + getName() + ", кол-во лет - " + getYear()+", среда обитания - "+getLivingEnvironment();
    }
}
