package oopConcept.AccessModifier;

public class Erisim {

    public static void main(String[] args) {

        Test testObjesi= new Test();

        System.out.println("Erisebildigim Degiskenler : " +
                testObjesi.duz + ", " + testObjesi.herkese+ ", "+ testObjesi.korumali);
//baska paketten ulasma durumu icin baska paketten class acalim
    }
}
