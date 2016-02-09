import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Сергей on 09.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount_Worms = in.nextInt();
        int number_Of_Matches = 1;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < amount_Worms; i++ ) {
            arr.add(i,1);
        }



        while(number_Of_Matches != 0) {
            number_Of_Matches = 0;
            for (int i = 0; i < arr.size(); i++)
                if ((i + 1) < (arr.size()) && arr.get(i) == arr.get(i + 1)) {
                    arr.set(i, (1 + arr.get(i + 1)));
                    arr.remove(i + 1);
                    number_Of_Matches++;
                }
        }

        for (int i = 0; i < arr.size(); i++ ) {
            System.out.println(arr.get(i));
        }


    }
}
