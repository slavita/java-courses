package lection_1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Сергей on 07.02.2016.
 */
public class lesson_1 {
    public static void main(String[] args) {

        int a = 4, b = 5;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(" a = " + a + " b = " + b);


        int[] c = {1, 7, 3, 8, 5};
        System.out.println(Arrays.toString(c));

        lesson_1.invertRecEnd(c,4);
        System.out.println(Arrays.toString(c));



        for (int i = 0; i < c.length; i++){
            for (int j = i; j < c.length - 1; j++){
                conditionalSwap(c,j,j+1);
            }
        }
            System.out.println(Arrays.toString(c));

    }

    public static void invert(int[] data){
        for (int k = 0;k < data.length / 2; k++ ){
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
    }
    public static void invertRec(int[] data, int k){
        if(k < data.length / 2 - 1){
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRec(data, k + 1);
        }
    }
    public static void invertRecEnd(int[] data, int k){
        if(k - data.length / 2  >= 0){
            int tmp = data[k];
            data[k] = data[data.length  - k - 1];
            data[data.length  - k - 1] = tmp;
            invertRecEnd(data, k - 1);
        }
    }
    public static void conditionalSwap(int[] data, int fst, int snd){
        if(data[fst] > data[snd]){
            int tmp = data[fst];
            data[fst] = data[snd];
            data[snd] = tmp;
        }
    }
}
