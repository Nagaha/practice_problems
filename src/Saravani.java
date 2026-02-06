import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Saravani
{
    public static void main(String[] args) {
        ArrayList<Integer> demo=new ArrayList();
        Set demo1=new HashSet();
        demo1.add(90);
        demo1.add(90);
        demo1.add(120);
        demo1.add(121);
        demo1.add(1202);
        demo1.add(129);
        demo1.add(125);
        System.out.println(demo1);
        demo.add(90);
        demo.add(100);
        demo.add(120);

        demo.add(90);

//        System.out.println(demo.get(2));


        System.out.println(demo.indexOf(90));
        demo.remove(0);
        System.out.println(demo);
        System.out.println("---------------------------------------------------");
        for(Object obj:demo){
            System.out.println(obj);
        }
    }
}
