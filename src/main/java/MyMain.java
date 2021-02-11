import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int input = 0; input < list.size(); input ++){ //keeps track of the original ArrayList
            if (input == 0){
                output.add(list.get(input));
            }
            else {
                for (int j = 0; j < output.size(); j++){ // keeps track of our new ArrayList
                    if (list.get(input) < output.get(j)){
                        output.add(j, list.get(input)); // add our input to the ArrayList while it is not greater than the # next to it
                        break;
                    }
                }
                if (output.size() == input){
                    output.add(list.get(input));
                }
            }
        }
        return output;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] output = new int[arr1.length + arr2.length];
        int idx1 = 0; // index of arr1
        int idx2 = 0; // index of arr2
        int outputIndex = 0;

        while (idx1 < arr1.length && idx2 < arr2.length){
            if (arr1[idx1] < arr2[idx2]){
                output[outputIndex] = arr1[idx1];
                outputIndex++;
                idx1++;
            }
            else {
                output[outputIndex] = arr2[idx2];
                outputIndex++;
                idx2++;
            }
        }

            while (idx1 < arr1.length){ // if all the values of arr2 have been moved, move the rest of arr1
               output[outputIndex] = arr1[idx1];
                outputIndex++;
                idx1++; 
            }
            while (idx2 < arr2.length){ // if all the values of arr1 have been moved, move the rest of arr2
               output[outputIndex] = arr2[idx2];
                outputIndex++;
                idx2++; 
            }
        return output;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1); test.add(15); test.add(7); test.add(20); test.add(23); test.add(10); test.add(3);
        System.out.println(insertionSort(test));
        int[] arr1 = {0, 2, 6, 9};
        int[] arr2 = {3, 4, 17, 20};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
