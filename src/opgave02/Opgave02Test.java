package opgave02;

public class Opgave02Test {
    public static void main(String[] args) {
        int[] intArray = {2, 6, 8, 12, 15, 17, 18, 25};
        System.out.println(findFirstIntIn(intArray, 15, 20));
    }

    public static int findFirstIntIn(int[] intArray, int nStart, int nSlut){

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > nStart && intArray[i] < nSlut){
                return i;
            }
        }

        return -1;
    }
}
