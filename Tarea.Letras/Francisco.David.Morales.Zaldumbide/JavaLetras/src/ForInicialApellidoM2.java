public class ForInicialApellidoM2 {
    public void apellidoM(){

        System.out.println();
        int nivel = 5;
        String signo = "X";
        String espacio = " ";

        for (int i = 0; i < nivel; i++) {
            
            for (int j = 0; j < 2; j++) {
                System.out.print(signo);
            }

            for (int k = 1; k < nivel/2 + 1 ; k++) {
                System.out.print(i == k ? signo+signo : espacio+espacio);
            }
            
            for (int a = nivel/2 - 1; a > 0; a--) {
                System.out.print(a == i ? signo+signo : espacio+espacio);
            }

            for (int b = 0; b < 2; b++) {
                System.out.print(signo);
            }

            System.out.println();
        }
    }
}
//FRANCISCO MORALES