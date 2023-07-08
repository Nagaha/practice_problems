/*
Output:-
{Biting_Power=23.4, name='Hyena'}
        {Biting_Power=29.21, name='Wild dog'}
        {Biting_Power=69.004, name='Tiger'}
        {Biting_Power=72.6, name='Lion'}
*/
//This code implements a comparable interface for sorting the classes which are user defined.
import java.util.*;
class  Animals implements Comparable<Animals>{
    double Biting_Power=0.0;
    String name="";

    public String toString() {
        return '{' +
                "Biting_Power=" + Biting_Power +
                ", name='" + name + '\'' +
                '}';
    }
    public Animals(double biting_Power, String name) {
        Biting_Power = biting_Power;
        this.name = name;
    }
    public int compareTo(Animals that) {
        if(this.Biting_Power>that.Biting_Power){
            return 1;
        }
        else
            return -1;

    }
}
public class CollectionsDemo {
public static void main(String args[]){
    List<Animals> AnimalList=new ArrayList<>();
    AnimalList.add(new Animals(23.4,"Hyena"));
    AnimalList.add(new Animals(72.6,"Lion"));
    AnimalList.add(new Animals(29.21,"Wild dog"));
    AnimalList.add(new Animals(69.004,"Tiger"));
    Collections.sort(AnimalList);
    for(Animals a:AnimalList)
     System.out.println(a);
}
}
