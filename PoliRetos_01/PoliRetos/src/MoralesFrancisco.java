public class MoralesFrancisco {
    
    private int mfNivel;
    private int numero;
    private int potencia;
    private String mfSimbolo1;
    private String mfSimbolo2;
    private String mfSimbolo3;
    private String mfFrase;
    private String[] mfNombreApellido;
    private String[] mfAnagramas;
    private String[] mfRespuestaAnagramas;



    public MoralesFrancisco(int mfNivel, int numero, int potencia, String mfSimbolo1, String mfSimbolo2, String mfSimbolo3, String mfFrase, String mfNombre, String mfApellido){
        setmfNivel(mfNivel);
        setNumero(numero);
        setPotencia(potencia);
        setmfSimbolo1(mfSimbolo1);
        setmfSimbolo2(mfSimbolo2);
        setSimbolo3(mfSimbolo3);
        setMfFrase(mfFrase);
        setMfNombreApellido(mfNombre, mfApellido);
        this.mfAnagramas = new String[] {"Delira", "Ballena", "Alondra", "España", "Enrique"};
        this.mfRespuestaAnagramas = new String[] {"Lidera", "Llenaba", "Ladrona", "Apañes", "Quieren"};
    }
    
    public int getmfNivel() {
        return mfNivel;
    }
    
    public void setmfNivel(int mfNivel) {
        this.mfNivel = mfNivel;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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

    public String getMfFrase() {
        return mfFrase;
    }

    public void setMfFrase(String mfFrase) {
        if(mfFrase == null)
            this.mfFrase = " ";
        else
            this.mfFrase = mfFrase;
    }

    public String[] getMfNombreApellido() {
        return mfNombreApellido;
    }

    public void setMfNombreApellido(String mfNombre, String mfApellido) {
        this.mfNombreApellido = new String[] {mfNombre, mfApellido};
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

    public void mfCadenaCaracter7(){
        System.out.println("CC_7: " + mfFrase.toUpperCase().replace("J", ""));
    }

    public void mfCadenaCaracter8(){
        Boolean exit;
        for (int i = 0; i < mfAnagramas.length; i++) {
            exit = true;
            System.out.println("CC_8: ");
            System.out.println("Ingrese el anagrama de " + mfAnagramas[i] + " tiene 3 intentos.");
            for (int j = 1; j <= 3 && exit ; j++) {
                System.out.println("Intento " + j);
                try {
                    if (App.sc.next().toUpperCase().equals(mfRespuestaAnagramas[i].toUpperCase())){
                        exit = false;
                        System.out.print("ES CORRECTO");
                    }
                    
                } catch (Exception AnagramaNoValido) {}
                System.out.println("");
            }
            System.out.println("La respuesta era " + mfRespuestaAnagramas[i]);
            System.out.println();
        }
    }
    
    public void mfArrays4(){
        int tamano;
        System.out.println("A_4: ");
        char[] mfNombreChar = mfNombreApellido[0].toCharArray();
        char[] mfApellidoChar = mfNombreApellido[1].toCharArray();
        
        if (mfNombreChar.length >= mfApellidoChar.length)
        tamano = mfNombreChar.length - 1;
        else
        tamano = mfApellidoChar.length - 1;
        
        System.out.println("");
        
        for (int i = 0; i <= tamano; i++) {
            for (int j = 0; j <= tamano; j++) {
                if (i == j && mfNombreChar.length >= i + 1) {
                    System.out.print(mfNombreChar[i]);
                } else if (j == tamano - i && mfApellidoChar.length >= i + 1) {
                    System.out.print(mfApellidoChar[i]);
                } else {
                    System.out.print(" ");
                }
                
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
    
    public void mfLoading5(){
        System.out.println("L_5: ");
        int porcentaje = 0;
        for (int i = 0; i <= 20; i++) {
            String barra1   = "\r"
            + "["
            + "=".repeat(i) 
            + ">"
            + ".".repeat(20-i)
                            + "] "
                            + porcentaje
                            + "%";
                            System.out.print(barra1);
                            porcentaje = porcentaje + 5;
                            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        System.out.println("");
    }
    
    public void mfLoading6(){
        System.out.println("L_6: ");
        System.out.println("");
        int porcentaje = 0;
        for (int i = 0; i <= 20; i++) {
            String barra2   = "\r"
            + "["
                            + " ".repeat(i) 
                            + "<=>"
                            + " ".repeat(20-i)
                            + "] "
                            + porcentaje
                            + "%";
            System.out.print(barra2);
            porcentaje = porcentaje + 5;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        } 
        System.out.println("");
    }
                    
    public void mfRecursion4(){
        System.out.println("R_4: ");
        System.out.println("El resultado de: " + numero + "^" + potencia + " es: " + mfpotencia(numero, potencia));
    }

    public long mfpotencia(int numero, int potencia){
        if (potencia == 1)
            return numero;
        return numero*mfpotencia(numero, potencia - 1);
    }
}
