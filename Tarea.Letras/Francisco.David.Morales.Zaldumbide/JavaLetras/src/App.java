public class App {
    public static void main(String[] args) throws Exception {
        //"Francisco Morales"
        //Signo (X) _________ Nivel (5)
        //For
        ForInicialNombreF ForNF;
        ForNF = new ForInicialNombreF();
        ForNF.nombreF();
    
        ForInicialApellidoM2 ForAM;
        ForAM = new ForInicialApellidoM2();
        ForAM.apellidoM();
    
        ForInicialNombreApellidoFM ForANFM;
        ForANFM = new ForInicialNombreApellidoFM();
        ForANFM.nombreApellidoFm();

        //While
        WhileInicialNombreF WhileNF;
        WhileNF = new WhileInicialNombreF();
        WhileNF.nombreWhileF();
        
        WhileInicialApellidoM2 WhileAM;
        WhileAM = new WhileInicialApellidoM2();
        WhileAM.apellidoM();

        WhileInicialNombreApellidoFM WhileNAFM;
        WhileNAFM = new WhileInicialNombreApellidoFM();
        WhileNAFM.nombreApellidoFm();

        //DoWhile
        DoWhileInicialNombreF DoWhileNF;
        DoWhileNF = new DoWhileInicialNombreF();
        DoWhileNF.nombreDoWhileF();

        DoWhileInicialApellidoM2 DoWhileAM;
        DoWhileAM = new DoWhileInicialApellidoM2();
        DoWhileAM.apellidoDoWhileM();

        DoWhileInicialNombreApellidoFM DoWhileNAFM;
        DoWhileNAFM = new DoWhileInicialNombreApellidoFM();
        DoWhileNAFM.nombreApellidodoWhile();
    }
}
