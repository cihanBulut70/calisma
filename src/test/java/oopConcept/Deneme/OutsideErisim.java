package oopConcept.Deneme;

import oopConcept.AccessModifier.Test;

public class OutsideErisim extends Test{

    public static void main(String[] args) {

        Test test =new Test();
        System.out.println("Erisebildigim degiskenler  :" +test.herkese);
//        normalde accessMod paketindeki test clasindan ancak public olana ulasabildik.
//        Ancak biz bu klasi Test klasina extend ettigimizde protected accessModif'a ulastik, duz ve private yine ulasamadik.

    //   test.setGizli("Murat/Cihan");


       System.out.println(test.toString());
//
        OutsideErisim outsideErisim= new OutsideErisim();

        System.out.println("extend ettikten sonra erisebildigimiz degiskenler : "+outsideErisim.korumali +" ve "+ outsideErisim.herkese);


      
    }



    }

