public class MarcoMarcillo {

    private int mmNumTermino;
    private String mmCaracter1;
    private String mmCaracter2;
    private String mmCaracter3;
    private String mmCaracter4;
    private char mmLimiteLetra;

    public MarcoMarcillo(int mmNumTermino, String mmCaracter1, String mmCaracter2, String mmCaracter3, String mmCaracter4, char mmLimiteLetra){
        setmmNumTermino(mmNumTermino);
        setMmCaracter1(mmCaracter1);
        setMmCaracter2(mmCaracter2);
        setMmCaracter3(mmCaracter3);
        setMmCaracter4(mmCaracter4);
        setMmLimiteLetra(mmLimiteLetra);
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

    public void setMmLimiteLetra(char mmLimiteLetra) {
        this.mmLimiteLetra = mmLimiteLetra;
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
} 

