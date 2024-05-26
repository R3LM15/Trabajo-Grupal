public class WhileInicialNombreM {

    String letra = "x";
    String vacio = " ";

public void wm(int n){
int i=1;
while (i<=n){
    System.out.print(letra);
    System.out.print(letra);
    
    int a=1;
    while (a<=i) {
        System.out.print(vacio);
    a++;
    }
    System.out.print(letra);
    System.out.print(letra);
    
    int b=1;
    while (b<=n*2-2*i) {
        System.out.print(vacio);
    b++;
    }
    System.out.print(letra);
    System.out.print(letra);

    int c=1;
    while (c<=i) {
        System.out.print(vacio);
    c++;
    }
    System.out.print(letra);
    System.out.print(letra);


    System.out.println(vacio);
 i++;
  }
 }
}


