public class App {
    public static void main(String[] args) throws Exception {
        ForApellidoM fm;
        ForNombreJ fj;
        ForNombreYApeliidoJM fjm;
        WhileNombreJ wj;
        WhileApellidoM wm;
        WhileNombreYAplellidoJM wjm;
        DoWhileNombreJ dwj;
        DoWhileApellidoM dwm;
        DoWhileNombreYApellidoJM dwjm;

        fjm =new ForNombreYApeliidoJM();
        fm = new ForApellidoM();
        fj = new ForNombreJ();
        wj = new WhileNombreJ();
        wm = new WhileApellidoM();
        wjm = new WhileNombreYAplellidoJM();
        dwj = new DoWhileNombreJ();
        dwm = new DoWhileApellidoM();
        dwjm = new DoWhileNombreYApellidoJM();

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
