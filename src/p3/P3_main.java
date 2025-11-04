package p3;

public class P3_main {
    public static void main(String[] args) {
        // Aufgabe 1
        int i = -6;
        if (i < 0) {
            System.out.println(-1 * i);
        }else{
            System.out.println(i);
        }

        // Aufgabe 2
        int j = 6;
        System.out.println(j * j);

        //Aufgabe 3
        int k = 4;
        if (k % 2 == 0) {
            System.out.println(k + " ist gerade");
        } else{
            System.out.println(k + " ist ungerade");
        }
    }
}
