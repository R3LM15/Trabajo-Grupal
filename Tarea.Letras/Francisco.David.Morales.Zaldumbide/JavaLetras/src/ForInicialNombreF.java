public class ForInicialNombreF {
    public void nombreF(){
        System.out.println("For:______________________________________________________");
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

            for (int a = 0; a < nivel/2 ; a++) {
                System.out.print(i == 0 ? signo : espacio);
            }
            System.out.println();
        }
    }
}

//FRANCISCO MORALES