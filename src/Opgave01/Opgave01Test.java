package Opgave01;

public class Opgave01Test {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 16, 8, 10};
        boolean result = containsUnevenNumber(intArray);
        printResult(result);
        int [] intArray2 = { 42, 67, 12, 103 };
        result = containsUnevenNumber(intArray2);
        printResult(result);
    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("Listen indeholder et ulige tal.");
        } else {
            System.out.println("Listen indeholder ikke et ulige tal.");
        }
    }

    public static boolean containsUnevenNumber(int[] candidates) {
        for (int candidate : candidates) {
            if (candidate % 2 == 1){
                return true;
            }
        }

        return false;
    }
}
