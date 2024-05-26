import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int mmTamano= 3;

        

        System.out.println("      GRUPO #03      ");
        System.out.println("---- INTEGRANTES ----");
        System.out.println("->  Molina.Mateo");
        System.out.println("->  Morales.Francisco");
        System.out.println("->  ");
        System.out.println("->  ");
        System.out.println("---- ----------- ----");
                    System.out.println(" ");
                    
                    
        System.out.println(">> Series numéricas");
                        System.out.println(" ");

            MolinaMateo MMSeries;
             MMSeries= new MolinaMateo();

                MMSeries.mmSN1(mmTamano);
                        System.out.println(" ");

                MMSeries.mmSN2(mmTamano);
                        System.out.println(" ");

                MMSeries.mmSN3(mmTamano);
                        System.out.println(" ");

                MMSeries.mmSN6(mmTamano);
                        System.out.println(" ");
                        
                MMSeries.mmSN7(mmTamano);
                        System.out.println(" ");

                MMSeries.mmSN8(mmTamano);
                        System.out.println(" ");

                MMSeries.mmSN9(mmTamano);
                        System.out.println(" ");

                MMSeries.mmSN10(mmTamano);
                        System.out.println(" ");

        System.out.println(">> Figuras");
            System.out.println(" ");
            
            MoralesFrancisco oMfFiguras = new MoralesFrancisco();

            oMfFiguras.setSimboloLinea("_");
            oMfFiguras.setmfSimboloMas("+");
            oMfFiguras.setmfSimboloMenos("-");

                oMfFiguras.mfF10(mfLecturaNivel(), oMfFiguras.getmfSimboloMas(), oMfFiguras.getmfSimboloMenos(), oMfFiguras.getSimboloLinea());
                
                oMfFiguras.mfF11(mfLecturaNivel(), oMfFiguras.getmfSimboloMenos(), oMfFiguras.getSimboloLinea());
                
                oMfFiguras.mfF12(mfLecturaNivel());
                
                oMfFiguras.mfF13(mfLecturaNivel());
                
                oMfFiguras.mfF14(mfLecturaNivel());
            
                oMfFiguras.mfF15(mfLecturaNivel());
            
                oMfFiguras.mfF16(mfLecturaNivel(), oMfFiguras.getmfSimboloMenos(), oMfFiguras.getmfSimboloMas());
            
                oMfFiguras.mfF17(mfLecturaNivel());

                
    }

    private static int mfLecturaNivel() {
        
        int mfNivel         = 0;
        boolean mfControl   = true;
        
        do {
            System.out.println("Ingresa el nivel que tendra la figura: ");
            try{
                mfNivel     = sc.nextInt();
                mfControl   = false;
            }catch(Exception e){
                System.out.println("EL NIVEL INTRODUCIDO NO ES UN NUMERO VUELVA A INTENTARLO.");
                sc.next();
            }
        } while (mfControl || mfNivel < 0);
        sc.next();
        return mfNivel;
    }
}
