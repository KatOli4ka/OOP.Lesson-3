package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    final private String bodyType;
    final private String regNumber;
    private int seatsCount;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;

    public Car(String model,String brand,int year,String country,String color,int maxSpeed,
               double engineVolume, String transmission, String bodyType, String regNumber,
               int seatsCount, boolean summerTires, Key key, Insurance insurance){
        super(brand,model,year,country,color,maxSpeed);
        setTransmission(transmission);
        setEngineVolume(engineVolume);
        if (bodyType == null|| bodyType.isEmpty()){
            bodyType="купе";
        }   this.bodyType = bodyType;
        if (regNumber == null|| regNumber.isEmpty()){
            regNumber= "х000хх000";
        }   this.regNumber=regNumber;
        setSeatsCount(seatsCount);
        this.summerTires=summerTires;
        setKey(null);
        setInsurance(null);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }  this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance(null, 9800, null);
        }  this.insurance = insurance;
    }

    public void setSeatsCount(int seatsCount) {
        if (seatsCount <=0) {
            seatsCount = 4;
        }  this.seatsCount = seatsCount;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <=0){
            engineVolume=1.5;
        }  this.engineVolume = engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null|| transmission.isEmpty()) {
            transmission = "механическая";
        }  this.transmission = transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public int getSeatsCount() {
        return seatsCount;
    }
    public boolean isSummerTires() {
        return summerTires;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public void changeTires() {
        setSummerTires(!summerTires);
    }
    public boolean isCorrectRegNumber() {
        return regNumber.length()==9&&Character.isLetter(regNumber.charAt(0))&&Character.isLetter(regNumber.charAt(4))&&
                Character.isLetter(regNumber.charAt(5))&&Character.isDigit(regNumber.charAt(1))&&
                Character.isDigit(regNumber.charAt(2))&&Character.isDigit(regNumber.charAt(3))&&
                Character.isDigit(regNumber.charAt(6))&&Character.isDigit(regNumber.charAt(7))&&
                Character.isDigit(regNumber.charAt(8));
    }
    public String toString() {
        return this.getBrand()+ " "+this.getModel()+", "+this.getYear()+" года выпуска, сборка - "+this.getCountry()+
                ", цвет кузова- "+this.getColor()+", макс.скорость - "+getMaxSpeed()+" км/ч, объем двигателя - "+this.engineVolume+
                ", коробка передач -"+getTransmission()+",тип кузова - "+getBodyType()+
                ", регистрационный номер - "+isCorrectRegNumber()+", количество мест - "+getSeatsCount()+
                ", тип резины - "+summerTires+key+insurance;
    }
    public static class Key {
        final private boolean remoteEngineStart;
        final private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return ". Ключ: " +
                    "удаленный доступ двигателя = " + remoteEngineStart +
                    ", бесключевой доступ = " + keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validity;
        private final int cost;
        private final String number;

        public Insurance(LocalDate validity, int cost, String number) {
            if (validity == null) {
                validity = LocalDate.now().plusDays(365);
            }  this.validity = validity;
            if (cost <=0) {
                cost=10000;
            }  this.cost = cost;
            if (number == null || number.isEmpty()) {
                number="q1q1q1q1q1";
            }  this.number = number;

        }

        public void printCheckExpiredValidity() {
            boolean ExpiredValidity= validity.isAfter(LocalDate.now());
            if (ExpiredValidity){
                System.out.println("Срок действия страховки истек. Оформите новую.");
            }
        }
        public void printCheckNumber() {
            boolean correct=number.length()==10;
            if(!correct){
                System.out.println("Номер страховки некорекктный!");
            }
        }
        public LocalDate getValidity() {
            return validity;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return ". Страховка: " +
                    "срок действия = " + validity +
                    ", стоимость = " + cost +
                    ", номер ='" + number + '\'';
        }
    }
}


