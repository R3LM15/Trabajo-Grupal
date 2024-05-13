public class DoWhileInicialNombreJ {

    public void dowhileJ() {
        String asterisco = "***";

        System.out.println("");
        System.out.println("");
        System.out.println(" DO WHILE J");
        System.out.println("");

        int i = 1;
        int j = 1;
        int je = 1;
        int jz = 1;

        System.out.print("   ");
        do {
            System.out.print(asterisco);

            j++;
        } while (j <= 3);
        System.out.println("");

        do {
            System.out.print("      ");
            System.out.print(asterisco);
            System.out.println("");
            i++;

        } while (i <= 4);

        do {
            int jd = 1;
            do {
                if (jd == 1 || jd == 5) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

                jd++;

            } while (jd <= 13);

            je++;
            System.out.println();

        } while (je <= 2);

        System.out.print(" ");
        do {
            System.out.print("*");
            jz++;

        } while (jz <= 7);

    }

}
