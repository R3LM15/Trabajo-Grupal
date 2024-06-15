import java.util.Scanner;
public class MolinaMateo {
    public static Scanner sc = new Scanner(System.in);
    private int mmTamano;
    private String mmfrase;

    public MolinaMateo(int mmTamano , String mmfrase){
        setmmTamano(mmTamano);
        setMmfrase(mmfrase);
    }

    public int getmmTamano() {
        return mmTamano;
    }

    public void setmmTamano(int mmTamano) {
        this.mmTamano = mmTamano;
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









    }









