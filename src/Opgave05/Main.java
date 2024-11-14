package Opgave05;

public class Main {
    public static void main(String[] args) {
        //System.out.println(findKvadratrod(10));

        System.out.println(findKvadratrodBinary(111));

        System.out.println(Math.pow(2, -1));
    }

    //squarerod
    public static int findKvadratrod(int n){
        int r = 0;

        for (int i = 0; i < 1000; i++) {
            r = i;
            if ((r*r) <= n && n < Math.pow(r+1, 2) ){
                return r;
            }
        }
        return -1;
    }


    public static int findKvadratrodBinary(int n){
        int r = 0;

        int left = 0;
        int right = n;

        while(left <= right){
            r = (left + right) / 2;
            if ((r*r) <= n && n < Math.pow(r+1, 2) ){
                return r;
            } else if (r*r > n) {
                right = r -1;
            } else if (n > Math.pow(r+1, 2)) {
                left = r +1;
            }
        }

        return -1;
    }
}
