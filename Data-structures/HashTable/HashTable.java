import java.util.*;
public class HashTable {
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

   public HashTable(int size) {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }
    public static void main(String[] args) {
        HashTable theFunc = new HashTable(30);
        String[] elementsToAdd = {"0", "1", "5", "17", "21", "26" };
        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
        
    }

    public void hashFunction1(String[] stringsForArray, String[] theArray) {
        for(int n = 0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
        System.out.println("the new Array: " + Arrays.toString(theArray));
    }




}
