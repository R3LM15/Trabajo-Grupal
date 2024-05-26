public class MolinaMateo {
    
    public void mmSN1(int mmTamano){
        System.out.print("SN1:  ");

            for(int i=0; i<=mmTamano; i++){
                System.out.print(i);
                System.out.print(" ");
      }

    }
    public void mmSN7(int mmTamano){
        System.out.print("SN7:  ");
        int mminicio = 1;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 3;
                 
      }
    }  
    public void mmSN8(int mmTamano){
        System.out.print("SN8:  ");
        int mminicio = 3;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio + 5;
                 
      }
    }  
    public void mmSN9(int mmTamano){
        System.out.print("SN9:  ");
        int mminicio = 2;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio * 2;
                 
      }
    }
    public void mmSN10(int mmTamano){
        System.out.print("SN10: ");
        int mminicio = 3;
        
        for (int i = 0; i < mmTamano; i++) {
            System.out.print(mminicio + " ");
            mminicio = mminicio * 3;
                 
      }
    }

}