public class WhileNombreJ {
    public void whilej() {
        String asterisco = "***";

        System.out.println("");
        System.out.println("");
        System.out.println("WHILE J");
        System.out.println("");

        int i = 1;
        int j = 1;
        int je = 1;
        int jz = 1;

        while (i <= 1) {
            System.out.print("   ");

            while (j <= 3) {
                System.out.print(asterisco);
                j++;

            }

            System.out.println("");
            i++;

        }

        while (i <= 5) {
            System.out.print("      ");
            System.out.print(asterisco);
            System.out.println("");
            i++;
        }

        while (je <= 2) {

            int jd = 1;
            while (jd <= 13) {
                if (jd == 1 || jd == 5) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

                jd++;
            }
            je++;
            System.out.println();

        }


        System.out.print(" ");
        while (jz <= 7) {
            System.out.print("*");
            jz++;
        }


    }
}
