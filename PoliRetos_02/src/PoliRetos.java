import java.util.Scanner;

public class PoliRetos {
    static  String mmfrase;

    public static void integrantes() {
        System.out.println("      GRUPO #03      ");
        System.out.println("---- INTEGRANTES ----");
        System.out.println("->  Molina.Mateo");
        System.out.println("->  Morales.Francisco");
        System.out.println("->  Zamira.Jimenez");
        System.out.println("->  Menendez.Joshua  ");
        System.out.println("->  Marcillo.Marco");
        System.out.println("---- ----------- ----");
        System.out.println(" ");

    }
    public static void CadenaCaracteres() {
    System.out.println(">> Cadena de caracteres:");
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Por favor, ingresa una frase:     ");
    String mmfrase = scanner.nextLine().toLowerCase(); 
    
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

    System.out.print("C02)      ");
        int contador = 0;
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
            System.out.println("tiene " + (mmfrase.length() - total) + " letras");




    
    }    

    public static void Arrays() {
        System.out.println("      GRUPO #03      ");
    }

    public static void Loading() {
        System.out.println("      GRUPO #03      ");
    }

    public static void Recursion() {
        System.out.println("      GRUPO #03      ");
    }






    public String getFrase() {
        return mmfrase;
    }

    public void setFrase(String mmfrase) {
        if (mmfrase == null)
            this.mmfrase = " ";
        else
            this.mmfrase = mmfrase;
       
    }


















}
