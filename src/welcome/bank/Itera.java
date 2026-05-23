package welcome.bank;

import java.util.ArrayList;
import java.util.Iterator;

public class Itera {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(500);
        numbers.add(600);
        numbers.add(200);
        numbers.add(300);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {

           

            if (it.next().equals(600))  {
                it.remove();
            } 
            
            
        }
        System.out.println(numbers);
    }
}
