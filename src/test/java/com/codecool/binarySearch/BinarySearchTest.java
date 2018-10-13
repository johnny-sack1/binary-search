package com.codecool.binarySearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    @Test
    void searchIfPresentTest() {
        BinarySearch finder = new BinarySearch();
        int data[] = {10, 20, 31, 44, 47, 58, 99, 113, 119, 222};
        assertTrue(finder.search(data, 113));
    }

    @Test
    void searchIfAbsentTest() {
        BinarySearch finder = new BinarySearch();
        int data[] = {10, 20, 31, 44, 47, 58, 99, 113, 119, 222};
        assertFalse(finder.search(data, 98));
    }
}
