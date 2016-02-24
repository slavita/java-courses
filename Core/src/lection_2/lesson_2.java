package lection_2;


public class lesson_2 {

    public static void main(String[] args) {

    }

    /**
     * Сортировка вставками
     * @param arr
     */
    public static void sort(int[] arr){
        for (int barrier = 1; barrier < arr.length; barrier++){
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement){
                arr[location + 1] = arr[location];
                location--;
            }
        }

    }
}
