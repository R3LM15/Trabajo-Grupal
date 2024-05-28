public class MarcoMarcillo {

    private int nTermino;
    private String mmCaracter1;
    private String mmCaracter2;
    private String mmCaracter3;
    private String mmCaracter4;
    private char mmLimiteLetra;

    public MarcoMarcillo(int nTermino, String mmCaracter1, String mmCaracter2, String mmCaracter3, String mmCaracter4, char mmLimiteLetra){
        setnTermino(nTermino);
        setMmCaracter1(mmCaracter1);
        setMmCaracter2(mmCaracter2);
        setMmCaracter3(mmCaracter3);
        setMmCaracter4(mmCaracter4);
        setMmLimiteLetra(mmLimiteLetra);
    }

    public int getnTermino() {
        return nTermino;
    }

    public void setnTermino(int nTermino) {
        this.nTermino = nTermino;
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
    
    //public void mmSC1(int nTermino,String mmCaracter1,String mmCaracter2){
    public void mmSC1(){
        System.out.print("SC1:  ");
        for(int i=1;i<=nTermino;i++){
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
        for(int i=1;i<=(nTermino)/1.2;i=i+1){
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
        System.out.println("PENDIENTE");
    }
    

    public void mmSC4(){
        System.out.print("SC4:  ");
        for(int i=1; i<nTermino; i++){
            System.out.print(mmCaracter1+ " ");
            System.out.print(mmCaracter2 +" "); 
            System.out.print(mmCaracter3 +" "); 
            System.out.print(mmCaracter4 +" "); 
        }
    } 

    public void mmSC5(){
        System.out.print("SC5:  ");
        for(int i=1; i<nTermino; i++){
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

