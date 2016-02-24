package lection_3_recursion;

import java.util.Arrays;


import static java.lang.Character.isDigit;
import static java.lang.Integer.valueOf;

public class lesson_3 {
    public static void main(String[] args) {

        //int arr[] = {1,2,3};
        //System.out.println(" 1+(5 - 2*(13/6)) = " + lesson_3.eval("1+(5-2*(12/6))"));
        //permute(arr, 3);
    }


    /**
     * Функция рекурсивного инвертирования массива.
     * @param data массив.
     * @param k текущий елемент.
     */

    public static void invert(int[] data, int k) {
        if(k < data.length / 2){
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invert(data, k + 1);
        }
    }

    /**
     * Числа Фибоначчи.
     * @param arg аргумент.
     * @return результат.
     */
    public static int fib(int arg) {
        if(arg == 0){
            return 1;
        } else if (arg == 1){
            return 1;
        } else{
            return fib(arg - 2) + fib(arg - 1);
        }
    }
    /**
     * Числа Фибоначчи c помощью тернарного оператора.
     * @param arg аргумент.
     * @return результат.
     */
    public static int fib2(int arg) {
            return arg < 2 ? 1 :  fib2(arg - 2) + fib2(arg - 1);
    }
    /**
     * Демонстрация рекурсии.
     * @param arg аргумент.
     */
    public static void f(int arg) {
        System.out.println(" " + arg);
        if(arg < 7){
            f(2 * arg);
        }
        System.out.println(" " + arg);
    }


    /**
     * Парсер...вычисляет выражения.
     * @param expr исходная строка.
     * @return
     */
    public static int eval(String expr) {
        if(expr.startsWith("(") && expr.endsWith(")")){
            return eval(expr.substring(1, expr.length() - 1));
        } else if (expr.startsWith("(") && !expr.endsWith(")")){
            throw  new RuntimeException("If expr start with '(')");
        } else {
            int pos = 0;
            while (pos < expr.length() - 1){
                if (isDigit(expr.charAt(pos))){
                    pos++;
                }else {
                    int leftOperand = valueOf(expr.substring(0,pos));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr.substring(pos + 1));
                    switch (operation) {
                        case '+': return leftOperand + rightOperand;
                        case '-': return leftOperand - rightOperand;
                        case '*': return leftOperand * rightOperand;
                        case '/': return leftOperand / rightOperand;
                    }
                }
            }
        }
        return  valueOf(expr);
    }

    /**
     * Перебирает все возможные комбинации.
     * @param arr начальный массив.
     * @param size размер.
     */
    public static void permute(int[] arr, int size) {
        if(size < 2){
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++){
                swap(arr, k, size-1);
                permute(arr, size - 1);
                swap(arr, k, size-1);
            }
        }

    }
    private static void swap(int[] arr,int index0, int index1){
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
