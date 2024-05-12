public class WhileInicialApellidoM2 {
    public void apellidoM(){

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

            int k = 1;
            while (k < nivel/2 + 1) {
                System.out.print(i == k ? signo+signo : espacio+espacio);
                k++;
            }

            int a = nivel/2 - 1;
            while (a > 0) {
                System.out.print(a == i ? signo+signo : espacio+espacio);
                a--;
            }

            int b = 0;
            while (b < 2) {
                System.out.print(signo);
                b++;
            }
            System.out.println();
            i++;
        }
    }
}
//FRANCISCO MORALES