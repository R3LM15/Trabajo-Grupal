import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre de usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Mostrar el menú básico
        mostrarMenu();

        // Leer la opción del menú
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        // Procesar la opción seleccionada
        procesarOpcion(opcion);
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Salir");
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la Opción 1");
                break;
            case 2:
                System.out.println("Has seleccionado la Opción 2");
                break;
            case 3:
                System.out.println("Has seleccionado la Opción 3");
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}


