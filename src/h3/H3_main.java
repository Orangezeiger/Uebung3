package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5, fix = 2, wartend = 2;
        boolean istVoll;

        if((max - fix) > wartend) {
            fix += wartend;
            wartend = 0;
            istVoll = false;
        } else {
            wartend = wartend -(max - fix);
            fix += max - fix;
            istVoll = true;
        }

        System.out.println(istVoll);
        System.out.println(wartend);
        System.out.println(fix);
        System.out.println(max);
    }
}
