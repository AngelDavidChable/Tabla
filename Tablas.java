import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de Tablas de Multiplicar");
            System.out.println("1) Mostrar una tabla");
            System.out.println("2) Mostrar tablas del 2 al 5");
            System.out.println("3) Salir");
            System.out.print("Elija una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el número de tabla que desea mostrar: ");
                    int tabla = Integer.parseInt(scanner.nextLine());
                    mostrarTabla(tabla);
                    break;
                case "2":
                    mostrarTablasDel2Al5();
                    break;
                case "3":
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }

    static void mostrarTabla(int tabla) {
        System.out.println("Tabla de multiplicar del " + tabla + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }

    static void mostrarTablasDel2Al5() {
        System.out.println("Mostrando tablas del 2 al 5:");
        for (int i = 2; i <= 5; i++) {
            mostrarTabla(i);
            System.out.println();
        }
    }
}
