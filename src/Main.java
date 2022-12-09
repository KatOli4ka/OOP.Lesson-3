import Animal.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1. Задание 1");
        Car lada = new Car(
                "Granta", "Lada",2015,"Россия", "", 170,54,
                1.7,"","седан", "ю122юю122", 5,
                true,null,null);
        System.out.println(lada.toString());
        System.out.print("*** ");
        lada.refill();
        Car audi = new Car("", "Audi", 2020, "Германия", "черный",190,
                78.1,3.0,"", "", "45", 7,
                false,null,null);
        System.out.println(audi.toString());
        System.out.print("*** ");
        audi.refill();
        Car bmw = new Car("Z8", "BMW", 2021, "Германия", "черный", 245,
                98,0,"автомат", "", "125369874",
                2, true,null,null);
        System.out.println(bmw.toString());
        System.out.print("*** ");
        bmw.refill();
        Car kia = new Car("Sportage 4-го поколения", "Kia", 2018, "Южная Корея",
                "",210,62,2, "автомат", "седан",
                "д123д123д", 4, false,null,null);
        System.out.println(kia.toString());
        System.out.print("*** ");
        kia.refill();
        Car hyundai = new Car("Avante", "Hyundai", 2015, "Южная Корея",
                "оранжевый",198,56.8,1.6, "", "седан",
                "э123ээ111", 6, true,null,null);
        System.out.println(hyundai.toString());
        System.out.print("*** ");
        hyundai.refill();

        System.out.println();
        System.out.println("ДЗ-1. Задание 2");

        Train martin=new Train("Ласточка", "В-901",2011,"Россия","",
                301,74.0,3500,6.5,"Белорусский вокзал",
                "Минск-Пассажирский",11);
        Train leningrad=new Train("Ленинград", "D-125",2019,"Россия","",
                270,81.7,1700,7.5,"Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);
        System.out.println(martin.toString());
        System.out.print("*** ");
        martin.refill();
        System.out.println(leningrad.toString());
        System.out.print("*** ");
        leningrad.refill();

        System.out.println();
        System.out.println("ДЗ-1. Задание 3");
        Bus liaz=new Bus("ЛиАЗ", "5256",2001,"Россия","разноцветный",
                90,55.7);
        Bus ikarus=new Bus("Ikarus", "280",1987,"Венгрия","красный",
                70,59.8);
        Bus paz=new Bus("ПАЗ","",1998,"Россия","",65,0);
        System.out.println(liaz.toString());
        System.out.print("*** ");
        liaz.refill();
        System.out.println(ikarus.toString());
        System.out.print("*** ");
        ikarus.refill();
        System.out.println(paz.toString());
        System.out.print("*** ");
        paz.refill();
        System.out.println();
        System.out.println("Задание 3");
        Herbivorous gazelle=new Herbivorous("газель", 6,"полупустыня",115,"трава");
        Herbivorous gazelle1=new Herbivorous("газель", 6,"полупустыня",115,"трава");
        Herbivorous giraff=new Herbivorous("жираф",2,"тропические степи",-55,"листва");
        Herbivorous horse=new Herbivorous("лошадь",3,"степи",60,"силос");
        Predator hyena=new Predator("гиена",3,"полустепи",60,"падаль");
        Predator tiger=new Predator("тигр",-9,"во многих местах",65,"мясо");
        Predator bear=new Predator("медведь",15,"встречается во многих местах", 50,"трава и мясо");
        Amphibian frog=new Amphibian("лягушка",1,"водоём");
        Amphibian grassSnake=new Amphibian("уж обыкновенный",-1,"степи");
        Flightless peacock=new Flightless("павлин",3,"саванна","не летает");
        Flightless penguin=new Flightless("пингвин",11,"Антарктида","");
        Flightless dodo=new Flightless("птица Додо",0,"вымерла","");
        Flight seagull=new Flight("чайка", 3,"","летает");
        Flight albatross=new Flight("альбатрос",6,"Антарктида","");
        Flight falcon=new Flight("сокол",8,"","летает");

        System.out.println(gazelle.toString());
        System.out.println(gazelle.equals(gazelle1));
        System.out.println(giraff.toString());
        System.out.println(falcon.equals(dodo));
        System.out.println(horse.toString());
        System.out.println(grassSnake.toString());
        System.out.println(frog.toString());
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(dodo.toString());
        System.out.println(seagull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());

    }

}