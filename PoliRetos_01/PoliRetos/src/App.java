import java.util.Scanner;

public class App {
        public static Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        public static void main(String[] args) throws Exception {
=======
        System.out.println("      GRUPO #03      ");
        System.out.println("---- INTEGRANTES ----");
        System.out.println("->  Molina.Mateo");
        System.out.println("->  Morales.Francisco");
        System.out.println("->  Zamira.Jimenez");
        System.out.println("->  Marcillo.Marco");
        System.out.println("->  ");
        System.out.println("---- ----------- ----");
                    System.out.println(" ");
                    
                    
        System.out.println(">> Series numéricas");
                        System.out.println(" ");
>>>>>>> 92dd7fe8564c3426bb04dde52c9acc196f57f4fd

                System.out.println("      GRUPO #03      ");
                System.out.println("---- INTEGRANTES ----");
                System.out.println("->  Molina.Mateo");
                System.out.println("->  Morales.Francisco");
                System.out.println("->  Zamira.Jimenez");
                System.out.println("->  Menendez.Joshua  ");
                System.out.println("---- ----------- ----");
                System.out.println(" ");

                System.out.println(">> Series numéricas");
                System.out.println(" ");

                MolinaMateo MMSeries;
                MMSeries = new MolinaMateo();

                MMSeries.mmSN1(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN2(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN3(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN4(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN5(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN6(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN7(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN8(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN9(mmLecturaTamano());
                System.out.println(" ");

                MMSeries.mmSN10(mmLecturaTamano());
                System.out.println(" ");

<<<<<<< HEAD
                System.out.println(">> Figuras");
                System.out.println(" ");
=======
        System.out.println(">> Series de caracteres");
        System.out.println(" ");
        int nTermino=10;
        String caracter1="+" ,caracter2="-",caracter3="*",caracter4="/";
        char limiteLetra='h';

        MarcoMarcillo MMserie=new MarcoMarcillo();
        MMserie.mmSC1(nTermino,caracter1,caracter2);
        System.out.println("");
        MMserie.mmSC2(nTermino,caracter1);
        System.out.println("");  
        MMserie.mmSC3(nTermino,caracter1);
        System.out.println("");  
        MMserie.mmSC4(nTermino,caracter1,caracter2,caracter3,caracter4);
        System.out.println("");  
        MMserie.mmSC5(nTermino,caracter1,caracter2,caracter3,caracter4);
        System.out.println(""); 
        MMserie.mmSC7(limiteLetra);
        System.out.println(""); 
        MMserie.mmSC8(limiteLetra);
        System.out.println(""); 
        MMserie.mmSC9(limiteLetra);
        System.out.println("");                  

        System.out.println(">> Figuras");
            System.out.println(" ");
            
            MoralesFrancisco oMfFiguras = new MoralesFrancisco();
>>>>>>> 92dd7fe8564c3426bb04dde52c9acc196f57f4fd

                MenendezJoshua mfFiguras = new MenendezJoshua();

                mfFiguras.mjF1(mjLeertamanio());
                mfFiguras.mjF2(mjLeertamanio());
                mfFiguras.mjF3(mjLeertamanio());
                mfFiguras.mjF4(mjLeertamanio());
                mfFiguras.mjF5(mjLeertamanio());
                mfFiguras.mjF6(mjLeertamanio());
                mfFiguras.mjF7(mjLeertamanio());
                mfFiguras.mjF8(mjLeertamanio());

                MoralesFrancisco oMfFiguras = new MoralesFrancisco();

                oMfFiguras.setSimboloLinea("_");
                oMfFiguras.setmfSimboloMas("+");
                oMfFiguras.setmfSimboloMenos("-");

                oMfFiguras.mfF10(mfLecturaNivel(), oMfFiguras.getmfSimboloMas(), oMfFiguras.getmfSimboloMenos(),
                                oMfFiguras.getSimboloLinea());

                oMfFiguras.mfF11(mfLecturaNivel(), oMfFiguras.getmfSimboloMenos(), oMfFiguras.getSimboloLinea());

                oMfFiguras.mfF12(mfLecturaNivel());

                oMfFiguras.mfF13(mfLecturaNivel());

                oMfFiguras.mfF14(mfLecturaNivel());

                oMfFiguras.mfF15(mfLecturaNivel());

                oMfFiguras.mfF16(mfLecturaNivel(), oMfFiguras.getmfSimboloMenos(), oMfFiguras.getmfSimboloMas());

                oMfFiguras.mfF17(mfLecturaNivel());

        }

        private static int mfLecturaNivel() {

                int mfNivel = 0;
                boolean mfControl = true;

                do {
                        System.out.println("Ingresa el nivel que tendra la figura: ");
                        try {
                                mfNivel = sc.nextInt();
                                mfControl = false;
                        } catch (Exception e) {
                                System.out.println("EL NIVEL INTRODUCIDO NO ES UN NUMERO VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (mfControl || mfNivel < 0);
                sc.next();
                return mfNivel;
        }

        private static int mmLecturaTamano() {

                Scanner scanner = new Scanner(System.in);

                int mmTamano = 0;

                System.out.print("> Ingresa el tamaño que tendra la serie:  ");
                try {
                        mmTamano = sc.nextInt();
                } catch (Exception e) {
                        System.out.println(" EL NÚMERO INTRODUCIDO NO ES UN NUMERO, VUELVA A INTENTARLO.");
                        sc.next();
                }

                return mmTamano;
                //

        }

        private static int mjLeertamanio() {
                Scanner sc = new Scanner(System.in);

                int mjTamanio = 0;
                String mjIngreso;
                Boolean mjTamaniovalido = false;

                while (!mjTamaniovalido) {
                        System.out.print("> Ingresa el tamaño que tendra la forma:  ");
                        mjIngreso = sc.nextLine();

                        if (mjIngreso.matches("^\\d+$")) {
                                mjTamanio = Integer.parseInt(mjIngreso);
                                mjTamaniovalido = true;
                        } else {
                                System.out.println(" EL VALOR INGRESADO NO ES VALIDO, INGRESE UN NUMERO ENTERO ");
                        }
                }

                return mjTamanio;

        }

}
