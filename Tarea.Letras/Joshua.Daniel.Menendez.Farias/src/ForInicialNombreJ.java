public class ForInicialNombreJ {
    public void forJ() {
        String asterisco = "***";

        System.out.println("");
        System.out.println("FOR J");
        System.out.println("");

        for (int i = 1; i <= 1; i++) {
            System.out.print("   ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(asterisco);
            }
            System.out.println("");
        }

        for (int i = 1; i <= 4; i++) {
            System.out.print("      ");
            System.out.print(asterisco);
            System.out.println("");
        }

        for (int jz = 1; jz <= 2; jz++) {
            for (int jd = 1; jd <= 13; jd++) {
                if (jd == 1 || jd == 5) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

        System.out.print(" ");
        for (int jz = 1; jz <= 7; jz++) {
            System.out.print("*");

        }

    }
}