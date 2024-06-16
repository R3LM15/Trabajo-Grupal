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



    public void mjC03() {

        System.out.print("C03)      ");
        System.out.print("Ingresa una frase: ");
        String mjFrase = App.sc.next();
        System.out.print("Ingresa una vocal: ");
        String mjVocal = App.sc.next();

        String fraseSinVocal = mjFrase.replaceAll(mjVocal, " ");
        System.out.println("La palabra sin " + mjVocal + " :" + fraseSinVocal);

        System.out.println("");

    }

    public void mjC04() {

        System.out.print("C04)      ");
        System.out.print("Ingresa una frase: ");
        String mjFrase = App.sc.next();
        System.out.print("Ingresa una letra: ");
        String mjLetra = App.sc.next();

        String mjSinLetra = mjFrase.replaceAll(mjLetra, " ");
        System.out.println("La palabra sin  " + mjLetra + " :" + mjSinLetra);

        System.out.println("");

    }



    public void mjA01() {

        String[] mjNombres = { "Joshua", "Daniel", "Menendez", "Farias" };

        int[] mjPorcent = new int[mjNombres.length];

        System.out.print("A03)      ");
        System.out.println("Ingresa el porcentaje de carga para cada nombre:");
        for (int i = 0; i < mjNombres.length; i++) {
            System.out.print("Porcentaje para " + mjNombres[i] + ": ");
            mjPorcent[i] = App.sc.nextInt();
        }

        for (int i = 0; i < mjNombres.length; i++) {
            int mjLetrasMostrar = (int) (mjNombres[i].length() * (mjPorcent[i] / 100.0));
            System.out.print(mjNombres[i].substring(0, mjLetrasMostrar) + "\t");
            mjImprimirBarraProgreso(mjPorcent[i]);
            System.out.println(mjPorcent[i] + "%");
        }

        System.out.println("");

    }



    public void mjL01() {

        String[] mjMovimiento = { "|", "/", "-", "\\" };
        int mjPorcent = 0;

        System.out.println("L01)      ");
        while (mjPorcent <= 100) {
            System.out.print("\r" + mjMovimiento[mjPorcent % mjMovimiento.length] + " " + mjPorcent + "% ");
            try {
                Thread.sleep(75);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mjPorcent++;

        }
        System.out.println("");
    }

    public void mjL02() {

        int barLength = 20;
        char loadingChar = '#';

        System.out.print("L02)      ");
        for (int i = 1; i <= barLength; i++) {
            System.out.print("\r[");
            for (int j = 1; j <= i; j++) {
                System.out.print(loadingChar);
            }
            for (int j = i + 1; j <= barLength; j++) {
                System.out.print(" ");
            }
            System.out.print("] " + i * 5 + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("\nCarga completa!");
        System.out.println("");

    }



    public void mjR01() {

        System.out.print("R01)      ");
        System.out.print("Ingrese el numero deseado: ");
        int mjNumero = App.sc.nextInt();

        int mjResultado = factorial(mjNumero);
        System.out.println("El factorial de " + mjNumero + " es: " + mjResultado);
        System.out.println("");
    }


    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static void mjImprimirBarraProgreso(int mjPorcent) {
        int mjLongitudBarra = 10;
        int mjCantidad = (mjPorcent * mjLongitudBarra) / 100;

        System.out.print("[");
        for (int j = 0; j < mjCantidad; j++) {
            System.out.print("=");
        }

        for (int k = mjCantidad; k < mjLongitudBarra; k++) {
            System.out.print(" ");
        }

        System.out.print("]");

    }




}





