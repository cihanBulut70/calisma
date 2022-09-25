package oopConcept.AccessModifier;

public class Test {

    public String herkese = "public degisken";
    protected String korumali = "protected degisken";
    String duz = "default degisken";
    private String gizli = "private degisken";




//    public Boolean getGizli() {
//        return false;
//    }

//    public Boolean setGizli(String gizli) {
//        this.gizli = gizli;
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Test{" +
//                "gizli='" + gizli + '\'' +
//                '}';
//    }


    public static void main(String[] args) {

        Test test = new Test();
        System.out.println("Erisebildigim degiskenler  :" + test.gizli + ", " + test.korumali + ", " + test.herkese + ", " + test.duz);

    }

}
