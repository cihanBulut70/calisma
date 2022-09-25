package oopConcept.Inheritance;

public class Pen {

        private String color;
        private int height;
        void writeMessage(String message){
            System.out.println("Pen.writeMessage : " +message);

        }
        public String getColor(){
            return this.color;
        }
        public void setColor (String color) {

            if ("red".equals(color) || "blue".equals(color) || "black".equals(color)) {
                this.color = color; //burda biz mesela sadce 3 renge (kirmizi, mavi ve siyah) izin verelim.
            }else
                throw new IllegalArgumentException();  // Bunlarin disindakileri kabul etmesin
                //hatta hata firlatsin. Bunun icin bir ustteki if sartini yazalim.


            }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

