public class App {
    public static void main(String[] args) throws Exception {
        int n = 9;
        String variable="X";
        //Declaro
        InicialNombreM_For inf;
        InicialApellidoM_For iaf;
        InicialNombreApellidoMM_For inmf;
        InicialNombre_While inw;
        InicialApellido_While iaw;
        InicialNombreApellido_While inaw;
        InicialNombre_doWhile indw;
        InicialApellido_doWhile iadw;
        InicialNombreApellido_doWhile inadw;
        //Instancio
        iaf = new InicialApellidoM_For();
        inf = new InicialNombreM_For();
        inmf =new InicialNombreApellidoMM_For();
        inw = new InicialNombre_While();
        iaw = new InicialApellido_While();
        inaw = new InicialNombreApellido_While();  
        indw = new InicialNombre_doWhile();
        iadw = new InicialApellido_doWhile();
        inadw = new InicialNombreApellido_doWhile();  
        //Llamar metodo
        System.out.println("SENTENCIA FOR");
        inf.inicialNombre(n, variable);
        System.out.println("------------");
        iaf.inicialApellido(n, variable);
        System.out.println("------------");
        inmf.inicialNombreApellido(n,variable);
        System.out.println("------------");
        System.out.println("SENTENCIA WHILE");
        inw.inicialNombreWhile(n, variable);
        System.out.println("------------");
        iaw.inicialApellido_While(n,variable);
        System.out.println("------------");
        inaw.inicialNombreApellido_While(n,variable);
        System.out.println("------------");
        System.out.println("SENTENCIA DO WHILE");
        indw.inicialNombre_doWhile(n, variable);
        System.out.println("------------");
        iadw.inicialApellido_doWhile(n,variable);
        System.out.println("------------");
        inadw.inicialNombreApellido_doWhile(n,variable);
    }
}
