import java.util.Scanner;

public class MenendezJoshua {

    public void mjC03() {

        Scanner sc = new Scanner(System.in);
        System.out.print("C03)      ");
        System.out.print("Ingresa una frase: ");
        String mjFrase = sc.nextLine();
        System.out.print("Ingresa una vocal: ");
        String mjVocal = sc.next();

        String fraseSinVocal = mjFrase.replaceAll(mjVocal, " ");
        System.out.println("La palabra sin " + mjVocal + " :" + fraseSinVocal);

        System.out.println("");

    }

    public void mjC04() {

        Scanner sc = new Scanner(System.in);
        System.out.print("C04)      ");
        System.out.print("Ingresa una frase: ");
        String mjFrase = sc.nextLine();
        System.out.print("Ingresa una letra: ");
        String mjLetra = sc.next();

        String mjSinLetra = mjFrase.replaceAll(mjLetra, " ");
        System.out.println("La palabra sin  " + mjLetra + " :" + mjSinLetra);

        System.out.println("");

    }

    public void mjA01() {

        Scanner sc = new Scanner(System.in);

        String[] mjNombres = { "Joshua", "Daniel", "Menendez", "Farias" };

        int[] mjPorcent = new int[mjNombres.length];

        System.out.print("A03)      ");
        System.out.println("Ingresa el porcentaje de carga para cada nombre:");
        for (int i = 0; i < mjNombres.length; i++) {
            System.out.print("Porcentaje para " + mjNombres[i] + ": ");
            mjPorcent[i] = sc.nextInt();
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
        Scanner sc = new Scanner(System.in);

        System.out.print("R01)      ");
        System.out.print("Ingrese el numero deseado: ");
        int mjNumero = sc.nextInt();

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
