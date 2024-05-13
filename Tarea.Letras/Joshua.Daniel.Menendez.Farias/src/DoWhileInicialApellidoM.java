public class DoWhileInicialApellidoM {
    public void dowhileM() {
        String asterisco = "***";
        String ast = "**";

        System.out.println("");
        System.out.println("");
        System.out.println("DO WHILE M");
        System.out.println("");

        int i = 1;
        int j = 1;
        int jj = 1;
        int jd = 1;
        int jz = 1;

        do {
            int k = 1;
            do {
                System.out.print(asterisco);

                k++;

            } while (k <= 1);
            System.out.print("       ");
            i++;

        } while (i <= 1);
        System.out.print(asterisco);
        System.out.println("");

        do {
            int k = 1;
            do {
                System.out.print(asterisco);
                System.out.print(ast);

                k++;

            } while (k <= 1);

            System.out.print("   ");
            j++;

        } while (j <= 1);
        System.out.print(asterisco);
        System.out.print(ast);
        System.out.println("");

        do {
            System.out.print("*");

            jj++;

        } while (jj <= 13);
        System.out.println("");

        do {
            if (jd == 1 || jd == 3 || jd == 5) {
                System.out.print(asterisco);

            } else {
                System.out.print("  ");
            }

            jd++;

        } while (jd <= 5);
        System.out.println("");

        do {
            int ja = 1;
            do {
                if (ja == 1 || ja == 9) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

                ja++;

            } while (ja <= 13);

            System.out.println("");
            jz++;

        } while (jz <= 4);

    }

}
