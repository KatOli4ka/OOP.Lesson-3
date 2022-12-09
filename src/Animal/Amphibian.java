package Animal;

public  class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String name, int year, String livingEnvironment) {
        super(name, year);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment==null||livingEnvironment.isEmpty()) {
            livingEnvironment = " земля/суша";
        }this.livingEnvironment = livingEnvironment;
    }
    public void hunt() {
        System.out.println("Выжидаю свою добычу и хватаю");
    }

    @Override
    public void eat() {
        System.out.println("широко открываю рот и заглатываю всю пищу целиком");
    }

    @Override
    public void sleep() {
        System.out.println("могу проспать несколько месяцев");
    }

    @Override
    public void go() {
        System.out.println("не спеша");
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
        return "Класс - "+getClass()+", животное - " + getName() + ", кол-во лет - " + getYear()+", среда обитания - "+getLivingEnvironment();
    }
}
