public class App {
    public static void main(String[] args) throws Exception {
        ForInicialApellidoM fm;
        ForInicialNombreJ fj;
        ForInicialNombreYApeliidoJM fjm;
        WhileInicialNombreJ wj;
        WhileInicialApellidoM wm;
        WhileInicialNombreYAplellidoJM wjm;
        DoWhileInicialNombreJ dwj;
        DoWhileInicialApellidoM dwm;
        DoWhileInicialNombreYApellidoJM dwjm;

        fjm =new ForInicialNombreYApeliidoJM();
        fm = new ForInicialApellidoM();
        fj = new ForInicialNombreJ();
        wj = new WhileInicialNombreJ();
        wm = new WhileInicialApellidoM();
        wjm = new WhileInicialNombreYAplellidoJM();
        dwj = new DoWhileInicialNombreJ();
        dwm = new DoWhileInicialApellidoM();
        dwjm = new DoWhileInicialNombreYApellidoJM();

        fj.forJ();
        fm.forM();
        fjm.forJM();
        wj.whilej();
        wm.whileM();
        wjm.WhileJM();
        dwj.dowhileJ();
        dwm.dowhileM();
        dwjm.DoWhileJM();

    }
}
