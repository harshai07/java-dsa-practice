import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);
//        list.add(44);
//        list.add(22);
//        list.add(33);
//        list.add(67);
//        list.add(88);
//        System.out.println(list.contains(22));
//        System.out.println(list);
        //input
        for (int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        //output
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}
