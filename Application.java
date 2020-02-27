import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        BubbleSort BS = new BubbleSort();
        int array1[] = {64, 34, 25, 12, 22, 11, 90};
        BS.bubbleSort(array1);
        BS.printArray(array1);
        
        QuickSort QS = new QuickSort();
        int array2[]  = {10, 36, 9, 15, 7, 18};
        QuickSort.quickSort(array2, 0, array2.length-1);
        System.out.println(Arrays.toString(array2));
    }


}
