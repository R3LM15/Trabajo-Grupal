public class WhileInicialNombreApellidoFM {
    public void nombreApellidoFm(){

        System.out.println();
        int nivel = 5;
        String signo = "X";
        String espacio = " ";

        int i = 0;
        while (i < nivel) {

            int j = 0;
            while (j < 2) {
                System.out.print(signo);
                j++;
            }

            int k = 0;
            while (k <= nivel - 2) {
                System.out.print(i == 0 || i + 1 == (nivel + 1)/2 ? signo : espacio);
                k++;
            }

            int a = 0;
            while (a < nivel /2) {
                System.out.print(i == 0 ? signo : espacio);
                a++;
            }

            int b = 0;
            while (b < 4) {
                System.out.print(espacio);
                b++;
            }

            int c = 0;
            while (c < 2) {
                System.out.print(signo);
                c++;
            }

            int d = 1;
            while (d < nivel/2 + 1) {
                System.out.print(i == d ? signo+signo : espacio+espacio);
                d++;
            }

            int f = nivel/2 - 1;
            while (f > 0) {
                System.out.print(f == i ? signo+signo : espacio+espacio);
                f--;
            }

            int g = 0;
            while (g < 2) {
                System.out.print(signo);
                g++;
            }
            System.out.println();
            i++;
        }
    }
}
//FRANCISCO MORALES