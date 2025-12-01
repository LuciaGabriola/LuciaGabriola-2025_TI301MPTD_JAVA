
package recursividad;

public class P5 {

// Returns array containing the pair of fibonacci numbers. F(n) and F(n - 1)
    public static void main(String[] args) {
        // Ejemplo 1
        ejecutarEjemplo(3, "Ejemplo 1: Fibonacci en posición 3");

        // Ejemplo 2
        ejecutarEjemplo(8, "Ejemplo 2: Fibonacci en posición 8");

        // Ejemplo 3
        ejecutarEjemplo(12, "Ejemplo 3: Fibonacci en posición 12");
    }

    // Método auxiliar para mostrar resultados
    public static void ejecutarEjemplo(int n, String descripcion) {
        System.out.println("\n" + descripcion);
        long[] resultado = fibonacciGood(n);
        System.out.println("F(" + n + ") = " + resultado[0]);
        System.out.println("F(" + (n - 1) + ") = " + resultado[1]);
    }

    public static long[] fibonacciGood(int n) {
        if (n <= 1) {
            long[] answer = {n, 0};
            return answer;
        } else {
            long[] temp = fibonacciGood(n - 1);
            long[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }
    }
}
    

