public class MenendezJoshua {
    
    private int mjLeertamanio;
    
    public MenendezJoshua(int mjLeertamanio){
        setMjLeertamanio(mjLeertamanio);
    }

    public int getMjLeertamanio() {
        return mjLeertamanio;
    }

    public void setMjLeertamanio(int mjLeertamanio) {
        this.mjLeertamanio = mjLeertamanio;
    }

    public void mjF1() {

        int mjB = 1;

        do {

            int mjA = 1;

            if (mjB == 1 || mjB == mjLeertamanio) {

                do {

                    System.out.print(" * ");

                    mjA++;
                } while (mjA <= mjLeertamanio);
                System.out.println();

            } else {
                int mjC = 1;

                do {

                    if (mjC == 1 || mjC == mjLeertamanio) {
                        System.out.print(" * ");

                    } else {
                        System.out.print("   ");
                    }

                    mjC++;
                } while (mjC <= mjLeertamanio);
                System.out.println();

            }

            mjB++;
        } while (mjB <= mjLeertamanio);
        System.out.println();
    }

    public void mjF2() {

        int mjB = 1;
        String mjSimbolo;

        do {
            int mjA = 1;
            if (mjB == 1 || mjB == mjLeertamanio) {

                do {
                    mjSimbolo = (mjA % 2 == 0) ? " + " : " * ";
                    System.out.print(mjSimbolo);
                    mjA++;
                } while (mjA <= mjLeertamanio);
                System.out.println();
            } else {
                int mjC = 1;
                do {
                    mjSimbolo = (mjB % 2 == 0) ? " + " : " * ";
                    if (mjC == 1 || mjC == mjLeertamanio) {
                        System.out.print(mjSimbolo);
                    } else {
                        System.out.print("   ");
                    }
                    mjC++;
                } while (mjC <= mjLeertamanio);
                System.out.println();
            }
            mjB++;
        } while (mjB <= mjLeertamanio);
        System.out.println();
    }

    public void mjF3() {
        int mjA = 1;
        do {
            int mjB = 1;
            do {
                System.out.print("* ");

                mjB++;
            } while (mjB <= mjA);
            System.out.println();

            mjA++;
        } while (mjA <= mjLeertamanio);
        System.out.println();
    }

    public void mjF4() {

        int mjA = 1;
        do {

            int mjEspacios = mjLeertamanio - mjA;
            for (int i = 0; i < mjEspacios; i++) {
                System.out.print("  ");
            }

            int mjB = 1;
            do {
                System.out.print("* ");
                mjB++;
            } while (mjB <= mjA);

            System.out.println();
            mjA++;
        } while (mjA <= mjLeertamanio);
        System.out.println();

    }

    public void mjF5() {

        int mjA = mjLeertamanio;
        do {

            int mjEspacios = (mjLeertamanio - mjA);
            for (int i = 0; i < mjEspacios; i++) {
                System.out.print("  ");
            }

            // Imprimir asteriscos
            int mjB = 1;
            do {
                System.out.print("* ");
                mjB++;
            } while (mjB <= (2 * mjA - 1));

            System.out.println();
            mjA--;
        } while (mjA >= 1);
        System.out.println();

    }

    public void mjF6() {
        int mjA = 1;
        do {

            int mjEspacios = (mjLeertamanio - mjA);
            for (int mjC = 0; mjC < mjEspacios; mjC++) {
                System.out.print("  ");
            }

            int mjB = 1;
            do {
                System.out.print("* ");
                mjB++;
            } while (mjB <= (2 * mjA - 1));

            System.out.println();
            mjA++;
        } while (mjA <= mjLeertamanio);
        System.out.println();

    }

    public void mjF7() {
        int mjA = 0;
        do {

            do {

                if (mjA % 2 == 0) {

                    System.out.println("___");
                } else {
                    int mjEspacios = 0;
                    do {
                        System.out.print(" ");
                        mjEspacios++;
                    } while (mjEspacios <= (mjA * 2) + 1);
                    System.out.print("|");

                }

                mjA++;
            } while (mjA < mjLeertamanio);

        } while (mjA < (mjLeertamanio * 2));
        System.out.println();

    }

    public void mjF8() {

        for (int mjA = 0; mjA < mjLeertamanio; mjA++) {

            for (int mjB = 0; mjB < mjLeertamanio - mjA - 1; mjB++) {
                System.out.print("    ");
            }

            System.out.println("___|");
        }
        System.out.println();
    }

}





