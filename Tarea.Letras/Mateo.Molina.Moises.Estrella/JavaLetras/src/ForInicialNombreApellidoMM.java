public class ForInicialNombreApellidoMM {

    int   n = 5;
    String letra = "x";
    String vacio = " ";

public void lmamo(){

    for(int i=1; i<=n; i++){
        System.out.print(letra);
        System.out.print(letra);

            for(int a=1; a<=i; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);

            for(int a=1; a<=n*2-2*i; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);

            for(int a=1; a<=i; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);
            
            for(int a=1; a<=n/2; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);

            for(int a=1; a<=i; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);

            for(int a=1; a<=n*2-2*i; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);

            for(int a=1; a<=i; a++)
                System.out.print(vacio);
                System.out.print(letra);
                System.out.print(letra);
        
           
        System.out.println(vacio);    
  }
 }
}