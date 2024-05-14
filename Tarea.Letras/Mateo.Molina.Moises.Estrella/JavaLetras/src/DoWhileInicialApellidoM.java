public class DoWhileInicialApellidoM {

    
    String letra = "x";
    String vacio = " ";

    public void Dwmo(int n){


        int i = 1;
        do {
            System.out.print(letra);
            System.out.print(letra);
    
            
            int a = 1;
            do {
                System.out.print(vacio);
                a++;
            } while (a <= i);
            System.out.print(letra);
            System.out.print(letra);
    
            int b = 0;
            do {
                System.out.print(vacio);
                b++;
            } while (b <= 2*n-2*i);
            System.out.print(letra);
            System.out.print(letra);
            
            int c = 1;
            do {
                System.out.print(vacio);
                c++;
            } while (c <= i);
            System.out.print(letra);
            System.out.print(letra);
    
    
    
            System.out.println(vacio);
            i++;
        } while (i <= n);
     }
    }


