public class ForInicialNombreM {

    String letra = "x";
    String vacio = " ";

public void lm(int n){

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
           
        System.out.println(letra);    
  }
 }
}


