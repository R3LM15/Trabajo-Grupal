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
                int numA = lecturaNumeroA();
                int numB = lecturaNumeroB();
                String caracter1 = lecturaCaracter();
                String frase1 = lecturaFrase();
                String nombre = lecturaNombre();
                String apellido = lecturaApellido();
        
                
                System.out.println(" ");
                System.out.println(">> Series numéricas");
                System.out.println(" ");


                MolinaMateo MMSeries = new MolinaMateo(nivelTamano , frase1);

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


                System.out.println(">> Figuras");
                System.out.println(" ");


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


                MenendezJoshua mjpRetos = new MenendezJoshua(nivelTamano);
                


                mjpRetos.mjF1();
                mjpRetos.mjF2();
                mjpRetos.mjF3();
                mjpRetos.mjF4();
                mjpRetos.mjF5();
                mjpRetos.mjF6();
                mjpRetos.mjF7();
                mjpRetos.mjF8();


                MoralesFrancisco oMfFiguras = new MoralesFrancisco(nivelTamano, numA, numB, caracter1, "-", "_", frase1, nombre, apellido);

                oMfFiguras.mfF10();
                oMfFiguras.mfF11();
                oMfFiguras.mfF12();
                oMfFiguras.mfF13();
                oMfFiguras.mfF14();
                oMfFiguras.mfF15();
                oMfFiguras.mfF16();
                oMfFiguras.mfF17();

                //poliretos 2da PArte


                System.out.println(">> Cadena de caracteres:");
                System.out.println(" ");
                
                
                System.out.println(frase1);
                MMSeries.mmcc1();
                MMSeries.mmcc2();
                mjpRetos.mjC03();
                mjpRetos.mjC04();
                //CadenaC5
                //CadenaC6
                oMfFiguras.mfCadenaCaracter7();
                oMfFiguras.mfCadenaCaracter8();



                System.out.println(">> Arrays:");
                System.out.println(" ");
                mjpRetos.mjA01();
                MMSeries.mmar2();
                //Figura2
                //Figura3
                oMfFiguras.mfArrays4();
                //Figura5



                System.out.println(">> Loading:");
                System.out.println(" ");
                mjpRetos.mjL01();
                mjpRetos.mjL02();
                MMSeries.mmld3();
                MMSeries.mmld4();
                oMfFiguras.mfLoading5();
                oMfFiguras.mfLoading6();
                //Loading7
                //Loading8
                //Loading9
                //Loading10
                //Loading11
                //Loading12


                System.out.println(">> Recursion:");
                System.out.println(" ");
                mjpRetos.mjR01();
                //Recursividad2
                //Recursividad3
                oMfFiguras.mfRecursion4();
                //Recursividad5
                //Recursividad6
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
                sc.next();
                return caracter;
        }

        private static String lecturaFrase() {

                String frase = " ";
                boolean control = true;

                do {
                        System.out.println("Ingrese una frase: ");
                        try {
                                frase = sc.next();
                                control = false;
                        } catch (Exception frasenopermitido) {
                                System.out.println("LA FRASE INGRESADA NO ESTA PERMITIDA. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control);
                sc.next();
                return frase;
        }
        
        private static String lecturaNombre() {

                String nombre = " ";
                boolean control = true;

                do {
                        System.out.println("Ingrese un nombre: ");
                        try {
                                nombre = sc.next();
                                control = false;
                        } catch (Exception nombrenopermitido) {
                                System.out.println("EL NOMBRE INGRESADO NO ESTA PERMITIDO. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control);
                sc.next();
                return nombre;
        }
        
        private static String lecturaApellido() {

                String apellido = " ";
                boolean control = true;

                do {
                        System.out.println("Ingrese un apellido: ");
                        try {
                                apellido = sc.next();
                                control = false;
                        } catch (Exception apellidonopermitido) {
                                System.out.println("EL APELLIDO INGRESADO NO ESTA PERMITIDO. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control);
                sc.next();
                return apellido;
        }

        private static int lecturaNumeroA() {

                int numeroA = 0;
                boolean control = true;

                do {
                        System.out.println("Ingresa el NUMERO A para las operaciones: ");
                        try {
                                numeroA = sc.nextInt();
                                control = false;
                        } catch (Exception numeronopermitido) {
                                System.out.println("EL NUMERO A NO ES UN NUMERO ENTERO. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control);
                sc.next();
                return numeroA;
        }

        private static int lecturaNumeroB() {

                int numeroB = 0;
                boolean control = true;

                do {
                        System.out.println("Ingresa el NUMERO B para las operaciones: ");
                        try {
                                numeroB = sc.nextInt();
                                control = false;
                        } catch (Exception numeronopermitido) {
                                System.out.println("EL NUMERO B NO ES UN NUMERO ENTERO. VUELVA A INTENTARLO.");
                                sc.next();
                        }
                } while (control || numeroB < 0);
                sc.next();
                return numeroB;
        }
        
}

       


