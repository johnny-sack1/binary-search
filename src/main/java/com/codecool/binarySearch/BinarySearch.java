package com.codecool.binarySearch;

public class BinarySearch {
    public boolean search(int[] array, int searchedValue) {
        int lowerBound = 0;
        int upperBound = array.length - 1;

        while (true) {
            if (upperBound < lowerBound) {
                return false;
            }

            int middle = lowerBound + (upperBound - lowerBound) / 2;

            if (array[middle] < searchedValue) {
                lowerBound = middle + 1;
            }
            if (array[middle] > searchedValue) {
                upperBound = middle - 1;
            }
            if (array[middle] == searchedValue) {
                return true;
            }
        }
    }
}
