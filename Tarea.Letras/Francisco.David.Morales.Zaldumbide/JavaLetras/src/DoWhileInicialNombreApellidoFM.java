public class DoWhileInicialNombreApellidoFM {
    public void nombreApellidodoWhile(){

        System.out.println();
        int nivel = 5;
        String signo = "X";
        String espacio = " ";

        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print(signo);
                j++;
            } while (j < 2);

            int k = 0;
            do {
                System.out.print(i == 0 || i + 1 == (nivel + 1)/2 ? signo : espacio);
                k++;
            } while (k <= nivel - 2);

            int a = 0;
            do {
                System.out.print(i == 0 ? signo : espacio);
                a++;
            } while (a < nivel/2);

            int b = 0;
            do {
                System.out.print(espacio);
                b++;
            } while (b < 4);

            int c = 0;
            do {
                System.out.print(signo);
                c++;
            } while (c < 2);

            int d = 1;
            do {
                System.out.print(i == d ? signo+signo : espacio+espacio);
                d++;
            } while (d < nivel/2 + 1);

            int f = nivel/2 - 1;
            do {
                System.out.print(f == i ? signo+signo : espacio+espacio);
                f--;
            } while (f > 0);

            int g = 0;
            do {
                System.out.print(signo);
                g++;
            } while (g < 2);

            System.out.println();
            i++;
        } while (i < nivel);
    }
}
//FRANCISCO MORALES