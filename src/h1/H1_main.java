package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = -100, monEingang = 200;
        int rating = 4;
        boolean warnhinweis = true, negativ = false;

        if (guthaben < 0) {
            negativ = true;
            if (Math.abs(monEingang) >= Math.abs(guthaben)) {
                rating++;
            } else {
                rating--;
                if (rating < 0) {
                    warnhinweis = true;
                } else {
                    warnhinweis = false;
                }
            }
        } else if (guthaben == 0) {
            rating += 2;
            negativ = false;
        } else {
            rating += 3;
            negativ = false;
        }


    }
}
