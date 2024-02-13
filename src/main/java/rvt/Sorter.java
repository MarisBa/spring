package rvt;

public class Sorter {
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        int indexOfSmallest = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = array[startIndex];
    
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }


    public static int[] swap(int[] array, int index1, int index2) {
            int x = array[index1]; // 5
            int y = array[index2]; // 3

            array[index1] = y;
            array[index2] = x;

            return array;

    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestFrom);
        }
        return array;
    }


}
    