public class MoralesFrancisco {
    
    private int mfNivel;
    private String mfSimbolo1;
    private String mfSimbolo2;
    private String mfSimbolo3;

    public MoralesFrancisco(int mfNivel, String mfSimbolo1, String mfSimbolo2, String mfSimbolo3){
        setmfNivel(mfNivel);
        setmfSimbolo1(mfSimbolo1);
        setmfSimbolo2(mfSimbolo2);
        setSimbolo3(mfSimbolo3);
    }
    
    public int getmfNivel() {
        return mfNivel;
    }
    
    public void setmfNivel(int mfNivel) {
        this.mfNivel = mfNivel;
    }
    
    public String getmfSimbolo1() {
        return mfSimbolo1;
    }

    public void setmfSimbolo1(String mfSimbolo1) {
        if (mfSimbolo1 == null)
            this.mfSimbolo1 = " ";
        else
            this.mfSimbolo1 = mfSimbolo1;
    }
    
    public String getmfSimbolo2() {
        return mfSimbolo2;
    }
    
    public void setmfSimbolo2(String mfSimbolo2) {
        if (mfSimbolo2 == null)
            this.mfSimbolo2 = " ";
        else
            this.mfSimbolo2 = mfSimbolo2;
    }
    
    public String getSimbolo3() {
        return mfSimbolo3;
    }

    public void setSimbolo3(String mfSimbolo3) {
        if (mfSimbolo3 == null)
            this.mfSimbolo3 = " ";
        else
            this.mfSimbolo3 = mfSimbolo3;
    }

    public void mfF10(){
        
        System.out.println("Figura 10: ");        
        for (int i = 0; i < mfNivel; i++) {

            System.out.println(i % 2 == 0 ? mfSimbolo3 + mfSimbolo1 + mfSimbolo3: mfSimbolo3 + mfSimbolo2 + mfSimbolo3);
            for (int j = 0; j < i+1; j++) {
                System.out.print("    ");
            }
            System.out.print("|");

        }
        System.out.println("");
    }
    
    public void mfF11(){
        
        int espaciado = 0; 
        System.out.println("Figura 11: ");        
        for (int i = 0; i < mfNivel; i++) {
            
            System.out.print("|");
            for (int j = 0; j < i+1; j++) {
                System.out.print("_");
                espaciado++;
            }

            System.out.println("");
            espaciado++;

            for (int j = 0; j < espaciado; j++) {
                System.out.print(" ");
            }
            
        }
        System.out.println("");
    }

    public void mfF12(){

        int num;
        System.out.println("Figura 12: ");

        for (int i = 0; i < mfNivel; i++) {
            num = 1;
            for (int j = mfNivel; j > i ; j--) {
                System.out.print(num++);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void mfF13(){

        System.out.println("Figura 13: ");

        for (int i = 1; i <= mfNivel; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void mfF14(){
        int mfEspaciado = mfNivel;
        System.out.println("Figura 14: ");
        
        for (int i = 0; i < mfNivel; i++) {
            
            int mfNumero = 1;            
            for (int j = 0; j < (mfEspaciado*2) - 2; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(mfNumero + "   ");
                mfNumero = mfNumero * (i - j) / (j + 1);
            }
            
            mfEspaciado += -1;
            System.out.println("");
        }
        System.out.println("");
    }

    public void mfF15(){
        
        System.out.println("Figura 15: ");
        
        for (int i = 0; i < mfNivel; i++) {
            
            int mfNumero = 1;            
            
            for (int j = 0; j <= i; j++) {
                System.out.print(mfNumero + "   ");
                mfNumero = mfNumero * (i - j) / (j + 1);
            }
            
            System.out.println("");
        }
        System.out.println("");
    }

    public void mfF16(){
        
        System.out.println("Figura 16: ");

        for (int i = 0; i < mfNivel; i++) {
            if (i % 4 == 0 || i == 0){
                System.out.println(mfSimbolo1 +  "               " + mfSimbolo1);
            }else if(i % 2 != 0){
                System.out.println("    " + mfSimbolo2 +   "       " + mfSimbolo2);
            }else{
                System.out.println("        " + mfSimbolo1);
            }
        }
    }

    public void mfF17(){
        
        System.out.println("Figura 17: ");

        for (int i = 0; i < mfNivel; i++) {
            if (i % 4 == 0 || i == 0){
                System.out.println(1 +  "               " + 1);
            }else if(i % 2 != 0){
                System.out.println("    " + 0 +   "       " + 0);
            }else{
                System.out.println("        " + 1);
            }
        }
    }

}
