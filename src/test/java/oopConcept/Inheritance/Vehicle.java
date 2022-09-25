package oopConcept.Inheritance;

public class Vehicle implements Engine{

    int numberOfSeat;
    int numberOfWheels;

    public void start(){

        System.out.println("Arac calisiyor...");


    }

    @Override
    public void stop() {
        System.out.println("Vehicle.stop");
    }
}
