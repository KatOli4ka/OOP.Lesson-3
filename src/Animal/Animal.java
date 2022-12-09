package Animal;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int year;

    public Animal(String name, int year) {
        setName(name);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name==null||name.isEmpty()){
            name="Животное";
        }  this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            year = Math.abs(year) ;
        }  this.year = year ;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return year == animal.year && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Животное - " + getName() + ", кол-во лет - " + getYear();
    }
}
