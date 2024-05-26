public class MolinaMateo {
    
    public void mmSN1(int mmTamano){
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
    public void mmSN2(int mmTamano){
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
    public void mmSN3(int mmTamano){
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
    public void mmSN5(int mmTamano){
        System.out.print("SN5:  ");
        int mminicio = 1;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 3 + i*2;         
      }
    System.out.println(" ");
    }  
    public void mmSN6(int mmTamano){
        System.out.print("SN6:  ");
        int mminicio = 1;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 3 + i*2;
                 
      }
    System.out.println(" ");
    }  
    public void mmSN7(int mmTamano){
        System.out.print("SN7:  ");
        int mminicio = 1;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 3;
                 
      }
    System.out.println(" "); 
    }  
    public void mmSN8(int mmTamano){
        System.out.print("SN8:  ");
        int mminicio = 3;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 5;
                 
      }
    System.out.println(" ");
    }  
    public void mmSN9(int mmTamano){
        System.out.print("SN9:  ");
        int mminicio = 2;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio * 2;
                 
      }
    System.out.println(" ");
    }
    public void mmSN10(int mmTamano){
        System.out.print("SN10: ");
        int mminicio = 3;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio * 3;
                 
      }
    System.out.println(" ");
    }

}