package Opgave07;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(characterInARow("heeeeej", 6));
    }

    public static boolean characterInARow(String text, int n){
        char[] charArray = text.toLowerCase(Locale.ROOT).toCharArray();
        int index = 0;
        int numberInARow;

        for (int i = 0; i < charArray.length-n+1; i++) {
            int j = i+1;
            numberInARow = 1;

           while (j <= i+n){
               if (charArray[i] == charArray[j]){
                   numberInARow++;

                   if (numberInARow == n){
                       return true;
                   }
               }
               else break;
               j++;
           }

        }


        return false;
    }


}
