import java.util.Scanner;

public class App {
        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) throws Exception {

                System.out.println("      GRUPO #03      ");
                System.out.println("---- INTEGRANTES ----");
                System.out.println("->  Molina.Mateo");
                System.out.println("->  Morales.Francisco");
                System.out.println("->  Zamira.Jimenez");
                System.out.println("->  Menendez.Joshua  ");
                System.out.println("->  Marcillo.Marco");
                System.out.println("---- ----------- ----");
                System.out.println(" ");

                int nivelTamano = lecturaNivelTamano();
                String caracter1 = lecturaCaracter();

                System.out.println(" ");
                System.out.println(">> Series numéricas");
                System.out.println(" ");


                MolinaMateo MMSeries = new MolinaMateo(nivelTamano);

                MMSeries.mmSN1();
                System.out.println(" ");

                MMSeries.mmSN2();
                System.out.println(" ");

                MMSeries.mmSN3();
                System.out.println(" ");

                MMSeries.mmSN4();
                System.out.println(" ");

                MMSeries.mmSN5();
                System.out.println(" ");

                MMSeries.mmSN6();
                System.out.println(" ");

                MMSeries.mmSN7();
                System.out.println(" ");

                MMSeries.mmSN8();
                System.out.println(" ");

                MMSeries.mmSN9();
                System.out.println(" ");

                MMSeries.mmSN10();
                System.out.println(" ");

<<<<<<< HEAD
                System.out.println(">> Figuras");
                System.out.println(" ");
=======

                System.out.println(">> Series de caracteres");
                System.out.println(" ");


                MarcoMarcillo MMserie = new MarcoMarcillo(nivelTamano, caracter1, "-", "*", "/", 'h');
                
                MMserie.mmSC1();
                System.out.println("");
                MMserie.mmSC2();
                System.out.println("");  
                MMserie.mmSC3();
                System.out.println("");  
                MMserie.mmSC4();
                System.out.println("");  
                MMserie.mmSC5();
                System.out.println(""); 
                MMserie.mmSC7();
                System.out.println(""); 
                MMserie.mmSC8();
                System.out.println(""); 
                MMserie.mmSC9();
                System.out.println("");                  


                System.out.println(">> Figuras");
                System.out.println(" ");


                MenendezJoshua mfFiguras = new MenendezJoshua(nivelTamano);
>>>>>>> 0e40ac8e1a164f55f5ff708a46b60ed756ab7633

                mfFiguras.mjF1();
                mfFiguras.mjF2();
                mfFiguras.mjF3();
                mfFiguras.mjF4();
                mfFiguras.mjF5();
                mfFiguras.mjF6();
                mfFiguras.mjF7();
                mfFiguras.mjF8();


                MoralesFrancisco oMfFiguras = new MoralesFrancisco(nivelTamano, caracter1, "-", "_");

                oMfFiguras.mfF10();
                oMfFiguras.mfF11();
                oMfFiguras.mfF12();
                oMfFiguras.mfF13();
                oMfFiguras.mfF14();
                oMfFiguras.mfF15();
                oMfFiguras.mfF16();
                oMfFiguras.mfF17();

        }

        private static int lecturaNivelTamano() {

                int nivel = 0;
                boolean control = true;

                do {
                        System.out.println("Ingresa el nivel o tamano deseado: ");
                        try {
                                nivel = sc.nextInt();
                                control = false;
                        } catch (Exception numeronopermitido) {
                                System.out.println("EL NIVEL O TAMANO INTRODUCIDO NO ES UN NUMERO. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control || nivel < 0);
                sc.next();
                return nivel;
        }

        private static String lecturaCaracter() {

                String caracter = " ";
                boolean control = true;

                do {
                        System.out.println("Ingresa un caracter para las figuras: ");
                        try {
                                caracter = sc.next();
                                control = false;
                        } catch (Exception caracternopermitido) {
                                System.out.println("EL CARACTER INGRESADO CONTIENE MAS DE UN ELEMENTO O NO ESTA PERMITIDO. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control || caracter.length() != 1);
                sc.close();
                return caracter;
        }
}
