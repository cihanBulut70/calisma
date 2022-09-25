package oopConcept.OverloadingOverriding;

    public class UygulamaOverLoading {

    public static void main(String[] args) {
        toplama(3,5);
        toplama("4", 3);
        toplama(3,5,6);

        Dog doggy = new Dog();
        System.out.println(doggy.hareket());// Kosarim geldi..
        Snake snake =new Snake();
        System.out.println(snake.hareket());//Hareket ederim
                                            // snake de hareket metodu olmadigi icin atasindaki  hareket metodunu kullandi.

        }
        public static int toplama (int a, int b){
            return a+b;
        }
        public static int toplama (int a, int b, int c) {

        return a+b+c;
        }
    public static int toplama (String x, int y) { // eger ikisi de int olsaydi hata verirdi, cunku 2 tane int parametre olan var.
                                                //Dolayisiyla ayni sayida parametre olsa bile birinin arguman tipi farkli ise yeterlidir.
        return 0;
    }       // simdi bu uc metodu yukarda main icinde cagiralim.
}
    class Animal{
        public String hareket (){
            return "Hareket ederim";
        }
    }
    class Dog extends Animal {
        public String hareket() {
            return "Kosarim";// hersey Animal klasin metodu ile ayni, onu extend ettigi icin onun sahip oldugu metodlara sahip olur dusturuna
                            // gore, sadece icerigi ozgelestirilmis, Java iki tane Hareket metodu goruyor ama biliyor ki biz onu OverRide ettik
                            // o ne denle bizim kendi metodumuzu cagiracak.
                            //Yukarda mainde, obje olustururarak cagirip test edebiliriz.
        }
    }
    class Snake extends Animal{

    }
