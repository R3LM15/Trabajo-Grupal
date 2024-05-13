public class WhileInicialApellidoM {
    public void whileM() {
        String asterisco = "***";
        String ast = "**";

        System.out.println("");
        System.out.println("");
        System.out.println("WHILE M");
        System.out.println("");

       
        int j = 1;
        int jj = 1;
        int jd = 1;
        int jz = 1;
        int jhz = 1;

        while (jhz <= 1) {
            int k = 1;
            while (k <= 1) {
                System.out.print(asterisco);

                k++;
            }

            System.out.print("       ");
            jhz++;
        }
        System.out.print(asterisco);
        System.out.println("");

        while (j <= 1) {
            int k = 1;
            while (k <= 1) {
                System.out.print(asterisco);
                System.out.print(ast);

                k++;
            }

            System.out.print("   ");
            j++;
        }
        System.out.print(asterisco);
        System.out.print(ast);
        System.out.println("");


        while (jj <= 13) {
            System.out.print("*");

            jj++;
        }
        System.out.println("");

        while (jd <= 5) {
            if (jd == 1 || jd == 3 || jd == 5) {
                System.out.print(asterisco);

            } else {
                System.out.print("  ");
            }

            jd++;
        }
        System.out.println("");

        while (jz <= 4) {
            int ja = 1;
            while (ja <= 13) {
                if (ja == 1 || ja == 9) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

                ja++;
            }
            System.out.println("");

            jz++;
        }

    }

}
