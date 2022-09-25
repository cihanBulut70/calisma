package oopConcept.Inheritance;

import oopConcept.AccessModifier.Test;

public class Objectfactory {

    public static void main(String[] args) {

        Pen firstPen= new Pen(); // bir obje urettik
        firstPen.setColor("red");
        //firstPen.color= "Pink"; //bu objenin degiskenlerine degerler atadik, onceden atanmamisti.(
        firstPen.setHeight(10);
        String message= "Ilk kalem uretildi";

        firstPen.writeMessage(message);

        Pen secondPen= new Pen();
        secondPen.setColor("blue");
        secondPen.setHeight(8);
        secondPen.writeMessage("Ikinci kalem mesaji da; " +secondPen.getColor() +" "+ secondPen.getHeight());

        Car car = new Car();
        car.numberOfSeat= 5;
        car.numberOfWheels= 4;

        Bicycle bicycle=new Bicycle();
        bicycle.numberOfSeat= 1;
        bicycle.numberOfWheels= 2;

        //burada arabayi bir ust class olan vehicle adiyla da tanimlayabiliriz.

        Vehicle car2= new Car(); //yani her bir Car ayni zamanda bir Vehicle'dir....

        // bunun tersini yapamayiz. yani : Car car =new Vehicle(); yazamayiz hata verir.

        car2.start(); //car bir vehicle oldugu icin, onun interfaceden aldigi stop ve start fonk. almis oldu.
        car.start();

        //Bu arada Interface'den bir obje uretemeyiz:  Engin engine= new Engine();  ==> hata verir...

        bicycle.start();

        car2.start();





    }

}
