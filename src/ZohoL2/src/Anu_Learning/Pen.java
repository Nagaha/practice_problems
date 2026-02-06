package ZohoL2.src.Anu_Learning;

public class Pen {
    String color;
    String brand;
    String inkColor;
    String penType;
    int wordsPerRefill;


//    Pen(String color, String brand, String inkColor, String penType, int wordsPerRefill){
//
//
//    }


    void write(){
        System.out.println("The pen is writing");
    }
    void play(){
        System.out.println("We are playing games with the pen");
    }
    void bite(){
        System.out.println("The pen is damaged");
    }

    public int add(int a,int b){
      return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", penType='" + penType + '\'' +
                ", wordsPerRefill=" + wordsPerRefill +
                '}';
    }
}

class Pencil extends Pen {
    String name;
    public int add(int a,int b, int c){
        System.out.println(b);
        return a+c;
    }
}
/**
 * tempelate
 * Class - Color, brand , ink color , type_of_pen, -> attribute(properties)
 *         write() , draw() , play(),throw(), bite() -> behaviours
 *
 * Object -> color - white
 *           brand - shine
 * ink -blue..... naga's object
 *                Harish's pen*/