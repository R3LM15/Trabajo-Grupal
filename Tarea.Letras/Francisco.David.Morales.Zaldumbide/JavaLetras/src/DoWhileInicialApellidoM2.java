public class DoWhileInicialApellidoM2 {
    public void apellidoDoWhileM(){

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

            int k = 1;
            do {
                System.out.print(i == k ? signo+signo : espacio+espacio);
                k++;
            } while (k < nivel/2 + 1);

            int a = nivel/2 - 1;
            do {
                System.out.print(a == i ? signo+signo : espacio+espacio);
                a--;
            } while (a > 0);

            int b = 0;
            do {
                System.out.print(signo);
                b++;
            } while (b < 2);

            System.out.println();
            i++;
        } while (i < nivel);
    }
}
