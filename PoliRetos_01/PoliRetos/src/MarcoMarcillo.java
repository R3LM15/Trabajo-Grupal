public class MarcoMarcillo {

    public void mmSC1(int nTermino,String caracter1, String caracter2){
        System.out.print("SC1:  ");
            for(int i=1;i<=nTermino;i++){
                if(i%2==0){
                    System.out.print("- ");
                } else {
                    System.out.print("+ ");
                }
            }
    }

    public void mmSC2(int nTermino,String caracter1){
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

    public void mmSC3(int nTermino,String caracter1){
        System.out.print("SC3:  ");
        System.out.println("PENDIENTE");
    }
    

    public void mmSC4(int nTermino,String caracter1,String caracter2,String caracter3,String caracter4){
        System.out.print("SC4:  ");
        for(int i=1; i<nTermino; i++){
            System.out.print(caracter1+ " ");
            System.out.print(caracter2 +" "); 
            System.out.print(caracter3 +" "); 
            System.out.print(caracter4 +" "); 
        }
    } 

    public void mmSC5(int nTermino,String caracter1,String caracter2,String caracter3,String caracter4){
        System.out.print("SC5:  ");
        for(int i=1; i<nTermino; i++){
            caracter1=" \\";
            caracter2="|";
            caracter3="/ ";
            caracter4="- |";
            System.out.print(caracter1+ " ");
            System.out.print(caracter2 +" "); 
            System.out.print(caracter3 +" "); 
            System.out.print(caracter4 +" "); 
        }
    } 

    public void mmSC7(char limiteLetra){
        System.out.print("SC7:  ");
        for (char letra = 'a'; letra <= limiteLetra; letra++) {
            int repeticiones = (int) (2*(letra - 'a')+3);
            for (int i = 1; i < repeticiones; i++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }
    } 

    public void mmSC8(char limiteLetra){
        System.out.print("SC8:  ");
        for (char i = 'a'; i <= limiteLetra; i++) {
            int repeticiones = (int) (2*(i - 'a')+1);
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    } 

    public void mmSC9(char limiteLetra){
        System.out.print("SC9:  ");
        int a=1,b=1,c=1;
        for(char i='a'; i<=limiteLetra ; i++){
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

