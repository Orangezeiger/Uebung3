package h2;

public class H2_main {
    public static void main(String[] args) {
        int jahr = 2016;
        boolean schalt = false;

        if(jahr % 400 == 0) {
            schalt = true;
        }else {
            if(jahr % 100 != 0) {
                if(jahr % 4 == 0) {
                    schalt = true;
                }
            }
        }
        System.out.println(schalt);
    }
}
