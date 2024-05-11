public class App {
    public static void main(String[] args) throws Exception {

    // n = 5 :Parametro base para todos los archivos, probado hasta un maxino de n=50.


    //For
    System.out.println("For -------------------------------------------- ");
         ForInicialNombreM IN;
          IN= new ForInicialNombreM();
          IN.lm();
                 System.out.println(" ");

         ForInicialApellidoM IA;
          IA= new ForInicialApellidoM();
          IA.lmo();
                 System.out.println(" ");

         ForInicialNombreApellidoMM INA;
          INA= new ForInicialNombreApellidoMM();
          INA.lmamo();
                 System.out.println(" ");
    
    //while 
    System.out.println("While -------------------------------------------- ");
         WhileInicialNombreM WIN;
          WIN= new WhileInicialNombreM();
          WIN.wm();
                 System.out.println(" ");

         WhileInicialApellidoM WIA;
          WIA= new WhileInicialApellidoM();
          WIA.wmo();
                 System.out.println(" ");

          WhileInicialNombreApellidoMM WINA;
           WINA= new WhileInicialNombreApellidoMM();
           WINA.wmm();
                  System.out.println(" ");

    //while 
    System.out.println("Do While -------------------------------------------- ");
        DoWhileInicialNombreM DWIN;
         DWIN= new DoWhileInicialNombreM();
         DWIN.Dwm();
                System.out.println(" ");

        DoWhileInicialApellidoM DWIA;
         DWIA= new DoWhileInicialApellidoM();
         DWIA.Dwmo();
                 System.out.println(" ");

        DoWhileInicialNombreApellidoMM DWINA;
         DWINA= new DoWhileInicialNombreApellidoMM();
         DWINA.Dwmm();
                System.out.println(" ");
    }
}
