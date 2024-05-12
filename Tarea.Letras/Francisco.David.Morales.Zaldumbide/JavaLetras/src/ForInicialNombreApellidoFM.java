public class ForInicialNombreApellidoFM {
    public void nombreApellidoFm(){
        
        System.out.println();
        int nivel = 5;
        String signo = "X";
        String espacio = " ";

        for (int i = 0; i < nivel; i++) {
            
            for (int j = 0; j < 2; j++) {
                System.out.print(signo);
            }

            for (int k = 0; k <= nivel - 2; k++) {
                System.out.print(i == 0 || i + 1 == (nivel + 1)/2 ? signo : espacio);
            }

            for (int a = 0; a < nivel /2 ; a++) {
                System.out.print(i == 0 ? signo : espacio);
            }

            for (int b = 0; b < 4; b++) {
                System.out.print(espacio);
            }

            for (int c = 0; c < 2; c++) {
                System.out.print(signo);
            }

            for (int d = 1; d < nivel/2 + 1 ; d++) {
                System.out.print(i == d ? signo+signo : espacio+espacio);
            }
            
            for (int f = nivel/2 - 1; f > 0; f--) {
                System.out.print(f == i ? signo+signo : espacio+espacio);

            }

            for (int g = 0; g < 2; g++) {
                System.out.print(signo);
            }
            System.out.println();
        }
    }
}
//FRANCISCO MORALES