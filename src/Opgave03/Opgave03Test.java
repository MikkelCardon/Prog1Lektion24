package Opgave03;

public class Opgave03Test {
    public static void main(String[] args) {
        int[] testArray1 = { 23, 54, 23, 975, 2, 13 }; //false
        int[] testArray2 = { 42, 51, 45, 45, 42, 17 }; //true

        System.out.println(twoInARow(testArray1));
        System.out.println(twoInARow(testArray2));
    }

    public static boolean twoInARow(int[] intArray){
        for (int i = 0; i < intArray.length-1; i++) {
            if (intArray[i] == intArray[i+1]){
                return true;
            }
        }

        return false;
    }
}
