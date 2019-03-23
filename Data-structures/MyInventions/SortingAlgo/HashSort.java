import java.util.*;
class HashSort {
    public static void main(String args[]) {
        MyClass test = new MyClass();
        int[] arr = {5, 4, 3, 2, 1, 0};
        test.sort(arr);
    }
    
    // sorts the array by placing each array in their value index
    public void sort(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; ++i) {
            int val = arr[i];
            newArr[val] = val;
        }
        System.out.println("sorted: " + Arrays.toString(newArr));
    }

    // sorts the array by placing each array in their value index
    // but this handles duplicates as well, it takes the array to be sorted and the number range within the array to be sorted ( max number in the array)
    public void sort(int[] arr, int range) {
        int size = arr.length;
        int[] arrTemp = new int[range+1];
        int[] result = new int[size];
        int[] dups = new int [size];
        Arrays.fill(dups, -1);
        Arrays.fill(arrTemp, -1);
        int j = 0;
        int tempNum = 0;
        for(int i = 0; i < arr.length; i++) {
            tempNum = arr[i];
            if ( arrTemp[tempNum] == -1) {
                arrTemp[tempNum] = tempNum;
            } else {
                dups[tempNum] = tempNum;
            }
            
        }
        
        for(int i = 0; i < arrTemp.length; i++) {
            if (arrTemp[i] != -1) {
                result[j] = arrTemp[i];
                j++;
                
                if (dups[i] != -1) {
                    result[j] = arrTemp[i];
                    j++;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(result));
        
    }
}