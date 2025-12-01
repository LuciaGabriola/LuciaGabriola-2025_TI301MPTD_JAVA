
package recursividad;

public class P2 {

// Reverses the contents of subarray data[low] through data[high] inclusive

    public static void main(String[] args) {
        // Ejemplo 1
        int[] numeros1 = {1, 2, 3, 4, 5};
        ejecutarEjemplo(numeros1, "Ejemplo 1");

        // Ejemplo 2
        int[] numeros2 = {9, 3, 7, 1, 4};
        ejecutarEjemplo(numeros2, "Ejemplo 2");

        // Ejemplo 3
        int[] numeros3 = {2, 5, 2, 8, 5, 2};
        ejecutarEjemplo(numeros3, "Ejemplo 3");
    }

    public static void ejecutarEjemplo(int[] arreglo, String descripcion) {
        System.out.println("\n" + descripcion);
        
        // Mostrar arreglo original
        System.out.print("Arreglo original: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        // Invertir con recursión
        reverseArray(arreglo, 0, arreglo.length - 1);

        // Mostrar arreglo invertido
        System.out.print("\nArreglo invertido: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println(); // salto de línea
    }

    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }
}

