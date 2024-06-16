import java.util.Scanner;
public class MolinaMateo {
    public static Scanner sc = new Scanner(System.in);
    private int mmTamano;
    private String mmfrase;
    private int a ;
    private int b ;

    public MolinaMateo(int mmTamano , String mmfrase , int a , int  b){
        setmmTamano(mmTamano);
        setMmfrase(mmfrase);
        seta(a);
        setb(b);
    }

    public int getmmTamano() {
        return mmTamano;
    }

    public void setmmTamano(int mmTamano) {
        this.mmTamano = mmTamano;
    }

    public int geta() {
        return a;
    }

    public void seta(int a) {
        this.a = a;
    }

    public int getb() {
        return b;
    }

    public void setb(int b) {
        this.b = b;
    }


    public String getMmfrase() {
        return mmfrase;
    }

    public void setMmfrase(String mmfrase) {
        this.mmfrase = "";
        if(mmfrase != null)
        this.mmfrase = mmfrase.toLowerCase();
    }
    
    public void mmSN1(){
        System.out.print("SN1:  ");

        int a=0;
        int b=1;

        if (mmTamano != 0) System.out.print(a + " " + b +" ");
        for(int i=0; i<mmTamano - 2; i++){
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
        System.out.println(" ");
    }


    public void mmSN2(){
        System.out.print("SN2:  ");

        for(int i=1; i<= mmTamano; i++){
            if (i % 2 == 1) {
                System.out.print(i + " ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println(" ");
    }


    public void mmSN3(){
        System.out.print("SN3:  ");

        int mminicio = 5;
        int a=0;
        int b=1;

        if (mmTamano != 0) System.out.print(a + "/"+ 1 + " " + b +"/"+ 3 + " ");
        for(int i=0; i<mmTamano - 2; i++){
            int c = a+b;
            System.out.print(c + "/"+ mminicio + " ");
            a=b;
            b=c;
            mminicio = mminicio + 2; 
        
        }
        System.out.println(" ");
    }

    
    public void mmSN4(){
        System.out.print("SN4:  ");

        int mminicio = 2;
        int a=0;
        int b=1;

        if (mmTamano != 0) System.out.print(a + "/"+ mminicio + " " + b +"/"+ (mminicio+2) + " ");
        mminicio = mminicio + 4; 
        for(int i=0; i<mmTamano - 2; i++){
            int c = a+b;
            System.out.print(c + "/"+ mminicio + " ");
            a=b;
            b=c;
            mminicio = mminicio + 2; 
        
        }
        System.out.println(" ");
    }
    

    public void mmSN5(){
        System.out.print("SN5:  ");
        int mminicio = 2;
        int i = 0;

        while (i < mmTamano) {
            boolean esPrimo = true;

            for (int y = 2; y <= Math.sqrt(mminicio); y++) {
                if (mminicio % y == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(mminicio + " ");
                i++;
            }

            mminicio++;
        }
        System.out.println(" ");
    }
    
    
    public void mmSN6(){
        System.out.print("SN6:  ");
        int mminicio = 2;
        
        for (int i = 0; i < mmTamano; i++) {

            if (mminicio % mminicio == 0 ) {
                System.out.print(mminicio + " ");
            }

            mminicio = mminicio + 1 ;
        }
        System.out.println(" ");
    }  


    public void mmSN7(){
        System.out.print("SN7:  ");
        int mminicio = 1;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 3;
        }
        System.out.println(" "); 
    }


    public void mmSN8(){
        System.out.print("SN8:  ");
        int mminicio = 3;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 5;
        }
        System.out.println(" ");
    }


    public void mmSN9(){
        System.out.print("SN9:  ");
        int mminicio = 2;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio * 2;
        }
        System.out.println(" ");
    }


    public void mmSN10(){
        System.out.print("SN10: ");
        int mminicio = 3;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio * 3;
        }
        System.out.println(" ");
    }

    
    //CadenaCaracteres

public void mmcc1() {
    
    
   
    
    System.out.print("C01)      ");
    int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
    
            for (int i = 0; i < mmfrase.length(); i++) {
                char caracter = mmfrase.charAt(i);
                switch (caracter) {
                    case 'a' -> contadorA++;
                    case 'e' -> contadorE++;
                    case 'i' -> contadorI++;
                    case 'o' -> contadorO++;
                    case 'u' -> contadorU++;
                }
            }
            int total = contadorA + contadorE + contadorI + contadorO + contadorU;
            System.out.println("tiene " + total + " Vocales");

    
    }    





    public void mmcc2(){
        System.out.print("C02)      ");
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
            for (int i = 0; i < mmfrase.length(); i++) {
                char caracter = mmfrase.charAt(i);
                
                 switch (caracter) {
                     case 'a' -> contadorA++;
                     case 'e' -> contadorE++;
                     case 'i' -> contadorI++;
                     case 'o' -> contadorO++;
                     case 'u' -> contadorU++;
                 }
            }
            int total = contadorA + contadorE + contadorI + contadorO + contadorU;
            System.out.println("tiene " + (mmfrase.length() - total) + " letras");
       
    }

    public void mmar2(){
        System.out.print("A02)      ");
      
        
        int mmtamano = 10;
        String mmcaracter = "*";
        String vacio = " ";


        System.out.println();
        System.out.println(" Mi nombre es Mateo Molina");
        System.out.println();

        for(int i=1; i<=mmtamano; i++){
            System.out.print(mmcaracter);
            System.out.print(mmcaracter);
    
                for(int a=1; a<=i; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
    
                for(int a=1; a<=mmtamano*2-2*i; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
    
                for(int a=1; a<=i; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
                
                for(int a=1; a<=mmtamano/2; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
    
                for(int a=1; a<=i; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
    
                for(int a=1; a<=mmtamano*2-2*i; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
    
                for(int a=1; a<=i; a++)
                    System.out.print(vacio);
                    System.out.print(mmcaracter);
                    System.out.print(mmcaracter);
            
               
            System.out.println(vacio);    
            }
        }


public void mmld3(){

            final int BARRA_TAMANO = 20;
    
            String mmcaracter = "a";
    
            for (int i = 0; i <= BARRA_TAMANO; i++) {
                int porcentaje = (int) (((double) i / BARRA_TAMANO) * 100);
    
                StringBuilder barra = new StringBuilder("[-");
                for (int j = 0; j < i; j++) {
                    barra.append(mmcaracter);
                }
                for (int j = i; j < BARRA_TAMANO; j++) {
                    barra.append(" ");
                }
                barra.append("] " + porcentaje + "%");
    
                System.out.print("\r" + barra);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    
            System.out.println(); // Salto de línea al final
    
        }


        public void mmld4(){
        final int mmpromax = 100;
        final int mmtime = 10;

        for (int i = 0; i <= mmpromax; i += mmtime) {
            String barra = construirBarra(i, mmpromax);
            System.out.print("\r" + barra);

            try {
                Thread.sleep(300); // Espera de 300 milisegundos (0.3 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = mmpromax - mmtime; i >= 0; i -= mmtime) {
            String barra = construirBarra(i, mmpromax);
            System.out.print("\r" + barra);

            try {
                Thread.sleep(300); // Espera de 300 milisegundos (0.3 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String construirBarra(int mmtime, int mmpromax) {
        int porcentaje = (int) ((double) mmtime / mmpromax * 100);
        int cantidadO = porcentaje / 10;
        int cantidad0 = 10 - cantidadO;

        StringBuilder barra = new StringBuilder();
        for (int j = 0; j < cantidadO; j++) {
            barra.append("o");
        }
        for (int j = 0; j < cantidad0; j++) {
            barra.append("0");
        }
        barra.insert(cantidadO, "0");

        return barra.toString() + " " + porcentaje + "%";
    }

    public void mfRecursion2(){
        int resultado = suma(a, b);
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }

    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return suma(a + 1, b - 1);
        }
    }





    }









