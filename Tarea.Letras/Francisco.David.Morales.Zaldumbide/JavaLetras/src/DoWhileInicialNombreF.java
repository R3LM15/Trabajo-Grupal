public class DoWhileInicialNombreF {
    public void nombreDoWhileF(){
        System.out.println();
        System.out.println("Do While:______________________________________________________");
        System.out.println();
        int nivel = 5;
        String signo = "X";
        String espacio = " ";

        int i =  0;
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

            System.out.println();
            i++;
        } while (i < nivel);
    }
}
//FRANCISCO MORALES