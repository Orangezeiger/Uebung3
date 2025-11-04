package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3,b = 5,c = 7, d = 4;

        d = 0;
        if (a == b) {
            d++;
            d++;
        }else if (a == c){
            d++;
        }

        if(a + b >= c) {
            d++;
        }

        if (a+ b +c > 100) {
            d++;
        }
    }
}
