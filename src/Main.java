import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1. Задание 1");
        Car lada = new Car(
                "Granta", "Lada",2015,"Россия", "", 170, 1.7,
                "","седан", "ю122юю122", 5,true,null,null);
        System.out.println(lada.toString());
        Car audi = new Car("", "Audi", 2020, "Германия", "черный",190, 3.0,
                "", "", "45", 7, false,null,null);
        System.out.println(audi.toString());
        Car bmw = new Car("Z8", "BMW", 2021, "Германия", "черный", 245,0,
                "автомат", "", "125369874", 2, true,null,null);
        System.out.println(bmw.toString());
        Car kia = new Car("Sportage 4-го поколения", "Kia", 2018, "Южная Корея", "",210,
                2, "автомат", "седан", "д123д123д", 4, false,null,null);
        System.out.println(kia.toString());
        Car hyundai = new Car("Avante", "Hyundai", 2015, "Южная Корея", "оранжевый",198,
                1.6, "", "седан", "э123ээ111", 6, true,null,null);
        System.out.println(hyundai.toString());

        System.out.println();
        System.out.println("ДЗ-1. Задание 2");

        Train martin=new Train("Ласточка", "В-901",2011,"Россия","",301,
                3500,6.5,"Белорусский вокзал","Минск-Пассажирский",11);
        Train leningrad=new Train("Ленинград", "D-125",2019,"Россия","",270,
                1700,7.5,"Ленинградский вокзал","Ленинград-Пассажирский",
                8);
        System.out.println(martin.toString());
        System.out.println(leningrad.toString());



    }
}