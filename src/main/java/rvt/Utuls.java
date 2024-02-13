package rvt;

public class Utuls {
    // assuming the variable searched exists
    // assuming the variable list exists
    public static int binarySearch(int[] array, int searchedValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int middle = (startIndex + endIndex) / 2;

            if (array[middle] == searchedValue) {
                return middle;
            } else if (array[middle] < searchedValue) {
                startIndex = middle + 1;
            } else {
                endIndex = middle - 1;
            }
        }

        return -1; 
    }
}
