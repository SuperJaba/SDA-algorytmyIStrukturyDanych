package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */


public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 8};
        int[] sortedArray = bubbleSort.ascSort(array);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(bubbleSort.descSort(array)));
    }


    public int[] ascSort(int[] array) {
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(count);
        return array;
    }

    public int[] descSort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

}


