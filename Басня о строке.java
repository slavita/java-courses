import java.util.Scanner;

/**
 * Задача
 *Однажды Три Программиста придумали занятную игру для тренировки памяти и
 *умственных способностей. Первый Программист сочинил строку S из N символов
 *и сообщил её Второму и Третьему Программистам. Второй Программист произвёл
 *над этой строкой X (0 ≤ X < N) последовательных циклических сдвигов
 *(под циклическим сдвигом строки понимается перенос её последнего символа
 *в начало). В результате этих манипуляций получилась строка T, которую он
 *сообщил Третьему Программисту. Задачей Третьего Программиста было определить
 *число X, либо сообщить Второму Программисту, что он ошибся, поскольку
 *строка T не могла быть получена из строки S с помощью циклических сдвигов.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 0;
        int X = in.nextInt();
        String a = in.next();
        String b = in.next();
        char[] S = a.toCharArray();
        char[] T = b.toCharArray();

        for(int j = 0; j < S.length; j++ ){
            if(j == S.length-1  && !eq(S,T)) {
                count = -1;
                break;
            }
            shiftRight(T);
            count++;
            if(eq(S,T)) {
                break;
            }
        }

        System.out.println(count);
    }


    public static boolean eq(char[] T,char[] S) {
        boolean a = true;

        for (int i = 0; i < T.length; i++) {
            if (T[i] != S[i]) {
                a = false;
                break;

            }
        }
        return a;
    }


    public static char[] shiftRight(char[] arr) {
        char tmp = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length - 1] = tmp;
        return arr;
    }
}
