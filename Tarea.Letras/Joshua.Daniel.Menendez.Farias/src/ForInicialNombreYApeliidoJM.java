public class ForInicialNombreYApeliidoJM {
    public void forJM() {
        String asterisco = "***";
        String ast = "**";

        System.out.println("");
        System.out.println(" FOR  J  M");
        System.out.println("");

        for (int i = 1; i <= 1; i++) {
            System.out.print("   ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(asterisco);
            }
            System.out.print("     ");
            for (int k = 1; k <= 1; k++) {
                for (int l = 1; l <= 1; l++) {
                    for (int m = 1; m <= 1; m++) {
                        System.out.print(asterisco);
                    }
                    System.out.print("       ");
                }
                System.out.print(asterisco);
            }

            System.out.println("");
        }

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                for (int k = 1; k <= 1; k++) {
                    System.out.print("      ");
                    System.out.print(asterisco);
                    System.out.print("        ");
                    System.out.print(asterisco);
                    System.out.print(ast);
                }
                System.out.print("   ");
            }
            System.out.print(asterisco);
            System.out.print(ast);
        }
        System.out.println("");

        for (int i = 1; i <= 1; i++) {
            System.out.print("      ");
            System.out.print(asterisco);
            System.out.print("        ");
            for (int j = 1; j <= 13; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 20; i++) {
            if (i == 4 || i == 9 || i == 11 || i == 13) {
                System.out.print(asterisco);
            } else {
                System.out.print("  ");
            }
        }
        System.out.println("");

        for (int jz = 1; jz <= 1; jz++) {
            for (int jd = 1; jd <= 27; jd++) {
                if (jd == 16 || jd == 24 || jd == 7) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

            }
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
            for (int jm = 1; jm <= 30; jm++) {
                if (jm == 1 || jm == 9) {
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
        for (int jd = 1; jd <= 20; jd++) {
            if (jd == 10 || jd == 18) {
                System.out.print(asterisco);
            } else {
                System.out.print(" ");
            }

        }

    }
}