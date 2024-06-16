import java.util.Collections;

public class MarcoMarcillo {

    private int mmNumTermino;
    private String mmCaracter1;
    private String mmCaracter2;
    private String mmCaracter3;
    private String mmCaracter4;
    private char mmLimiteLetra;
    private String mmfrase;
    private int mmNum1;
    private int mmNum2;
    
    
    
    
    public MarcoMarcillo(int mmNumTermino, String mmCaracter1, String mmCaracter2, String mmCaracter3, String mmCaracter4, char mmLimiteLetra,String mmfrase,int Num1,int Num2){
        setmmNumTermino(mmNumTermino);
        setMmCaracter1(mmCaracter1);
        setMmCaracter2(mmCaracter2);
        setMmCaracter3(mmCaracter3);
        setMmCaracter4(mmCaracter4);
        setMmLimiteLetra(mmLimiteLetra);
        setMmfrase(mmfrase);
        setMmNum1(mmNum1);
        setMmNum2(mmNum2);
    }
    
    public int getmmNumTermino() {
        return mmNumTermino;
    }
    
    public void setmmNumTermino(int mmNumTermino) {
        this.mmNumTermino = mmNumTermino;
    }

    public String getMmCaracter1() {
        return mmCaracter1;
    }

    public void setMmCaracter1(String mmCaracter1) {
        this.mmCaracter1 = mmCaracter1;
    }
    
    public String getMmCaracter2() {
        return mmCaracter2;
    }

    public void setMmCaracter2(String mmCaracter2) {
        this.mmCaracter2 = mmCaracter2;
    }
    
    public String getMmCaracter3() {
        return mmCaracter3;
    }

    public void setMmCaracter3(String mmCaracter3) {
        this.mmCaracter3 = mmCaracter3;
    }
    
    public String getMmCaracter4() {
        return mmCaracter4;
    }
    
    public void setMmCaracter4(String mmCaracter4) {
        this.mmCaracter4 = mmCaracter4;
    }
    
    public char getMmLimiteLetra() {
        return mmLimiteLetra;
    }
    
    public int getMmNum1() {
        return mmNum1;
    }

    public void setMmNum1(int mmNum1) {
        this.mmNum1 = mmNum1;
    }

    public int getMmNum2() {
        return mmNum2;
    }

    public void setMmNum2(int mmNum2) {
        this.mmNum2 = mmNum2;
    }
    public void setMmLimiteLetra(char mmLimiteLetra) {
        this.mmLimiteLetra = mmLimiteLetra;
    }
    public String getMmfrase() {
        return mmfrase;
    }
    
    public void setMmfrase(String mmfrase) {
        this.mmfrase = mmfrase;
    }
    
    public void mmSC1(){
        System.out.print("SC1:  ");
        for(int i=1;i<=mmNumTermino;i++){
            if(i%2==0){
                System.out.print("- ");
            } else {
                System.out.print("+ ");
            }
        }
    }

    public void mmSC2(){
        System.out.print("SC2:  ");
        int a=1,b=1;
        for(int i=1;i<=(mmNumTermino)/1.2;i=i+1){
            for(int j=0; j<a ; j++){
            System.out.print("+ ");
            }
            System.out.print(" ");
            int c= a + b;
            a = b;
            b = c;
        }
    }

    public void mmSC3(){
        System.out.print("SC3:  ");
        int mmNumtermino = 1;
        generarSecuenciaPrimos(mmNumtermino);
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void generarSecuenciaPrimos(int mmNumtermino) {
        int contadorPrimos = 0;
        int numero = 2;
        while (contadorPrimos < mmNumtermino) {
            if (esPrimo(numero)) {
                StringBuilder secuencia = new StringBuilder();
                for (int i = 0; i < numero; i++) {
                    secuencia.append('*');
                }
                System.out.println(secuencia.toString());
                contadorPrimos++;
            }
            numero++;
        }
    }
    

    public void mmSC4(){
        System.out.print("SC4:  ");
        for(int i=1; i<mmNumTermino; i++){
            System.out.print(mmCaracter1+ " ");
            System.out.print(mmCaracter2 +" "); 
            System.out.print(mmCaracter3 +" "); 
            System.out.print(mmCaracter4 +" "); 
        }
    } 

    public void mmSC5(){
        System.out.print("SC5:  ");
        for(int i=1; i<mmNumTermino; i++){
            mmCaracter1=" \\";
            mmCaracter2="|";
            mmCaracter3="/ ";
            mmCaracter4="- |";
            System.out.print(mmCaracter1+ " ");
            System.out.print(mmCaracter2 +" "); 
            System.out.print(mmCaracter3 +" "); 
            System.out.print(mmCaracter4 +" "); 
        }
    } 

    public void mmSC7(){
        System.out.print("SC7:  ");
        for (char letra = 'a'; letra <= mmLimiteLetra; letra++) {
            int repeticiones = (int) (2*(letra - 'a')+3);
            for (int i = 1; i < repeticiones; i++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }
    } 

    public void mmSC8(){
        System.out.print("SC8:  ");
        for (char i = 'a'; i <= mmLimiteLetra; i++) {
            int repeticiones = (int) (2*(i - 'a')+1);
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    } 

    public void mmSC9(){
        System.out.print("SC9:  ");
        int a=1,b=1,c=1;
        for(char i='a'; i<=mmLimiteLetra ; i++){
            for(int j=0; j<a ; j++){
            System.out.print(i);
            }
            System.out.print(" ");
            int x= b + c;
            a = b;
            b = c;
            c = x;
        }
    }
    //Poliretos2
    public void mmCO5 (){
        System.out.println("C05)      ");
        char [] fraseCaracteres;
        fraseCaracteres = mmfrase.toCharArray();
        System.out.print("");
        for (int i = fraseCaracteres.length - 1; i >= 0; i--) {
            if (fraseCaracteres[i] == 'a' || fraseCaracteres[i] == 'e' || fraseCaracteres[i] == 'i' || fraseCaracteres[i] == 'o' || fraseCaracteres[i] == 'u'){
                fraseCaracteres[i] = Character.toUpperCase(fraseCaracteres[i]);
                System.out.print(fraseCaracteres[i]+"");
            }
            else
                System.out.print(fraseCaracteres[i]+"");
        }
        System.out.println();
    }
    public void mmCO6 (){
        System.out.println("C06)      ");
        char [] fraseCaracteres;
        fraseCaracteres = mmfrase.toCharArray();
        System.out.print("");
        for (int i = fraseCaracteres.length - 1; i >= 0; i--) {
            if (fraseCaracteres[i] == 'a' || fraseCaracteres[i] == 'e' || fraseCaracteres[i] == 'i' || fraseCaracteres[i] == 'o' || fraseCaracteres[i] == 'u')
                System.out.print(fraseCaracteres[i]);
            else {
                fraseCaracteres[i] = Character.toUpperCase(fraseCaracteres[i]);
                System.out.print(fraseCaracteres[i]);
            }
        }
        System.out.println();
    }
    public void mmA03(){
        System.out.println("A03)      ");
        int guion = 45;
        for (int i=10; i>0; i--){
            if(i==10){
                System.out.println(i+ " |            O");
            }
            if(i==8){
                System.out.println(i+ "  |         C");
            }
            if(i==6){
                System.out.println(i+ "  |      R");
            }
            if(i==4){
                System.out.println(i+ "  |   A");
            }
            if(i==2){
                System.out.println(i+ "  |M");
            }
            if(i % 2 !=0){
                if(i>9){
                    System.out.println(i + " |");
                }
                else{
                    System.out.println(i + "  |");
                }
            }
            
        }
        System.out.print("   ");
        for(int j=0; j<18; j++){
            System.out.print((char)guion);
        }
        System.out.println();
    }

    public void mmL07() {
        System.out.println("lo7)      ");
        int retraso = 100; 
        String[] puntero = {"\\", "|", "/", "-"};
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            int numIguales = i / 5;
            int numEspacios = 20 - numIguales;

            String barra = String.join("", Collections.nCopies(numIguales, "=")) +
                puntero[i % puntero.length] +
                String.join("", Collections.nCopies(numEspacios, " "));

            System.out.print("\r[" + barra + "] " + i + "%");

            try {
                Thread.sleep(retraso); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void mmL08(){
        System.out.println();
        System.out.println("lo8)      ");
        String ccletras = "";
        short cccontador = -1;
        int ccpatron = 100 / mmfrase.length();
        for (int i = ccpatron; i < ccpatron * mmfrase.length() + 1; i += ccpatron) {
            cccontador++;
            ccletras += mmfrase.charAt(cccontador);
            System.out.print(
                    "\r" + "[" + ccletras + " ".repeat(mmfrase.length() - 1 - cccontador) + "] " + i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\r" + "[" + ccletras + "] " + "100%");
    }

    public void mmR03() {

        System.out.print("R03)      ");
        System.out.print("Ingrese el primer numero deseado: ");
        int numA = App.sc.nextInt();
        System.out.print("Ingrese el segundo numero deseado: ");
        int numB = App.sc.nextInt();
        int mjResultado = multiplicacion(numA, numB);
        System.out.println("La multiplicacion de " + numA + " y de " + numB + " es: " + mjResultado);
        System.out.println("");
    }
    public int multiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacion(a, b - 1);
        }
    }
} 