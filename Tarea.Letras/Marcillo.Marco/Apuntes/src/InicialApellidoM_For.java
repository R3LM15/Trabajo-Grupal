public class InicialApellidoM_For {
    public void inicialApellido(int n,String variable){
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n+2; j++) {
                if (j == 0 || j == n || (i==j && i<(n/2)) || ((i!=(n%2)&&j!=(n%2)) && i<=(n/2) & i!= j && i+j==n) || ((i==(n%2)&&j==(n%2)) && i<=(n/2) & i!= j && i+j==n)) {
                    System.out.print(variable);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
