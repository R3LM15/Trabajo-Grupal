public class WhileInicialNombreF {
    public void nombreWhileF(){
        System.out.println();
        System.out.println("While:______________________________________________________");
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
            System.out.println();
            i++;
        }
    }
}
//FRANCISCO MORALES