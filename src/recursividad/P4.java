
package recursividad;

public class P4 {

// Returns the Sum of Subarray data[low] through data[high] inclusive
    public static void main(String[] args) {
        // Ejemplo 1: arreglo con números variados
        int[] numeros1 = {4, 7, 2, 9, 5, 1};
        ejecutarEjemplo(numeros1, 1, 4, "Ejemplo 1: Arreglo con números variados");

        // Ejemplo 2: arreglo ordenado
        int[] numeros2 = {1, 2, 3, 4, 5, 6};
        ejecutarEjemplo(numeros2, 0, 5, "Ejemplo 2: Arreglo ordenado");

        // Ejemplo 3: arreglo con repetidos
        int[] numeros3 = {2, 2, 2, 2, 2};
        ejecutarEjemplo(numeros3, 0, 2, "Ejemplo 3: Arreglo con repetidos");
    }

    // Método auxiliar para mostrar resultados
    public static void ejecutarEjemplo(int[] arreglo, int low, int high, String descripcion) {
        System.out.println("\n" + descripcion);

        // Mostrar arreglo
        System.out.print("Arreglo: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        // Ejecutar suma recursiva
        int resultado = binarySum(arreglo, low, high);
        System.out.println("\nSuma de índices " + low + " a " + high + ": " + resultado);
    }

    public static int binarySum(int[] data, int low, int high) {
        if (low > high)
            return 0;
        else if (low == high)
            return data[low];
        else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
        }
    }
}
    

