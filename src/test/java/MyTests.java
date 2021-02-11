import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class MyTests {

    @Test
    public void testInsertionSort() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, -5, -1, -3}));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 1, 4, 5, 3, 7}));
        assertEquals("[1, 2, 3, 4]", MyMain.insertionSort(list1).toString(), "The list [1, 2, 3, 4] when sorted should be: [1, 2, 3, 4]");
        assertEquals("[-5, -3, -1, 2]", MyMain.insertionSort(list2).toString(), "The list [2, -5, -1, -3] when sorted should be: [-5, -3, -1, 2]");
        assertEquals("[1, 1, 2, 3, 4, 5, 7]", MyMain.insertionSort(list3).toString(), "The list [1, 2, 1, 4, 5, 3, 7] when sorted should be: [1, 1, 2, 3, 4, 5, 7]");
    }

    @Test
    public void testMerge() {
        int[] arr1 = {1, 3, 4, 6};
        int[] arr2 = {2, 5, 7, 8};

        int[] arr3 = {-4, 5, 7, 8};
        int[] arr4 = {-5, -1, 2, 3};

        int[] arr5 = {1, 3, 4, 6, 10, 11, 15, 16};
        int[] arr6 = {2, 5, 7, 8, 9, 13, 20, 21};
        
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(MyMain.merge(arr1, arr2)), "The result of merging [1, 3, 4, 6] with [2, 5, 7, 8] should be: [1, 2, 3, 4, 5, 6, 7, 8]");
        assertEquals("[-5, -4, -1, 2, 3, 5, 7, 8]", Arrays.toString(MyMain.merge(arr3, arr4)), "The result of merging [-4, 5, 7, 8] with [-5, -1, 2, 3] should be: [-5, -4, -1, 2, 3, 5, 7, 8]");
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 20, 21]", Arrays.toString(MyMain.merge(arr5, arr6)), "The result of merging [1, 3, 4, 6, 10, 11, 15, 16] with [2, 5, 7, 8, 9, 13, 20, 21] should be: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 20, 21]");
    }

   
}
