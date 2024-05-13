public class InicialNombreApellido_doWhile {
    public void inicialNombreApellido_doWhile(int n,String variable){
        int i=0;
        do {
            for (int j = 0; j < n+2; j++) {
                if (j == 0 || j == n || (i==j && i<(n/2)) || ((i!=(n%2)&&j!=(n%2)) && i<=(n/2) & i!= j && i+j==n) || ((i==(n%2)&&j==(n%2)) && i<=(n/2) & i!= j && i+j==n)) {
                    System.out.print(variable + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            int j = 0;
            do{
                if (j == 0 || j == n || (i==j && i<(n/2)) || ((i!=(n%2)&&j!=(n%2)) && i<=(n/2) & i!= j && i+j==n) || ((i==(n%2)&&j==(n%2)) && i<=(n/2) & i!= j && i+j==n)) {
                    System.out.print(variable + " ");
                } else {
                    if (j == 0 || j == n || (i==j && i<(n/2)) || ((i!=(n%2)&&j!=(n%2)) && i<=(n/2) & i!= j && i+j==n) || ((i==(n%2)&&j==(n%2)) && i<=(n/2) & i!= j && i+j==n)) {
                        System.out.print(variable + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                j++;
            }while ( j < n+2);
            System.out.println();
            i++;
        }while(i < n-1);
        System.out.println();
    }
    }
    

