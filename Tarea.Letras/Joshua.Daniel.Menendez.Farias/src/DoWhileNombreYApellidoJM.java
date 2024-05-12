public class DoWhileNombreYApellidoJM {
    public void DoWhileJM() {

        String asterisco = "***";
        String ast = "**";

        System.out.println("");
        System.out.println("");
        System.out.println("DO WHILE J  M");
        System.out.println("");

        
        int j = 1;
        int k = 1;
        int je = 1;
        int jc = 1;
        int jf = 1;
        int jh = 1;
        int ji = 1;
        int jk = 1;
        int jl = 1;

        System.out.print("   ");
        do {
            System.out.print(asterisco);

            j++;
        } while (j <= 3);
        System.out.print("     ");

        do {
            int l = 1;
            do {
                int m = 1;
                do {
                    System.out.print(asterisco);

                    m++;

                } while (m <= 1);
                System.out.print("       ");
                l++;
            } while (l <= 1);
            System.out.print(asterisco);
            k++;
        } while (k <= 1);
        System.out.println("");

        do {
            int jb = 1;
            do {
                System.out.print("      ");
                System.out.print(asterisco);
                System.out.print("        ");
                System.out.print(asterisco);
                System.out.print(ast);

                jb++;
            } while (jb <= 1);
            System.out.print("   ");
            je++;
        } while (je <= 1);
        System.out.print(asterisco);
        System.out.print(ast);
        System.out.println("");

        System.out.print("      ");
        System.out.print(asterisco);
        System.out.print("        ");
        do {
            System.out.print("*");
            jc++;
        } while (jc <= 13);
        System.out.println("");

        do {
            if (jf == 4 || jf == 9 || jf == 11 || jf == 13) {
                System.out.print(asterisco);
            } else {
                System.out.print("  ");
            }

            jf++;
        } while (jf <= 20);
        System.out.println("");

        do {
            if (jh == 16 || jh == 24 || jh == 7) {
                System.out.print(asterisco);
            } else {
                System.out.print(" ");
            }

            jh++;
        } while (jh <= 27);
        System.out.println("");

        do {
            int jj = 1;
            do {
                if (jj == 1 || jj == 5 || jj == 14 || jj == 22) {
                    System.out.print(asterisco);
                } else {
                    System.out.print(" ");
                }

                jj++;

            } while (jj <= 27);
            ji++;
            System.out.println("");
        } while (ji <= 2);

        System.out.print(" ");
        do {
            System.out.print("*");

            jk++;

        } while (jk <= 7);
        do {
            if (jl == 10 || jl == 18) {
                System.out.print(asterisco);
            } else {
                System.out.print(" ");
            }

            jl++;
        } while (jl <= 20);

    }

}
