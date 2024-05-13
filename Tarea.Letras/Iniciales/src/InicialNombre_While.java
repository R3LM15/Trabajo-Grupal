public class InicialNombre_While {
    public void inicialNombreWhile(int n,String variable){
        int i = 0;
        while (i< n-1){
            int j = 0;
            while(j < n+2){
                if (j == 0 || j == n || (i==j && i<(n/2)) || ((i!=(n%2)&&j!=(n%2)) && i<=(n/2) & i!= j && i+j==n) || ((i==(n%2)&&j==(n%2)) && i<=(n/2) & i!= j && i+j==n)) {
                    System.out.print(variable);
                } else {
                    System.out.print(" ");
                }
                
            j++;
        }
            System.out.println();
        i++;
    }
}
}

