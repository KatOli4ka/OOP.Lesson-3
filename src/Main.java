import transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1. Задание 1");
        Car lada = new Car(
                "Granta", "Lada",2015,"Россия", "",  1.7,
                "","седан", "ю122юю122", 5,true,null,null);
        System.out.println(lada.toString());
        Car audi = new Car("", "Audi", 2020, "Германия", "черный", 3.0,
                "", "", "45", 7, false,null,null);
        System.out.println(audi.toString());
        Car bmw = new Car("Z8", "BMW", 2021, "Германия", "черный", 0,
                "автомат", "", "125369874", 2, true,null,null);
        System.out.println(bmw.toString());
        Car kia = new Car("Sportage 4-го поколения", "Kia", 2018, "Южная Корея", "",
                2, "автомат", "седан", "д123д123д", 4, false,null,null);
        System.out.println(kia.toString());
        Car hyundai = new Car("Avante", "Hyundai", 0, "Южная Корея", "оранжевый",
                1.6, "", "седан", "э123ээ111", 6, true,null,null);
        System.out.println(hyundai.toString());

    }
}