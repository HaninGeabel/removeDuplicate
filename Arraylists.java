
/**
 * Arraylists - Write a description here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Standard import for the Scanner class
import java.util.*;
import java.util.ArrayList;
public class Arraylists {
    public static void main (String [] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner (System.in);
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }
        removeDuplicate(list);
         System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }       
    }
}
    

