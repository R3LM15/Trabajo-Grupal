public class ForApellidoM {

    public void forM() {
        String asterisco = "***";
        String ast = "**";

        System.out.println("");
        System.out.println("FOR M");
        System.out.println("");

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                for (int k = 1; k <= 1; k++) {
                    System.out.print(asterisco);
                }
                System.out.print("       ");
            }
            System.out.print(asterisco);
        }
        System.out.println("");

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++) {
                for (int k = 1; k <= 1; k++) {
                    System.out.print(asterisco);
                    System.out.print(ast);
                }
                System.out.print("   ");
            }
            System.out.print(asterisco);
            System.out.print(ast);
        }
        System.out.println("");

        for (int j = 1; j <= 13; j++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 3 || i == 5) {
                System.out.print(asterisco);

            } else {
                System.out.print("  ");
            }
        }
        System.out.println("");

        for (int jz = 1; jz <= 4; jz++) {
            for (int jd = 1; jd <= 13; jd++) {
                if (jd == 1 || jd == 9) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

}
